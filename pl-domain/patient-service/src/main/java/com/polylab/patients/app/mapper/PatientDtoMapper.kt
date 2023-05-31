package com.polylab.patients.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.polylab.patients.app.dto.PatientDto
import com.polylab.patients.persistence.model.Patient

@Mapper
object PatientDtoMapper : MirrorMapper<PatientDto, Patient> by mirrorMap()
