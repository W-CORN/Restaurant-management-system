package team.ruike.cim.service;

import team.ruike.cim.pojo.EverydayPurchasingPlan;
import team.ruike.cim.pojo.Purchase;
import team.ruike.cim.pojo.StagePurchasingPlan;
import team.ruike.cim.pojo.StagePurchasingPlanTerm;
import team.ruike.cim.util.Pager;

import java.util.List;


public interface PurchaseService {

    void getStagePurchasingPlans(StagePurchasingPlan stagePurchasingPlan, Pager<StagePurchasingPlan> pager);


    StagePurchasingPlan getStagePurchasingPlan(Integer stagePurchasingPlanId);


    void updateStagePurchasingPlan(StagePurchasingPlan stagePurchasingPlan, List<StagePurchasingPlanTerm> items);


    void getPurchase(Purchase purchase, Pager<Purchase> pager);


    void addStagePurchasingPlan(StagePurchasingPlan stagePurchasingPlan);


    void delStagePurchasingPlan(Integer stagePurchasingPlanId);


    void getEverydayPurchasePlans(EverydayPurchasingPlan everydayPurchasingPlan, Pager<EverydayPurchasingPlan> pager);
}
