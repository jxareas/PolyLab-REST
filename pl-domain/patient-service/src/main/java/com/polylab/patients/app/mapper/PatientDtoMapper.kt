package com.polylab.patients.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.polylab.patients.app.dto.PatientDto
import com.polylab.patients.persistence.model.Patient

@Mapper
object PatientDtoMapper : MirrorMapper<PatientDto, Patient> by snapMirrorMap()
