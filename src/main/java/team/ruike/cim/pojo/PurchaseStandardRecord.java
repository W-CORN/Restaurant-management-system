package team.ruike.cim.pojo;


import java.io.Serializable;


public class PurchaseStandardRecord implements Serializable {

    private static final long serialVersionUID = -668236938594625481L;

    private Integer purchaseStandardRecordId;



    private Purchase purchase;



    private Materiel materiel;



    private Integer standardAScore;

    private Integer standardBScore;

    private Integer standardCScore;

    private String conclusion;

    private Integer status;

    public Purchase getPurchase() {

        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Integer getPurchaseStandardRecordId() {
        return purchaseStandardRecordId;
    }

    public void setPurchaseStandardRecordId(Integer purchaseStandardRecordId) {
        this.purchaseStandardRecordId = purchaseStandardRecordId;
    }

    public Integer getStandardAScore() {
        return standardAScore;
    }

    public void setStandardAScore(Integer standardAScore) {
        this.standardAScore = standardAScore;
    }


    public Integer getStandardBScore() {
        return standardBScore;
    }

    public void setStandardBScore(Integer standardBScore) {
        this.standardBScore = standardBScore;
    }


    public Integer getStandardCScore() {
        return standardCScore;
    }

    public void setStandardCScore(Integer standardCScore) {
        this.standardCScore = standardCScore;
    }


    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

/*
    public PurchaseStandard getPurchaseStandard() {
        return purchaseStandard;
    }

    public void setPurchaseStandard(PurchaseStandard purchaseStandard) {
        this.purchaseStandard = purchaseStandard;
    }
*/

}
