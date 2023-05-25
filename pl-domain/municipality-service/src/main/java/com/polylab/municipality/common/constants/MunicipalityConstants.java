package com.polylab.municipality.common.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MunicipalityConstants {
    public final String TABLE_NAME = "tbl_cat_Municipio";
    public final String MUNICIPALITY_ID_FIELD = "IdMunicipio";
    public final String DEPARTMENT_ID_FIELD = "IdDepartamento";

    public final String DESCRIPTION_FIELD = "Descripcion";
    public final String STATUS_FIELD = "Estado";

    public final int DESCRIPTION_MIN_LENGTH = 4;

    public final int DESCRIPTION_MAX_LENGTH = 50;
}
