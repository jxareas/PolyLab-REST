package com.polylab.exams.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxcore.domain.model.Identifiable;
import com.polylab.exams.common.constants.ExamConstants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExamDto implements Identifiable<Integer> {

    @Positive
    @NotNull
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer examId;

    @Positive
    @NotNull
    private Integer labAreaId;

    @Positive
    @NotNull
    private Integer methodologyId;

    @Positive
    @NotNull
    private Integer examCategoryId;

    @Positive
    @NotNull
    private Integer sampleTypeId;

    @Positive
    @NotNull
    private Integer measurementUnitId;

    @Positive
    @NotNull
    private Integer resultTypeId;

    @Size(min = ExamConstants.DESCRIPTION_MAX_LENGTH, max = ExamConstants.DESCRIPTION_MAX_LENGTH)
    @NotEmpty
    private String description;

    @Size(min = ExamConstants.SHORT_DESCRIPTION_MIN_LENGTH, max = ExamConstants.SHORT_DESCRIPTION_MAX_LENGTH)
    @NotEmpty
    private String shortDescription;

    @Size(min = ExamConstants.LIS_CODE_MIN_LENGTH, max = ExamConstants.LIS_CODE_MAX_LENGTH)
    private String lisCode;

    @Size(min = ExamConstants.COUNT_FIXED_LENGTH, max = ExamConstants.COUNT_FIXED_LENGTH)
    @NotEmpty
    private String count;

    @Size(min = ExamConstants.CONFIDENTIAL_FIXED_LENGTH, max = ExamConstants.CONFIDENTIAL_FIXED_LENGTH)
    @NotEmpty
    private String confidential;

    @Size(min = ExamConstants.CALCULATED_FIXED_LENGTH, max = ExamConstants.CALCULATED_FIXED_LENGTH)
    @NotEmpty
    private String calculated;

    @NotNull
    private Integer status;

    @Override
    public Integer getIdentifier() {
        return examId;
    }

    @Override
    public void setIdentifier(Integer identifier) {
        this.examId = identifier;
    }
}
