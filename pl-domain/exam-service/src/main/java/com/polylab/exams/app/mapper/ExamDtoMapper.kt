package com.polylab.exams.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.common.extensions.mirrorMap
import com.polylab.exams.app.dto.ExamDto
import com.polylab.exams.persistence.model.Exam

@Mapper
object ExamDtoMapper : MirrorMapper<ExamDto, Exam> by mirrorMap()
