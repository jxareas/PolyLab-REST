package com.polylab.patients.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.patients.app.dto.PatientDto
import com.polylab.patients.persistence.model.Patient
import org.modelmapper.ModelMapper

@Mapper
class PatientDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<PatientDto, Patient> {
    override fun mapTo(source: PatientDto): Patient = mapper.map(source, Patient::class.java)

    override fun mapFrom(destination: Patient): PatientDto = mapper.map(destination, PatientDto::class.java)
}
