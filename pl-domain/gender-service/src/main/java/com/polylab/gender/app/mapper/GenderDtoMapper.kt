package com.polylab.gender.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.gender.app.dto.GenderDto
import com.polylab.gender.persistence.model.Gender
import org.modelmapper.ModelMapper

@Mapper
class GenderDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<GenderDto, Gender> {
    override fun mapTo(source: GenderDto): Gender = mapper.map(source, Gender::class.java)

    override fun mapFrom(destination: Gender): GenderDto = mapper.map(destination, GenderDto::class.java)
}
