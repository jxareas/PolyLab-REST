package com.polylab.gender.app.controller

import com.jxareas.efficax.annotations.ApiController
import com.jxareas.efficax.app.controller.HyperController
import com.polylab.gender.app.dto.GenderDto
import com.polylab.gender.app.mapper.GenderDtoMapper
import com.polylab.gender.domain.service.GenderService
import com.polylab.gender.persistence.model.Gender

@ApiController("v1/genders", tagName = "Genders", tagDescription = "Endpoints for managing genders.")
class GenderController(service: GenderService, mapper: GenderDtoMapper) :
    HyperController<GenderDto, Gender, Int>(service, mapper)
