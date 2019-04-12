package team.ruike.cim.service.impl;

import org.springframework.stereotype.Service;
import team.ruike.cim.dao.ContractProductionDistributionDao;
import team.ruike.cim.dao.TemporaryProductionDistributionDao;
import team.ruike.cim.pojo.ContractProductionDistribution;
import team.ruike.cim.pojo.TemporaryProductionDistribution;
import team.ruike.cim.service.ProductionBranchService;
import team.ruike.cim.util.Pager;

import javax.annotation.Resource;
import java.util.List;
@Service("productionBranchService")
public class ProductionBranchServiceImpl implements ProductionBranchService {

    @Resource
    private ContractProductionDistributionDao contractProductionDistributionDao;
    @Resource
    private TemporaryProductionDistributionDao temporaryProductionDistributionDao;
    /**
     * 根据条件查询所有合同订单任务分配
     * @param contractProductionDistribution 合同订单任务分配类
     * @param pager 分页辅助类
     */
    @Override
    public void selectContractProductionDistribution(ContractProductionDistribution contractProductionDistribution,Pager<ContractProductionDistribution> pager) {
        int count =contractProductionDistributionDao.selectCount(contractProductionDistribution);
        pager.setTotalRecord(count);
        List<ContractProductionDistribution> contractProductionDistributionList = contractProductionDistributionDao.select(contractProductionDistribution,(pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(contractProductionDistributionList);
    }

    /**
     * 根据条件查询所有相符的临时订单任务分配
     * @param temporaryProductionDistribution 临时订单任务分配类
     * @param pager 分页辅助类
     */
    @Override
    public void selectTemporaryProductionDistribution(TemporaryProductionDistribution temporaryProductionDistribution,Pager<TemporaryProductionDistribution> pager) {
        int count = temporaryProductionDistributionDao.selectCount(temporaryProductionDistribution);
        pager.setTotalRecord(count);
        List<TemporaryProductionDistribution> temporaryProductionDistributionList=temporaryProductionDistributionDao.select(temporaryProductionDistribution,(pager.getCurrentPage() - 1) * pager.getPageSize(), pager.getPageSize());
        pager.setList(temporaryProductionDistributionList);
    }
}
