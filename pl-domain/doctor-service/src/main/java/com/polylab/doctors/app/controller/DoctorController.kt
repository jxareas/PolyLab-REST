package com.polylab.doctors.app.controller

import com.jxareas.jxelerate.annotations.ApiController
import com.jxareas.jxelerate.app.controller.HyperController
import com.polylab.doctors.app.dto.DoctorDto
import com.polylab.doctors.app.mapper.DoctorDtoMapper
import com.polylab.doctors.domain.service.DoctorService
import com.polylab.doctors.persistence.model.Doctor

@ApiController("v1/doctors", tagName = "Doctors", tagDescription = "Endpoints for managing personal.")
class DoctorController(service: DoctorService, mapper: DoctorDtoMapper) :
    HyperController<DoctorDto, Doctor, Int>(service, mapper)
