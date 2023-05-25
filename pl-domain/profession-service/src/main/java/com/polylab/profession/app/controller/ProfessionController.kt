package com.polylab.profession.app.controller

import com.jxareas.jxcore.annotations.ApiController
import com.jxareas.jxcore.app.controller.AppController
import com.polylab.profession.app.dto.ProfessionDto
import com.polylab.profession.app.mapper.ProfessionDtoMapper
import com.polylab.profession.domain.service.ProfessionService
import com.polylab.profession.persistence.model.Profession

@ApiController("v1/professions", tagName = "Professions", tagDescription = "Endpoints for managing professions.")
class ProfessionController(service: ProfessionService, mapper: ProfessionDtoMapper) :
    AppController<ProfessionDto, Profession, Int>(service, mapper)
