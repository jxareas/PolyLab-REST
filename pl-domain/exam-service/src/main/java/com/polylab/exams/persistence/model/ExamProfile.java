package com.polylab.exams.persistence.model;

import com.jxareas.jxcore.domain.model.Identifiable;
import com.polylab.exams.common.constants.ExamProfileConstants;
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
@Table(name = ExamProfileConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExamProfile implements Identifiable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ExamProfileConstants.EXAM_PROFILE_ID, unique = true, nullable = false)
    private Integer examProfileId;

    @Column(name = ExamProfileConstants.PROFILE_ID, nullable = false)
    private Integer profileId;

    @Column(name = ExamProfileConstants.EXAM_ID, nullable = false)
    private Integer examId;

    @Override
    public Integer getId() {
        return examProfileId;
    }
}
