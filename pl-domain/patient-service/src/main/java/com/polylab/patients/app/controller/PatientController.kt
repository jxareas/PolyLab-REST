package com.polylab.patients.app.controller

import com.jxareas.jxelerate.annotations.ApiController
import com.jxareas.jxelerate.app.controller.AppController
import com.polylab.patients.app.dto.PatientDto
import com.polylab.patients.app.mapper.PatientDtoMapper
import com.polylab.patients.domain.service.PatientService
import com.polylab.patients.persistence.model.Patient

@ApiController("v1/patients", tagName = "Patients", tagDescription = "Endpoints for managing patients.")
class PatientController(service: PatientService, mapper: PatientDtoMapper) :
    AppController<PatientDto, Patient, Int>(service, mapper)
