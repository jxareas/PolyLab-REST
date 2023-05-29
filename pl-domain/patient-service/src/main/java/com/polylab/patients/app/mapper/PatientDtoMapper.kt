package com.polylab.patients.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirrorMapper
import com.polylab.patients.app.dto.PatientDto
import com.polylab.patients.persistence.model.Patient

@Mapper
object PatientDtoMapper : MirrorMapper<PatientDto, Patient> by mirrorMapper()
