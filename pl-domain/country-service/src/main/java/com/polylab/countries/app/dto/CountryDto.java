package com.polylab.countries.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxcore.model.Identifiable;
import com.polylab.countries.common.constants.CountryConstants;
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
public class CountryDto implements Identifiable<Integer> {
    @Positive
    @NotNull
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer countryId;

    @NotEmpty
    @Size(min = CountryConstants.DESCRIPTION_MIN_LENGTH, max = CountryConstants.DESCRIPTION_MAX_LENGTH)
    private String description;

    @NotNull
    private Integer status;

    @Override
    @JsonIgnore
    public Integer getId() {
        return countryId;
    }

    @Override
    public void setId(Integer identifier) {
        countryId = identifier;
    }
}
