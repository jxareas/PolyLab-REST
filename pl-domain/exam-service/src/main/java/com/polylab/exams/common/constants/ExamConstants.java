package com.polylab.exams.common.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ExamConstants {

    public final String TABLE_NAME = "tbl_Examenes";
    public final String EXAM_ID_FIELD = "IdExamen";
    public final String LAB_AREA_ID_FIELD = "IdAreaLabServicio";

    public final String METHODOLOGY_ID_FIELD = "IdMetodologia";

    public final String EXAM_CATEGORY_ID_FIELD = "IdCategoriaExamenes";

    public final String SAMPLE_TYPE_ID_FIELD = "IdTipoMuestra";

    public final String MEASUREMENT_UNIT_ID_FIELD = "IdUnidadMedidas";

    public final String RESULT_TYPE_ID_FIELD = "IdTipoResultado";

    public final String DESCRIPTION_FIELD = "Descripcion";
    public final int DESCRIPTION_MIN_LENGTH = 30;
    public final int DESCRIPTION_MAX_LENGTH = 50;

    public final String SHORT_DESCRIPTION_FIELD = "DescripcionCorta";
    public final int SHORT_DESCRIPTION_MIN_LENGTH = 10;
    public final int SHORT_DESCRIPTION_MAX_LENGTH = 25;

    public final String LIS_CODE_FIELD = "LisCode";

    public final int LIS_CODE_MIN_LENGTH = 2;
    public final int LIS_CODE_MAX_LENGTH = 10;

    public final String COUNT_FIELD = "Conteo";
    public final int COUNT_FIXED_LENGTH = 1;

    public final String CONFIDENTIAL_FIELD = "Confidencial";
    public final int CONFIDENTIAL_FIXED_LENGTH = 1;
    public final String CALCULATED_FIELD = "Calculado";
    public final int CALCULATED_FIXED_LENGTH = 1;
    public final String STATUS_FIELD = "Estado";

}
