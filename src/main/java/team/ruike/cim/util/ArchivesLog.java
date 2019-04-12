package team.ruike.cim.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 操作日志自定义注解
 *@author 张振国
 *@version 1.0
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArchivesLog {
    /** 要执行的操作类型比如：add操作 **/
    String operationType() default "";
    /** 要执行的具体操作比如：添加用户 **/
    String operationName() default "";

}
