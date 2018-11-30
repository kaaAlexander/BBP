package by.tut.kaa.alexander.bbp.deal.repository.model;

import by.tut.kaa.alexander.bbp.dealDocument.repository.model.DealDocument;
import by.tut.kaa.alexander.bbp.document.repository.model.Document;
import by.tut.kaa.alexander.bbp.party.repository.model.Party;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "deal")
public class Deal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "deal_id")
    private Long dealId;
    @Column(name = "country_import")
    private String countryImport;
    @Column(name = "country_export")
    private String countryExport;
    @Column(name = "deal_name")
    private String dealName;
    @Column(name = "deal_balance")
    private Double dealBalance;
    @Column(name = "deal_complete")
    private boolean dealStatus;
    @OneToMany(mappedBy = "deal", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Party> partyList;
    @OneToMany(mappedBy = "deal", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<DealDocument> dealDocumentListList;

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

    public List<Party> getPartyList() {
        return partyList;
    }

    public void setPartyList(List<Party> partyList) {
        this.partyList = partyList;
    }

    public List<DealDocument> getDealDocumentListList() {
        return dealDocumentListList;
    }

    public void setDealDocumentListList(List<DealDocument> dealDocumentListList) {
        this.dealDocumentListList = dealDocumentListList;
    }
}
