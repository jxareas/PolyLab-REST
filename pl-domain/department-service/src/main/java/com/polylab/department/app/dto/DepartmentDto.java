package com.polylab.department.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxcore.domain.model.MutableIdentifiable;
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
public class DepartmentDto implements MutableIdentifiable<Integer> {

    @Positive
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
    @JsonIgnore
    public Integer getId() {
        return departmentId;
    }

    @Override
    public void setId(Integer identifier) {
        departmentId = identifier;
    }
}
