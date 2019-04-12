package team.ruike.cim.dao;

import org.apache.ibatis.annotations.Param;
import team.ruike.cim.pojo.ContractProgress;

import java.util.List;

/**
 * 合同订单任务进度记录接口
 *
 * @author 甄立
 * @version 1.0
 * @see #select(ContractProgress, int, int)
 * @see #selectById(Integer)
 * @see #selectCount(ContractProgress)
 * @see #update(ContractProgress)
 * @see #add(ContractProgress)
 */
public interface ContractProgressDao {


    /**
     * 新增合同订单任务进度记录
     *
     * @param contractProgress 合同订单任务进度记录实体类对象
     * @return 受影响的行数
     */
    int add(ContractProgress contractProgress);


    /**
     * 修改合同订单任务进度记录
     *
     * @param contractProgress 合同订单任务进度记录实体类对象
     * @return 受影响的行数
     */
    int update(ContractProgress contractProgress);


    /**
     * 查询合同订单任务进度记录
     *
     * @param contractProgress 合同订单任务进度记录对象(作为查询条件)
     * @param pageNo           要查询的页码
     * @param pageSize         页面数据大小
     * @return 合同订单任务进度记录对象集合
     */
    List<ContractProgress> select(@Param("contractProgress") ContractProgress contractProgress, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);


    /**
     * 查询数据总条数
     *
     * @param contractProgress 合同订单任务进度记录对象(作为查询条件)
     * @return 总条数
     */
    int selectCount(ContractProgress contractProgress);


    /**
     * 根据ID查询单个合同订单任务进度记录数据
     *
     * @param contractProgressId 合同订单任务进度记录id
     * @return 合同订单任务进度记录对象
     */
    ContractProgress selectById(Integer contractProgressId);

}
