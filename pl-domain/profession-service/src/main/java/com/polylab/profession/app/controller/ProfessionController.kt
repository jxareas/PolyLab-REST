package com.polylab.profession.app.controller

import com.jxareas.jxelerator.annotations.ApiController
import com.jxareas.jxelerator.controller.HyperController
import com.polylab.profession.app.dto.ProfessionDto
import com.polylab.profession.app.mapper.ProfessionDtoMapper
import com.polylab.profession.domain.service.ProfessionService
import com.polylab.profession.persistence.model.Profession

@ApiController("v1/professions", tagName = "Professions", tagDescription = "Endpoints for managing professions.")
class ProfessionController(service: ProfessionService, mapper: ProfessionDtoMapper) :
    HyperController<ProfessionDto, Profession, Int>(service, mapper)
