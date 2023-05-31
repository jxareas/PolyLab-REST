package com.polylab.exams.app.controller

import com.jxareas.jxelerate.annotations.ApiController
import com.jxareas.jxelerate.app.controller.HyperController
import com.polylab.exams.app.dto.NormalValuesDto
import com.polylab.exams.app.mapper.NormalValuesDtoMapper
import com.polylab.exams.domain.service.NormalValuesService
import com.polylab.exams.persistence.model.NormalValues

@ApiController("v1/normal-values", tagName = "Normal Values", tagDescription = "API endpoints for managing exam's reference values.")
class NormalValuesController(service: NormalValuesService, mapper: NormalValuesDtoMapper) :
    HyperController<NormalValuesDto, NormalValues, Int>(service, mapper)
