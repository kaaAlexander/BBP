package by.tut.kaa.alexander.bbp.document.service.serviceImpl;

import by.tut.kaa.alexander.bbp.document.repository.DocumentRepository;
import by.tut.kaa.alexander.bbp.document.repository.model.Document;
import by.tut.kaa.alexander.bbp.document.service.DocumentService;
import by.tut.kaa.alexander.bbp.document.service.modelDTO.DocumentDTO;
import by.tut.kaa.alexander.bbp.document.service.util.DocumentConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentConverter documentConverter;

    @Autowired
    DocumentRepository documentRepository;

    public Long save(DocumentDTO documentDTO) {
        Document document = documentConverter.convert(documentDTO);
        documentRepository.save(document);
        return document.getDocumentId();
    }
}
