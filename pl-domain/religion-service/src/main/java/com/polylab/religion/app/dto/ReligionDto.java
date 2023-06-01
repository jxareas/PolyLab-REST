package com.polylab.religion.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.efficax.domain.model.MutableIdentifiable;
import com.polylab.religion.common.ReligionConstants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReligionDto implements MutableIdentifiable<Integer> {

    @Positive
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer religionId;

    @NotEmpty
    @Size(min = ReligionConstants.DESCRIPTION_MIN_LENGTH, max = ReligionConstants.DESCRIPTION_MAX_LENGTH)
    private String description;

    @Override
    @JsonIgnore
    public Integer getId() {
        return religionId;
    }

    @Override
    public void setId(Integer identifier) {
        religionId = identifier;
    }

}
