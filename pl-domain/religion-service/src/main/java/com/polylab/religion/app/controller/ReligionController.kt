package com.polylab.religion.app.controller

import com.jxareas.jxelerate.annotations.ApiController
import com.jxareas.jxelerate.app.controller.HyperController
import com.polylab.religion.app.dto.ReligionDto
import com.polylab.religion.app.mapper.ReligionDtoMapper
import com.polylab.religion.domain.service.ReligionService
import com.polylab.religion.persistence.model.Religion

@ApiController("v1/religions", tagName = "Religions", tagDescription = "Endpoints for managing religions.")
class ReligionController(service: ReligionService, mapper: ReligionDtoMapper) :
    HyperController<ReligionDto, Religion, Int>(service, mapper)
