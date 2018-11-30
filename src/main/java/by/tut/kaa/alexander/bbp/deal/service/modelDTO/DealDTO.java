package by.tut.kaa.alexander.bbp.deal.service.modelDTO;

import java.util.List;

public class DealDTO {
    private Long dealId;
    private String countryImport;
    private String countryExport;
    private String dealName;
    private Double dealBalance;
    private boolean dealStatus;
    private List<Long> partiList;
    private List<Long> dealDocumentList;

    public Long getDealId() {
        return dealId;
    }

    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }

    public String getCountryImport() {
        return countryImport;
    }

    public void setCountryImport(String countryImport) {
        this.countryImport = countryImport;
    }

    public String getCountryExport() {
        return countryExport;
    }

    public void setCountryExport(String countryExport) {
        this.countryExport = countryExport;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public Double getDealBalance() {
        return dealBalance;
    }

    public void setDealBalance(Double dealBalance) {
        this.dealBalance = dealBalance;
    }

    public boolean isDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(boolean dealStatus) {
        this.dealStatus = dealStatus;
    }

    public List<Long> getPartiList() {
        return partiList;
    }

    public void setPartiList(List<Long> partiList) {
        this.partiList = partiList;
    }

    public List<Long> getDealDocumentList() {
        return dealDocumentList;
    }

    public void setDealDocumentList(List<Long> dealDocumentList) {
        this.dealDocumentList = dealDocumentList;
    }
}
