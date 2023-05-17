package com.polylab.municipality.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxcore.dto.Identifiable;
import com.polylab.municipality.common.constants.MunicipalityConstants;
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
public class MunicipalityDto implements Identifiable<Integer> {

    @Positive
    @NotNull
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer municipalityId;

    @Positive
    @NotNull
    private Integer departmentId;

    @NotEmpty
    @Size(min = MunicipalityConstants.DESCRIPTION_MIN_LENGTH, max = MunicipalityConstants.DESCRIPTION_MAX_LENGTH)
    private String description;

    @NotNull
    private Integer status;

    @Override
    public Integer getId() {
        return municipalityId;
    }
}
