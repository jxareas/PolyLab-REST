package com.polylab.exams.app.controller

import com.jxareas.jxcore.annotations.ApiController
import com.jxareas.jxcore.app.controller.AppController
import com.polylab.exams.app.dto.ExamDto
import com.polylab.exams.app.mapper.ExamDtoMapper
import com.polylab.exams.domain.service.ExamService
import com.polylab.exams.persistence.model.Exam

@ApiController("v1/exams", tagName = "Exams", tagDescription = "Endpoints for managing exams.")
class ExamController(service: ExamService, mapper: ExamDtoMapper) :
    AppController<ExamDto, Exam, Int>(service, mapper)
