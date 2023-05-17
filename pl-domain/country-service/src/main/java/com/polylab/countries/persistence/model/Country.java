package com.polylab.countries.persistence.model;

import com.polylab.countries.common.constants.CountryConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = CountryConstants.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = CountryConstants.COUNTRY_ID_FIELD, nullable = false)
    private Integer countryId;

    @Column(name = CountryConstants.DESCRIPTION_FIELD,
        length = CountryConstants.DESCRIPTION_MAX_LENGTH,
        nullable = false)
    private String description;

    @Column(name = CountryConstants.STATUS_FIELD, nullable = false)
    private Integer status;
}
