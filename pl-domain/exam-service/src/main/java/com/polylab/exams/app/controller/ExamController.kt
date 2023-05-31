package com.polylab.exams.app.controller

import com.jxareas.jxelerator.annotations.ApiController
import com.jxareas.jxelerator.controller.HyperController
import com.polylab.exams.app.dto.ExamDto
import com.polylab.exams.app.mapper.ExamDtoMapper
import com.polylab.exams.domain.service.ExamService
import com.polylab.exams.persistence.model.Exam

@ApiController("v1/exams", tagName = "Exams", tagDescription = "Endpoints for managing exams.")
class ExamController(service: ExamService, mapper: ExamDtoMapper) :
    HyperController<ExamDto, Exam, Int>(service, mapper)
