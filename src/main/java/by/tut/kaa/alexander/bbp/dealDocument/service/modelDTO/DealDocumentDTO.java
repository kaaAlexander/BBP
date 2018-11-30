package by.tut.kaa.alexander.bbp.dealDocument.service.modelDTO;

public class DealDocumentDTO {
    private Long dealDocumentId;
    private Long dealId;
    private Long documentId;

    public Long getDealDocumentId() {
        return dealDocumentId;
    }

    public Long getDealId() {
        return dealId;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDealDocumentId(Long dealDocumentId) {
        this.dealDocumentId = dealDocumentId;
    }

    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }
}
