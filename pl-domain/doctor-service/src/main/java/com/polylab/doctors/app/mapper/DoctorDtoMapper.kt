package com.polylab.doctors.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.common.mapper.TwoWayMapper
import com.polylab.doctors.app.dto.DoctorDto
import com.polylab.doctors.persistence.model.Doctor
import org.modelmapper.ModelMapper

@Mapper
class DoctorDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<DoctorDto, Doctor> {
    override fun mapTo(source: DoctorDto): Doctor = mapper.map(source, Doctor::class.java)

    override fun mapFrom(destination: Doctor): DoctorDto = mapper.map(destination, DoctorDto::class.java)
}
