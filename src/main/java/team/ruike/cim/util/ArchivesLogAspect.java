package team.ruike.cim.util;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import team.ruike.cim.pojo.User;

/**
 * 操作日志记录类
 * @author 张振国
 * @version 1.0
 */
public class ArchivesLogAspect {
    private final Logger logger = Logger.getLogger(this.getClass());

    private String requestPath = null ; // 请求地址
    private String userName = "" ; // 用户名
    private Map<?,?> inputParamMap = null ; // 传入参数
    private Map<String, Object> outputParamMap = null; // 存放输出结果
    private long startTimeMillis = 0; // 开始时间
    private long endTimeMillis = 0; // 结束时间
    private User user = null;
    private HttpServletRequest request = null;

    /**
     * 前置增强
     * @param joinPoint 操作的方法
     */
    public void before(JoinPoint joinPoint){
        //System.out.println("被拦截方法调用之后调用此方法，输出此语句");
        request = getHttpServletRequest();
        user = (User)request.getSession().getAttribute("u");
        startTimeMillis = System.currentTimeMillis(); //记录方法开始执行的时间
    }

    /**
     * 后置增强
     * @param joinPoint 操作的方法
     */
    public  void after(JoinPoint joinPoint) {
        request = getHttpServletRequest();
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = null;
        try {
            targetClass = Class.forName(targetName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Method[] methods = targetClass.getMethods();
        String operationName = "";
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs!=null&&clazzs.length == arguments.length&&method.getAnnotation(ArchivesLog.class)!=null) {
                    operationName = method.getAnnotation(ArchivesLog.class).operationName();
                    break;
                }
            }
        }
        endTimeMillis = System.currentTimeMillis();
        //格式化开始时间
        String startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTimeMillis);
        //格式化结束时间
        String endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(endTimeMillis);
        System.out.println(" 操作人: "+user.getUserName()+" 操作方法: "+operationName+" 操作开始时间: "+startTime +" 操作结束时间: "+endTime);
    }

    /**
     * 获取HttpServletRequest
     * @return HttpServletRequest
     */
    private HttpServletRequest getHttpServletRequest(){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes)ra;
        return sra.getRequest();
    }

//    /**
//     * 环绕增强 暂不实现
//     * @param joinPoint 执行的方法
//     * @return
//     * @throws Throwable
//     */
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        return null;
//    }
}
