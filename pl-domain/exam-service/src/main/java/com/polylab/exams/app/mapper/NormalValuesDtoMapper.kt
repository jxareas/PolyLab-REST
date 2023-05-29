package com.polylab.exams.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.exams.app.dto.NormalValuesDto
import com.polylab.exams.persistence.model.NormalValues
import org.modelmapper.ModelMapper

@Mapper
class NormalValuesDtoMapper(private val mapper : ModelMapper) : TwoWayMapper<NormalValuesDto, NormalValues> {
    override fun mapTo(source: NormalValuesDto): NormalValues = mapper.map(source, NormalValues::class.java)

    override fun mapFrom(destination: NormalValues): NormalValuesDto = mapper.map(destination, NormalValuesDto::class.java)
}
