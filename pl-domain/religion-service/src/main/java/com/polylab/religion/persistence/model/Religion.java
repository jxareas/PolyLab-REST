package com.polylab.religion.persistence.model;

import com.jxareas.jxcore.domain.model.Identifiable;
import com.polylab.religion.common.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = ReligionConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Religion implements Identifiable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ReligionConstants.RELIGION_ID, unique = true, nullable = false)
    private Integer religionId;

    @Column(name = ReligionConstants.DESCRIPTION_FIELD,
        length = ReligionConstants.DESCRIPTION_MAX_LENGTH,
        nullable = false)
    private String description;

    @Override
    public Integer getId() {
        return religionId;
    }
}
