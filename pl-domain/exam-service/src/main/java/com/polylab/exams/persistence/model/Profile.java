package com.polylab.exams.persistence.model;

import com.jxareas.jxelerator.domain.model.Identifiable;
import com.polylab.exams.common.constants.ProfileConstants;
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
@Table(name = ProfileConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profile implements Identifiable<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ProfileConstants.PROFILE_ID, unique = true, nullable = false)
    private Integer profileId;

    @Column(name = ProfileConstants.DESCRIPTION, nullable = false,
        length = ProfileConstants.DESCRIPTION_MAX_LENGTH)
    private String description;

    @Column(name = ProfileConstants.STATUS, nullable = false)
    private Integer status;

    @Override
    public Integer getId() {
        return profileId;
    }
}
