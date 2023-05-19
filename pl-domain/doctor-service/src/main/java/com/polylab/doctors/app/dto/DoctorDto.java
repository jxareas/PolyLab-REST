package com.polylab.doctors.app.dto;

import com.jxareas.jxcore.domain.model.Identifiable;
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
public class DoctorDto implements Identifiable<Integer> {

    @Positive
    @NotNull
    private Integer doctorId;

    @Positive
    @NotNull
    private Integer professionId;

    private Integer creationUserId;

    private Integer deletionUserId;

    private Integer modificationUserId;

    private LocalDate creationDate;

    private LocalDate modificationDate;

    private LocalDate deletionDate;

    @Positive
    private Integer residenceMunicipalityId;

    @Positive
    private Integer birthMunicipalityId;

    @Positive
    private Integer birthDepartmentId;

    @Positive
    private Integer residenceDepartmentId;

    @Positive
    private Integer birthCountryId;

    @Positive
    private Integer residenceCountryId;

    @Positive
    private Integer identificationTypeId;

    @Positive
    private Integer maritalStatusId;

    @Positive
    private Integer genderId;

    @Positive
    private Integer nationalityId;

    @NotBlank
    private String identificationNumber;

    @NotBlank
    private String inssNumber;

    @NotBlank
    private String minsaCode;

    @NotBlank
    private String firstName;

    private String middleName;

    @NotBlank
    private String lastName;

    private String secondLastName;

    @NotNull
    private LocalDate birthDate;

    @NotBlank
    private String ageAtEntry;

    @NotBlank
    private String email;

    @NotBlank
    private String homeAddress;

    @NotBlank
    private String homePhone;

    @NotBlank
    private String mobilePhone;

    @NotNull
    private LocalDate contractDate;

    private String photoUrl;

    @NotBlank
    private String active;

    @NotNull
    private Integer status;

    @Override
    public Integer getIdentifier() {
        return doctorId;
    }

    @Override
    public void setIdentifier(Integer identifier) {
        doctorId = identifier;
    }
}