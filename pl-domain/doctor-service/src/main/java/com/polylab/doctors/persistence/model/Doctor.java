package com.polylab.doctors.persistence.model;

import com.jxareas.jxelerator.domain.model.Identifiable;
import com.polylab.doctors.common.constants.DoctorConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = DoctorConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor implements Identifiable<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DoctorConstants.EMPLOYEE_ID, unique = true, nullable = false)
    private Integer doctorId;

    @Column(name = DoctorConstants.PROFESSION_ID, nullable = false)
    private Integer professionId;

    @Column(name = DoctorConstants.CREATION_USER_ID)
    private Integer creationUserId;

    @Column(name = DoctorConstants.DELETION_USER_ID)
    private Integer deletionUserId;

    @Column(name = DoctorConstants.MODIFICATION_USER_ID)
    private Integer modificationUserId;

    @Column(name = DoctorConstants.CREATION_DATE, columnDefinition = "DATE")
    private LocalDateTime creationDate;

    @Column(name = DoctorConstants.MODIFICATION_DATE, columnDefinition = "DATE")
    private LocalDateTime modificationDate;

    @Column(name = DoctorConstants.DELETION_DATE, columnDefinition = "DATE")
    private LocalDateTime deletionDate;

    @Column(name = DoctorConstants.RESIDENCE_MUNICIPALITY_ID, nullable = false)
    private Integer residenceMunicipalityId;

    @Column(name = DoctorConstants.BIRTH_MUNICIPALITY_ID, nullable = false)
    private Integer birthMunicipalityId;

    @Column(name = DoctorConstants.BIRTH_DEPARTMENT_ID, nullable = false)
    private Integer birthDepartmentId;

    @Column(name = DoctorConstants.RESIDENCE_DEPARTMENT_ID, nullable = false)
    private Integer residenceDepartmentId;

    @Column(name = DoctorConstants.BIRTH_COUNTRY_ID, nullable = false)
    private Integer birthCountryId;

    @Column(name = DoctorConstants.RESIDENCE_COUNTRY_ID, nullable = false)
    private Integer residenceCountryId;

    @Column(name = DoctorConstants.IDENTIFICATION_TYPE_ID, nullable = false)
    private Integer identificationTypeId;

    @Column(name = DoctorConstants.MARITAL_STATUS_ID, nullable = false)
    private Integer maritalStatusId;

    @Column(name = DoctorConstants.GENDER_ID, nullable = false)
    private Integer genderId;

    @Column(name = DoctorConstants.NATIONALITY_ID, nullable = false)
    private Integer nationalityId;

    @Column(name = DoctorConstants.IDENTIFICATION_NUMBER, nullable = false)
    private String identificationNumber;

    @Column(name = DoctorConstants.INSS_NUMBER)
    private String inssNumber;

    @Column(name = DoctorConstants.MINSA_CODE, length = DoctorConstants.MINSA_CODE_MAX_LENGTH)
    private String minsaCode;

    @Column(name = DoctorConstants.FIRST_NAME, nullable = false)
    private String firstName;

    @Column(name = DoctorConstants.MIDDLE_NAME)
    private String middleName;

    @Column(name = DoctorConstants.LAST_NAME, nullable = false)
    private String lastName;

    @Column(name = DoctorConstants.SECOND_LAST_NAME)
    private String secondLastName;

    @Column(name = DoctorConstants.BIRTH_DATE, nullable = false)
    private LocalDate birthDate;

    @Column(name = DoctorConstants.AGE_AT_ENTRY, nullable = false)
    private String ageAtEntry;

    @Column(name = DoctorConstants.EMAIL)
    private String email;

    @Column(name = DoctorConstants.HOME_ADDRESS, nullable = false)
    private String homeAddress;

    @Column(name = DoctorConstants.HOME_PHONE)
    private String homePhone;

    @Column(name = DoctorConstants.MOBILE_PHONE)
    private String mobilePhone;

    @Column(name = DoctorConstants.CONTRACT_DATE)
    private LocalDate contractDate;

    @Column(name = DoctorConstants.PHOTO_URL)
    private String photoUrl;

    @Column(name = DoctorConstants.ACTIVE, length = DoctorConstants.ACTIVE_FIXED_LENGTH, nullable = false)
    private String active;

    @Column(name = DoctorConstants.STATUS, nullable = false)
    private Integer status;

    @Override
    public Integer getId() {
        return doctorId;
    }
}
