package com.polylab.patients.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jxareas.jxelerate.domain.model.MutableIdentifiable;
import com.polylab.patients.common.constants.PatientConstants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto implements MutableIdentifiable<Integer> {
    @Positive
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer patientId;

    @Positive
    @NotNull
    private Integer identificationId;

    @NotBlank
    private String identificationNumber;

    @NotNull
    private Integer fileNumber;

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

    @Size(min = PatientConstants.ACTIVE_FIXED_LENGTH, max = PatientConstants.ACTIVE_FIXED_LENGTH)
    private String active;

    private String pregnant;

    private String deceased;

    private Integer status;

    @Override
    @JsonIgnore
    public Integer getId() {
        return patientId;
    }

    @Override
    public void setId(Integer identifier) {
        this.patientId = identifier;
    }
}

