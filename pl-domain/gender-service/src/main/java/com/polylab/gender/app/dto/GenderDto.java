package com.polylab.gender.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxcore.domain.model.Identifiable;
import com.polylab.gender.common.constants.GenderConstants;
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
public class GenderDto implements Identifiable<Integer> {

    @Positive
    @NotNull
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer genderId;

    @NotEmpty
    @Size(min = GenderConstants.DESCRIPTION_MIN_LENGTH, max = GenderConstants.DESCRIPTION_MAX_LENGTH)
    private String description;

    @Override
    public Integer getIdentifier() {
        return genderId;
    }

    @Override
    public void setIdentifier(Integer identifier) {
        genderId = identifier;
    }
}
