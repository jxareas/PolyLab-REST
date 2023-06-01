package com.polylab.doctors.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.extensions.mirrorMap
import com.polylab.doctors.app.dto.DoctorDto
import com.polylab.doctors.persistence.model.Doctor

@Mapper
object DoctorDtoMapper : MirrorMapper<DoctorDto, Doctor> by mirrorMap()
