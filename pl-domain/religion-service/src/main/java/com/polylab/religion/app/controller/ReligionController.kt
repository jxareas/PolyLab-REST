package com.polylab.religion.app.controller

import com.jxareas.jxcore.annotations.ApiController
import com.jxareas.jxcore.app.controller.AppController
import com.polylab.religion.app.dto.ReligionDto
import com.polylab.religion.app.mapper.ReligionDtoMapper
import com.polylab.religion.domain.service.ReligionService
import com.polylab.religion.persistence.model.Religion

@ApiController("v1/religions", tagName = "Religions", tagDescription = "Endpoints for managing religions.")
class ReligionController(service: ReligionService, mapper: ReligionDtoMapper) :
    AppController<ReligionDto, Religion, Int>(service, mapper)
