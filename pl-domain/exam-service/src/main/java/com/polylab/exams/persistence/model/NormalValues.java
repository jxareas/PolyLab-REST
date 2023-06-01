package com.polylab.exams.persistence.model;

import com.jxareas.efficax.domain.model.Identifiable;
import com.polylab.exams.common.constants.NormalValueConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = NormalValueConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NormalValues implements Identifiable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = NormalValueConstants.NORMAL_VALUES_ID, unique = true, nullable = false)
    private Integer normalValuesId;

    @Column(name = NormalValueConstants.EXAM_ID, nullable = false)
    private Integer examId;

    @Column(name = NormalValueConstants.GENDER_ID, nullable = false)
    private Integer genderId;

    @Column(name = NormalValueConstants.HIGH_RANGE, nullable = false)
    private Double highRange;

    @Column(name = NormalValueConstants.LOW_RANGE, nullable = false)
    private Double lowRange;

    @Column(name = NormalValueConstants.STATUS, nullable = false)
    private Integer status;

    @Override
    public Integer getId() {
        return normalValuesId;
    }


}
