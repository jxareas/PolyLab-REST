package com.polylab.exams.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxcore.domain.model.MutableIdentifiable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NormalValuesDto implements MutableIdentifiable<Integer> {
    @Positive
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer normalValuesId;

    @Positive
    @NotNull
    private Integer examId;

    @Positive
    @NotNull
    private Integer genderId;

    @Positive
    @NotNull
    private Double highRange;

    @Positive
    @NotNull
    private Double lowRange;

    @NotNull
    private Integer status;

    @Override
    public Integer getId() {
        return normalValuesId;
    }

    @Override
    public void setId(Integer identifier) {
        normalValuesId = identifier;
    }
}
