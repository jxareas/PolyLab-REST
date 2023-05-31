package com.polylab.profession.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxelerator.domain.model.MutableIdentifiable;
import com.polylab.profession.common.constants.ProfessionConstants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessionDto implements MutableIdentifiable<Integer> {

    @Positive
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer professionId;

    @NotEmpty
    @Size(min = ProfessionConstants.DESCRIPTION_MIN_LENGTH, max = ProfessionConstants.DESCRIPTION_MAX_LENGTH)
    private String description;

    @NotNull
    private Integer status;

    @Override
    @JsonIgnore
    public Integer getId() {
        return professionId;
    }

    @Override
    public void setId(Integer identifier) {
        professionId = identifier;
    }
}
