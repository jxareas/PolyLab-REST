package com.polylab.department.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxcore.domain.model.Identifiable;
import com.polylab.department.common.constants.DepartmentConstants;
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
public class DepartmentDto implements Identifiable<Integer> {
    @Positive
    @NotNull
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer departmentId;

    @Positive
    @NotNull
    private Integer countryId;

    @NotEmpty
    @Size(min = DepartmentConstants.DESCRIPTION_MIN_LENGTH, max = DepartmentConstants.DESCRIPTION_MAX_LENGTH)
    private String description;

    @NotNull
    private Integer status;

    @Override
    public Integer getIdentifier() {
        return departmentId;
    }

    @Override
    public void setIdentifier(Integer identifier) {
        departmentId = identifier;
    }
}
