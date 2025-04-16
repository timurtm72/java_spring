package ru.maxima.school.projectmaximaedo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;

public class DocumentTemplateDto {
    /**
     * ID
     */
    private Long id;
    /** Название */
    @NotBlank(message = "Название не может быть пустым")
    private String name;

    /** Версия */
    @Positive(message = "Номер версии должен быть положительным значением")
    private Integer version;
    /** Ссылка на поля документа*/
    private List<DocumentFieldDto> templateFields;

    @NotNull(message = "Поля шаблона не может быть пустым")
    private List<Integer> templateFieldNumbers;
    public DocumentTemplateDto() {
    }

    public DocumentTemplateDto(Long id, String name, Integer version, List<DocumentFieldDto> templateFieldsDto,
                               List<Integer> templateFieldNumbers) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.templateFields = templateFieldsDto;
        this.templateFieldNumbers = templateFieldNumbers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<DocumentFieldDto> getTemplateFields() {
        return templateFields;
    }

    public void setTemplateFields(List<DocumentFieldDto> templateFields) {
        this.templateFields = templateFields;
    }

    public List<Integer> getTemplateFieldNumbers() {
        return templateFieldNumbers;
    }

    public void setTemplateFieldNumbers(List<Integer> templateFieldNumbers) {
        this.templateFieldNumbers = templateFieldNumbers;
    }
}
