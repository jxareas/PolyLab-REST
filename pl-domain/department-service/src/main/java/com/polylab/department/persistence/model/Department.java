package com.polylab.department.persistence.model;

import com.jxareas.jxelerate.domain.model.Identifiable;
import com.polylab.department.common.constants.DepartmentConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = DepartmentConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Identifiable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DepartmentConstants.DEPARTMENT_ID_FIELD, unique = true, nullable = false)
    private Integer departmentId;

    @Column(name = DepartmentConstants.COUNTRY_ID_FIELD, nullable = false)
    private Integer countryId;

    @Column(name = DepartmentConstants.DESCRIPTION_FIELD,
        length = DepartmentConstants.DESCRIPTION_MAX_LENGTH,
        nullable = false)
    private String description;

    @Column(name = DepartmentConstants.STATUS_FIELD, nullable = false)
    private Integer status;

    @Override
    public Integer getId() {
        return departmentId;
    }
}
