package com.cjz.welink.backend.domain;


import javax.persistence.*;

@Entity
@Table(name = "contract")
public class ContractEntity {

    @Id
 //   @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Contract")
    private String Contract="-";

    @Column(name = "LeadTime")
    private Integer LeadTime;

    @Column(name = "ReleaseTime")
    private String ReleaseTime;

    @Column(name = "PickUpDate")
    private String PickUpDate;

    @Column(name = "StartDate")
    private String StartDate;

    @Column(name = "EndDate")
    private String EndDate;

    @Column(name = "PackingDate")
    private String PackingDate;

    @Column(name = "DeliveryDate")
    private String DeliveryDate;

    @Column(name = "status")
    private String status="-";

    @Column(name = "Estmate_StartDate")
    private String Estmate_StartDate="-";

    @Column(name = "Estmate_EndDate")
    private String Estmate_EndDate="-";

    @Override
    public String toString() {
        return "ContractEntity{" +
                "Contract='" + Contract + '\'' +
                ", LeadTime=" + LeadTime +
                ", ReleaseTime='" + ReleaseTime + '\'' +
                ", PickUpDate='" + PickUpDate + '\'' +
                ", StartDate='" + StartDate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                ", PackingDate='" + PackingDate + '\'' +
                ", DeliveryDate='" + DeliveryDate + '\'' +
                ", status='" + status + '\'' +
                ", Estmate_StartDate='" + Estmate_StartDate + '\'' +
                ", Estmate_EndDate='" + Estmate_EndDate + '\'' +
                '}';
    }

    public String getContract() {
        return Contract;
    }

    public void setContract(String contract) {
        Contract = contract;
    }

    public Integer getLeadTime() {
        return LeadTime;
    }

    public void setLeadTime(Integer leadTime) {
        LeadTime = leadTime;
    }

    public String getReleaseTime() {
        return ReleaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        ReleaseTime = releaseTime;
    }

    public String getPickUpDate() {
        return PickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        PickUpDate = pickUpDate;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getPackingDate() {
        return PackingDate;
    }

    public void setPackingDate(String packingDate) {
        PackingDate = packingDate;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEstmate_StartDate() {
        return Estmate_StartDate;
    }

    public void setEstmate_StartDate(String estmate_StartDate) {
        Estmate_StartDate = estmate_StartDate;
    }

    public String getEstmate_EndDate() {
        return Estmate_EndDate;
    }

    public void setEstmate_EndDate(String estmate_EndDate) {
        Estmate_EndDate = estmate_EndDate;
    }
}
