package com.polylab.municipality.persistence.model;

import com.jxareas.jxelerator.domain.model.Identifiable;
import com.polylab.municipality.common.constants.MunicipalityConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = MunicipalityConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Municipality implements Identifiable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = MunicipalityConstants.MUNICIPALITY_ID_FIELD, unique = true, nullable = false)
    private Integer municipalityId;

    @Column(name = MunicipalityConstants.DEPARTMENT_ID_FIELD, nullable = false)
    private Integer departmentId;

    @Column(name = MunicipalityConstants.DESCRIPTION_FIELD,
        length = MunicipalityConstants.DESCRIPTION_MAX_LENGTH,
        nullable = false)
    private String description;

    @Column(name = MunicipalityConstants.STATUS_FIELD, nullable = false)
    private Integer status;

    @Override
    public Integer getId() {
        return municipalityId;
    }
}
