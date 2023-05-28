package com.polylab.patients.common.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PatientConstants {
    public static final String TABLE_NAME = "tbl_Paciente";

    public static final String PATIENT_ID_FIELD = "IdPaciente";
    public static final String IDENTIFICATION_ID_FIELD = "IdIdentificacion";

    public static final String IDENTIFICATION_NUMBER_FIELD = "NumIdentificacion";

    public static final String FILE_NUMBER_FIELD = "NumExpediente";

    public static final String INSS_NUMBER_FIELD = "NumINSS";

    public static final String MARITAL_STATUS_ID_FIELD = "IdEstadoCivil";

    public static final String EMAIL_FIELD = "Email";
    public static final String GENDER_ID_FIELD = "IdSexo";

    public static final String NATIONALITY_ID_FIELD = "IdNacionalidad";
    public static final String COUNTRY_BORN_IN_ID_FIELD = "IdPaisNac";

    public static final String DEPARTMENT_BORN_IN_ID_FIELD = "IdDepartamentoNac";
    public static final String MUNICIPALITY_BORN_IN_ID_FIELD = "IdMunicipioNac";

    public static final String COUNTRY_RESIDENCE_ID_FIELD = "IdPaisRes";
    public static final String DEPARTMENT_RESIDENCE_ID_FIELD = "IdDepartamentoRes";
    public static final String MUNICIPALITY_RESIDENCE_ID_FIELD = "IdMunicipioRes";

    public static final String BLOOD_TYPE_ID_FIELD = "IdTipoSangre";

    public static final String PROFESSION_ID_FIELD = "IdProfesiones";

    public static final String RELIGION_ID_FIELD = "idReligion";

    public static final String FIRST_NAME = "PrimerNombre";
    public static final int FIRST_NAME_MAX_LENGTH = 50;

    public static final String SECOND_NAME = "SegundoNombre";
    public static final int SECOND_NAME_MAX_LENGTH = 50;

    public static final String FIRST_SURNAME = "PrimerApellido";
    public static final int FIRST_SURNAME_MAX_LENGTH = 50;
    public static final String SECOND_SURNAME = "SegundoApellido";
    public static final int SECOND_SURNAME_MAX_LENGTH = 50;

    public static final String DATE_OF_BIRTH = "FechaNac";
    public static final String HOME_ADDRESS = "DireccionDomiciliar";
    public static final String HOME_PHONE = "TelefonoDomiciliar";
    public static final String MOBILE_PHONE = "TelefonoMovil";
    public static final String ACTIVE = "Activo";
    public static final int ACTIVE_FIXED_LENGTH = 1;
    public static final String PREGNANT = "Emabrazada";
    public static final String DECEASED = "Fallecido";

    public static final String STATUS = "Estado";


}
