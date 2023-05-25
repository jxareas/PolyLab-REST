package com.polylab.doctors.app.controller

import com.jxareas.jxcore.annotations.ApiController
import com.jxareas.jxcore.app.controller.AppController
import com.polylab.doctors.app.dto.DoctorDto
import com.polylab.doctors.app.mapper.DoctorDtoMapper
import com.polylab.doctors.domain.service.DoctorService
import com.polylab.doctors.persistence.model.Doctor

@ApiController(path = ["v1/doctors"], tagName = "Doctors", tagDescription = "Endpoints for managing personal.")
class DoctorController(service: DoctorService, mapper: DoctorDtoMapper) :
    AppController<DoctorDto, Doctor, Int>(service, mapper)
