package com.polylab.municipality.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.municipality.app.dto.MunicipalityDto
import com.polylab.municipality.persistence.model.Municipality
import org.modelmapper.ModelMapper

@Mapper
class MunicipalityDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<MunicipalityDto, Municipality> {
    override fun mapTo(source: MunicipalityDto): Municipality = mapper.map(source, Municipality::class.java)

    override fun mapFrom(destination: Municipality): MunicipalityDto =
        mapper.map(destination, MunicipalityDto::class.java)
}
