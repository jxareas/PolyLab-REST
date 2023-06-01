package com.polylab.patients.persistence.model;

import com.jxareas.efficax.domain.model.Identifiable;
import com.polylab.patients.common.constants.PatientConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = PatientConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Identifiable<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = PatientConstants.PATIENT_ID_FIELD, unique = true, nullable = false)
    private Integer patientId;

    @Column(name = PatientConstants.IDENTIFICATION_ID_FIELD, nullable = false)
    private Integer identificationId;

    @Column(name = PatientConstants.IDENTIFICATION_NUMBER_FIELD, nullable = false)
    private String identificationNumber;

    @Column(name = PatientConstants.FILE_NUMBER_FIELD, nullable = false)
    private Integer fileNumber;

    @Column(name = PatientConstants.INSS_NUMBER_FIELD, nullable = false)
    private String inssNumber;

    @Column(name = PatientConstants.MARITAL_STATUS_ID_FIELD, nullable = false)
    private Integer maritalStatusId;

    @Column(name = PatientConstants.EMAIL_FIELD)
    private String email;

    @Column(name = PatientConstants.GENDER_ID_FIELD, nullable = false)
    private Integer genderId;

    @Column(name = PatientConstants.NATIONALITY_ID_FIELD, nullable = false)
    private Integer nationalityId;

    @Column(name = PatientConstants.COUNTRY_BORN_IN_ID_FIELD, nullable = false)
    private Integer countryBornInId;

    @Column(name = PatientConstants.DEPARTMENT_BORN_IN_ID_FIELD, nullable = false)
    private Integer departmentBornInId;

    @Column(name = PatientConstants.MUNICIPALITY_BORN_IN_ID_FIELD, nullable = false)
    private Integer municipalityBornInId;

    @Column(name = PatientConstants.COUNTRY_RESIDENCE_ID_FIELD, nullable = false)
    private Integer countryResidenceId;

    @Column(name = PatientConstants.DEPARTMENT_RESIDENCE_ID_FIELD, nullable = false)
    private Integer departmentResidenceId;

    @Column(name = PatientConstants.MUNICIPALITY_RESIDENCE_ID_FIELD, nullable = false)
    private Integer municipalityResidenceId;

    @Column(name = PatientConstants.BLOOD_TYPE_ID_FIELD, nullable = false)
    private Integer bloodTypeId;

    @Column(name = PatientConstants.PROFESSION_ID_FIELD, nullable = false)
    private Integer professionId;

    @Column(name = PatientConstants.RELIGION_ID_FIELD, nullable = false)
    private Integer religionId;

    @Column(name = PatientConstants.FIRST_NAME, length = PatientConstants.FIRST_NAME_MAX_LENGTH, nullable = false)
    private String firstName;

    @Column(name = PatientConstants.SECOND_NAME, length = PatientConstants.SECOND_NAME_MAX_LENGTH)
    private String secondName;

    @Column(name = PatientConstants.FIRST_SURNAME, length = PatientConstants.FIRST_SURNAME_MAX_LENGTH, nullable = false)
    private String firstSurname;

    @Column(name = PatientConstants.SECOND_SURNAME, length = PatientConstants.SECOND_SURNAME_MAX_LENGTH)
    private String secondSurname;

    @Column(name = PatientConstants.DATE_OF_BIRTH)
    private LocalDate dateOfBirth;

    @Column(name = PatientConstants.HOME_ADDRESS)
    private String homeAddress;

    @Column(name = PatientConstants.HOME_PHONE)
    private String homePhone;

    @Column(name = PatientConstants.MOBILE_PHONE)
    private String mobilePhone;

    @Column(name = PatientConstants.ACTIVE, length = PatientConstants.ACTIVE_FIXED_LENGTH, nullable = false)
    private String active;

    @Column(name = PatientConstants.PREGNANT)
    private String pregnant;

    @Column(name = PatientConstants.DECEASED)
    private String deceased;

    @Column(name = PatientConstants.STATUS, nullable = false)
    private Integer status;

    @Override
    public Integer getId() {
        return patientId;
    }
}


