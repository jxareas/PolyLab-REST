package com.polylab.patients.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.extensions.mirrorMap
import com.polylab.patients.app.dto.PatientDto
import com.polylab.patients.persistence.model.Patient

@Mapper
object PatientDtoMapper : MirrorMapper<PatientDto, Patient> by mirrorMap()
