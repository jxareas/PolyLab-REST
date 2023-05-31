package com.polylab.profession.persistence.model;

import com.jxareas.jxelerate.domain.model.Identifiable;
import com.polylab.profession.common.constants.ProfessionConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = ProfessionConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profession implements Identifiable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ProfessionConstants.PROFESSION_ID, unique = true, nullable = false)
    private Integer professionId;

    @Column(name = ProfessionConstants.DESCRIPTION_FIELD,
        length = ProfessionConstants.DESCRIPTION_MAX_LENGTH,
        nullable = false)
    private String description;

    @Column(name = ProfessionConstants.STATUS_FIELD, nullable = false)
    private Integer status;


    @Override
    public Integer getId() {
        return professionId;
    }
}
