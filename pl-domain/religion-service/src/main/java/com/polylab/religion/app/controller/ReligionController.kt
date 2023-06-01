package com.polylab.religion.app.controller

import com.jxareas.efficax.annotations.ApiController
import com.jxareas.efficax.controller.HyperController
import com.polylab.religion.app.dto.ReligionDto
import com.polylab.religion.app.mapper.ReligionDtoMapper
import com.polylab.religion.domain.service.ReligionService
import com.polylab.religion.persistence.model.Religion

@ApiController("v1/religions", tagName = "Religions", tagDescription = "Endpoints for managing religions.")
class ReligionController(service: ReligionService, mapper: ReligionDtoMapper) :
    HyperController<ReligionDto, Religion, Int>(service, mapper)
