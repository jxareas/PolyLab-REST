package com.polylab.municipality.app.controller

import com.jxareas.jxelerator.annotations.ApiController
import com.jxareas.jxelerator.controller.HyperController
import com.polylab.municipality.app.dto.MunicipalityDto
import com.polylab.municipality.app.mapper.MunicipalityDtoMapper
import com.polylab.municipality.domain.service.MunicipalityService
import com.polylab.municipality.persistence.model.Municipality

@ApiController("v1/municipalities", tagName = "Municipalities", tagDescription = "Endpoints for managing municipalities.",)
class MunicipalityController(service: MunicipalityService, mapper: MunicipalityDtoMapper) :
    HyperController<MunicipalityDto, Municipality, Int>(service, mapper)
