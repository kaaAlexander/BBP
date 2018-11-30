package by.tut.kaa.alexander.bbp.document.repository;

import by.tut.kaa.alexander.bbp.document.repository.model.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, Long> {
}
