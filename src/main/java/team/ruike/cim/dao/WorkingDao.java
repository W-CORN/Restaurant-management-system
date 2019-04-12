package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.Working;

import java.util.List;

/**
 * @author 孙天奇
 * @author 孙天奇
 * @version 1.0
 */
public interface WorkingDao {
    /**
     * 新增工序
     *
     * @param working 工序表对象
     * @return 受影响行数
     */
    int add(Working working);

    /**
     * 修改工序
     *
     * @param working 工序表对象
     * @return 受影响行数
     */
    int update(Working working);

    /**
     * 查询工序
     *
     * @param working  工序表对象
     * @param pageNo   要查询的页码
     * @param pageSize 页面数据大小
     * @return 订单对象集合
     */
    List<Working> select(@Param("working") Working working, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 查询数据总条数
     *
     * @param working 合同订单对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(Working working);

    /**
     * 根据ID查询单个合同订单数据
     *
     * @param workingId 合同订单id
     * @return 合同订单对象
     */
    Working selectById(Integer workingId);
}
