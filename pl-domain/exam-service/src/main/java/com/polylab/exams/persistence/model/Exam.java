package com.polylab.exams.persistence.model;

import com.jxareas.efficax.domain.model.Identifiable;
import com.polylab.exams.common.constants.ExamConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = ExamConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exam implements Identifiable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ExamConstants.EXAM_ID_FIELD, unique = true, nullable = false)
    private Integer examId;

    @Column(name = ExamConstants.LAB_AREA_ID_FIELD, nullable = false)
    private Integer labAreaId;

    @Column(name = ExamConstants.METHODOLOGY_ID_FIELD, nullable = false)
    private Integer methodologyId;

    @Column(name = ExamConstants.EXAM_CATEGORY_ID_FIELD, nullable = false)
    private Integer examCategoryId;

    @Column(name = ExamConstants.SAMPLE_TYPE_ID_FIELD, nullable = false)
    private Integer sampleTypeId;

    @Column(name = ExamConstants.MEASUREMENT_UNIT_ID_FIELD, nullable = false)
    private Integer measurementUnitId;

    @Column(name = ExamConstants.RESULT_TYPE_ID_FIELD, nullable = false)
    private Integer resultTypeId;

    @Column(name = ExamConstants.DESCRIPTION_FIELD, length = ExamConstants.DESCRIPTION_MAX_LENGTH, nullable = false)
    private String description;

    @Column(name = ExamConstants.SHORT_DESCRIPTION_FIELD, length = ExamConstants.SHORT_DESCRIPTION_MAX_LENGTH, nullable = false)
    private String shortDescription;

    @Column(name = ExamConstants.LIS_CODE_FIELD, length = ExamConstants.LIS_CODE_MAX_LENGTH)
    private String lisCode;

    @Column(name = ExamConstants.COUNT_FIELD, length = ExamConstants.COUNT_FIXED_LENGTH, nullable = false)
    private String count;

    @Column(name = ExamConstants.CONFIDENTIAL_FIELD, length = ExamConstants.CONFIDENTIAL_FIXED_LENGTH, nullable = false)
    private String confidential;

    @Column(name = ExamConstants.CALCULATED_FIELD, length = ExamConstants.CALCULATED_FIXED_LENGTH, nullable = false)
    private String calculated;

    @Column(name = ExamConstants.STATUS_FIELD, nullable = false)
    private Integer status;

    @Override
    public Integer getId() {
        return examId;
    }
}
