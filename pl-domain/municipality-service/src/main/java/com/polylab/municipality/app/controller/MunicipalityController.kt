package com.polylab.municipality.app.controller

import com.jxareas.jxcore.annotations.ApiController
import com.jxareas.jxcore.app.controller.AppController
import com.polylab.municipality.app.dto.MunicipalityDto
import com.polylab.municipality.app.mapper.MunicipalityDtoMapper
import com.polylab.municipality.domain.service.MunicipalityService
import com.polylab.municipality.persistence.model.Municipality

@ApiController(path = ["v1/municipalities"], tagName = "Municipalities", tagDescription = "Endpoints for managing municipalities.",)
class MunicipalityController(service: MunicipalityService, mapper: MunicipalityDtoMapper) :
    AppController<MunicipalityDto, Municipality, Int>(service, mapper)
