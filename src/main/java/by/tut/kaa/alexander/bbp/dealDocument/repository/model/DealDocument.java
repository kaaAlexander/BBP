package by.tut.kaa.alexander.bbp.dealDocument.repository.model;

import by.tut.kaa.alexander.bbp.deal.repository.model.Deal;
import by.tut.kaa.alexander.bbp.document.repository.model.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "deal_document")
public class DealDocument implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "deal_document_id")
    private Long dealDocumentId;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "deal_id")
    @NotNull
    private Deal deal;
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "document_id")
    @NotNull
    private Document document;

    public Long getDealDocumentId() {
        return dealDocumentId;
    }

    public void setDealDocumentId(Long dealDocumentId) {
        this.dealDocumentId = dealDocumentId;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
