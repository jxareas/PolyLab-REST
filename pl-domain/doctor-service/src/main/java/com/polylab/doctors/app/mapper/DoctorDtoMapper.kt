package com.polylab.doctors.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.polylab.doctors.app.dto.DoctorDto
import com.polylab.doctors.persistence.model.Doctor

@Mapper
object DoctorDtoMapper : MirrorMapper<DoctorDto, Doctor> by mirrorMap()
