package com.polylab.countries.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.countries.app.dto.CountryDto
import com.polylab.countries.persistence.model.Country
import org.modelmapper.ModelMapper

@Mapper
class CountryDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<CountryDto, Country> {
    override fun mapTo(source: CountryDto): Country = mapper.map(source, Country::class.java)

    override fun mapFrom(destination: Country): CountryDto = mapper.map(destination, CountryDto::class.java)

}
