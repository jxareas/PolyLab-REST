package com.polylab.countries.common.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CountryConstants {
    public final String TABLE_NAME = "tbl_cat_Pais";

    public final String COUNTRY_ID = "IdPais";
    public final String DESCRIPTION_FIELD = "Descripcion";
    public final String STATUS_FIELD = "Estado";

    public final int DESCRIPTION_MIN_LENGTH = 4;

    public final int DESCRIPTION_MAX_LENGTH = 50;

}
