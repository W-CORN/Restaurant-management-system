package team.ruike.cim.service;

import team.ruike.cim.pojo.TemporaryOrder;
import team.ruike.cim.pojo.TemporaryOrderTerm;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 临时订单业务接口
 *
 * @author 甄立
 * @version 1.0
 */
public interface TemporaryOrderService {

    /**
     * 查询临时订单
     *
     * @param temporaryOrder 查询条件
     * @param pager          分页辅助类
     */
    public void queryTemporaryOrder(TemporaryOrder temporaryOrder, Pager<TemporaryOrder> pager);


    /**
     * 根据ID查询临时订单
     *
     * @param temporaryOrderId 临时订单ID
     * @return 临时订单对象
     */
    public TemporaryOrder queryTemporaryOrderById(Integer temporaryOrderId);


    /**
     * 添加临时订单
     *
     * @param temporaryOrder     临时订单
     * @param temporaryOrderTerms 临时订单项
     */
    public void addTemporaryOrder(TemporaryOrder temporaryOrder, List<TemporaryOrderTerm> temporaryOrderTerms);
}
