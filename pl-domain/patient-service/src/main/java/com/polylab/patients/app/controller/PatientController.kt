package com.polylab.patients.app.controller

import com.jxareas.jxcore.annotations.ApiController
import com.jxareas.jxcore.app.controller.AppController
import com.polylab.patients.app.dto.PatientDto
import com.polylab.patients.app.mapper.PatientDtoMapper
import com.polylab.patients.domain.service.PatientService
import com.polylab.patients.persistence.model.Patient

@ApiController(path = ["v1/patients"], tagName = "Patients", tagDescription = "Endpoints for managing patients.")
class PatientController(service: PatientService, mapper: PatientDtoMapper) :
    AppController<PatientDto, Patient, Int>(service, mapper)
