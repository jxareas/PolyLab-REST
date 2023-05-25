package com.polylab.department.common.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DepartmentConstants {

    public final String TABLE_NAME = "tbl_cat_Departamento";
    public final String DEPARTMENT_ID_FIELD = "IdDepartamento";
    public final String COUNTRY_ID_FIELD = "IdPais";

    public final String DESCRIPTION_FIELD = "Descripcion";
    public final String STATUS_FIELD = "Estado";

    public final int DESCRIPTION_MIN_LENGTH = 3;

    public final int DESCRIPTION_MAX_LENGTH = 50;


}
