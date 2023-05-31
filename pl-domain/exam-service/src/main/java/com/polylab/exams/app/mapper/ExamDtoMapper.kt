package com.polylab.exams.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.polylab.exams.app.dto.ExamDto
import com.polylab.exams.persistence.model.Exam

@Mapper
object ExamDtoMapper : MirrorMapper<ExamDto, Exam> by snapMirrorMap()
