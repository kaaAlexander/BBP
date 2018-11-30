package by.tut.kaa.alexander.bbp.dealDocument.service.util;

import by.tut.kaa.alexander.bbp.dealDocument.repository.model.DealDocument;
import by.tut.kaa.alexander.bbp.dealDocument.service.modelDTO.DealDocumentDTO;
import org.springframework.stereotype.Component;

@Component
public class DealDocumentConverter {

    public DealDocumentDTO convert(DealDocument dealDocument) {
        DealDocumentDTO dealDocumentDTO = new DealDocumentDTO();
        dealDocumentDTO.setDealId(dealDocument.getDeal().getDealId());
        dealDocumentDTO.setDocumentId(dealDocument.getDocument().getDocumentId());
        dealDocumentDTO.setDealDocumentId(dealDocument.getDealDocumentId());
        return dealDocumentDTO;
    }

    public DealDocument convert(DealDocumentDTO dealDocumentDTO) {
        DealDocument dealDocument = new DealDocument();
        dealDocument.setDealDocumentId(dealDocumentDTO.getDealDocumentId());
        return dealDocument;
    }
}
