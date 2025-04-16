package ru.maxima.school.projectmaximaedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxima.school.projectmaximaedo.model.DocumentTemplate;

import java.util.List;
import java.util.Optional;

public interface DocumentTemplateRepository extends JpaRepository<DocumentTemplate, Long> {
  List<DocumentTemplate> findAllByIsRemovedIsFalseOrderByIdAsc();
  Optional<DocumentTemplate> findDocumentTemplateByIdAndIsRemovedIsFalse(Long id);
  Boolean existsByIdAndIsRemovedIsFalse(Long id);
}
