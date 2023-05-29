package com.polylab.doctors.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirrorMapper
import com.polylab.doctors.app.dto.DoctorDto
import com.polylab.doctors.persistence.model.Doctor

@Mapper
object DoctorDtoMapper : MirrorMapper<DoctorDto, Doctor> by mirrorMapper()
