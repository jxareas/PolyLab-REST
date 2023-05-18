package com.polylab.patients.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxcore.model.Identifiable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto implements Identifiable<Integer> {
    @Positive
    @NotNull
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer patientId;

    @Positive
    @NotNull
    private Integer identificationId;

    @NotBlank
    private String identificationNumber;

    @NotBlank
    private String fileNumber;

    private String inssNumber;

    @Positive
    @NotNull
    private Integer maritalStatusId;

    private String email;

    @Positive
    @NotNull
    private Integer genderId;

    @Positive
    @NotNull
    private Integer nationalityId;

    @Positive
    @NotNull
    private Integer countryBornInId;

    @Positive
    @NotNull
    private Integer departmentBornInId;

    @Positive
    @NotNull
    private Integer municipalityBornInId;

    @Positive
    @NotNull
    private Integer countryResidenceId;

    @Positive
    @NotNull
    private Integer departmentResidenceId;

    @Positive
    @NotNull
    private Integer municipalityResidenceId;

    @Positive
    @NotNull
    private Integer bloodTypeId;

    @Positive
    @NotNull
    private Integer professionId;

    @Positive
    @NotNull
    private Integer religionId;

    @NotBlank
    private String firstName;

    private String secondName;

    @NotBlank
    private String firstSurname;

    private String secondSurname;

    @NotNull
    private LocalDate dateOfBirth;

    @NotBlank
    private String homeAddress;

    private String homePhone;

    private String mobilePhone;

    private Boolean active;

    private Boolean pregnant;

    private Boolean deceased;

    private Integer status;

    @Override
    public Integer getIdentifier() {
        return patientId;
    }

    @Override
    public void setIdentifier(Integer identifier) {
        this.patientId = identifier;
    }
}

