package team.ruike.cim.dao;


import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ContractProductionDistribution;

import java.util.List;

/**
 * 合同订单生产任务分配表数据访问接口
 *
 * @author 甄立
 * @author 华中昊
 * @version 1.0
 * @see #selectById(Integer)
 * @see #select(ContractProductionDistribution, int, int)
 * @see #selectCount(ContractProductionDistribution)
 * @see #add(ContractProductionDistribution)
 * @see #update(ContractProductionDistribution)
 */
public interface ContractProductionDistributionDao {


    /**
     * 新增合同订单生产任务分配
     *
     * @param contractProductionDistribution 合同订单生产任务分配实体类对象
     * @return 受影响的行数
     */
    int add(ContractProductionDistribution contractProductionDistribution);


    /**
     * 修改合同订单生产任务分配
     *
     * @param contractProductionDistribution 合同订单生产任务分配实体类对象
     * @return 受影响的行数
     */
    int update(ContractProductionDistribution contractProductionDistribution);


    /**
     * 查询合同订单生产任务分配
     *
     * @param contractProductionDistribution 合同订单生产任务分配对象(作为查询条件)
     * @param pageNo                         要查询的页码
     * @param pageSize                       页面数据大小
     * @return 合同订单生产任务分配对象集合
     */
    List<ContractProductionDistribution> select(@Param("contractProductionDistribution") ContractProductionDistribution contractProductionDistribution, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);


    /**
     * 查询数据总条数
     *
     * @param contractProductionDistribution 合同订单生产任务分配对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ContractProductionDistribution contractProductionDistribution);


    /**
     * 根据ID查询单个合同订单生产任务分配数据
     *
     * @param contractProductionDistributionId 合同订单生产任务分配id
     * @return 合同订单生产任务分配对象
     */
    ContractProductionDistribution selectById(Integer contractProductionDistributionId);


}
