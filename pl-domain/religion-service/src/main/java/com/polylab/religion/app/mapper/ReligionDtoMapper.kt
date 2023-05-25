package com.polylab.religion.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.religion.app.dto.ReligionDto
import com.polylab.religion.persistence.model.Religion
import org.modelmapper.ModelMapper

@Mapper
class ReligionDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<ReligionDto, Religion> {
    override fun mapTo(source: ReligionDto): Religion = mapper.map(source, Religion::class.java)

    override fun mapFrom(destination: Religion): ReligionDto = mapper.map(destination, ReligionDto::class.java)
}
