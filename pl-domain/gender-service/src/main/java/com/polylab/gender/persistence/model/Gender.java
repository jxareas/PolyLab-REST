package com.polylab.gender.persistence.model;

import com.polylab.gender.common.constants.GenderConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = GenderConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = GenderConstants.GENDER_ID_FIELD, unique = true, nullable = false)
    private Integer genderId;

    @Column(name = GenderConstants.DESCRIPTION_FIELD,
        length = GenderConstants.DESCRIPTION_MAX_LENGTH,
        nullable = false)
    private String description;

}
