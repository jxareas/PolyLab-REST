package com.polylab.doctors.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.polylab.doctors.app.dto.DoctorDto
import com.polylab.doctors.persistence.model.Doctor

@Mapper
object DoctorDtoMapper : MirrorMapper<DoctorDto, Doctor> by snapMirrorMap()
