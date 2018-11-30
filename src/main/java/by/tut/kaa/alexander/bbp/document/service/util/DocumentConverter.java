package by.tut.kaa.alexander.bbp.document.service.util;

import by.tut.kaa.alexander.bbp.document.repository.model.Document;
import by.tut.kaa.alexander.bbp.document.service.modelDTO.DocumentDTO;
import org.springframework.stereotype.Component;

@Component
public class DocumentConverter {

    public Document convert(DocumentDTO documentDTO) {
        Document document = new Document();
        document.setDocumentId(documentDTO.getDocumentId());
        document.setDocumentLink(documentDTO.getDocumentLink());
        document.setDate(documentDTO.getDate());
        return document;
    }

    public DocumentDTO convert(Document document) {
        DocumentDTO documentDTO = new DocumentDTO();
        documentDTO.setDocumentId(document.getDocumentId());
        documentDTO.setDocumentLink(document.getDocumentLink());
        documentDTO.setUserId(document.getUser().getUserId());
        documentDTO.setDate(document.getDate());
        return documentDTO;
    }
}
