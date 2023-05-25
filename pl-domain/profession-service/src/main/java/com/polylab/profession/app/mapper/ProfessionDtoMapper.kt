package com.polylab.profession.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.profession.app.dto.ProfessionDto
import com.polylab.profession.persistence.model.Profession
import org.modelmapper.ModelMapper

@Mapper
class ProfessionDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<ProfessionDto, Profession> {
    override fun mapTo(source: ProfessionDto): Profession = mapper.map(source, Profession::class.java)

    override fun mapFrom(destination: Profession): ProfessionDto = mapper.map(destination, ProfessionDto::class.java)
}
