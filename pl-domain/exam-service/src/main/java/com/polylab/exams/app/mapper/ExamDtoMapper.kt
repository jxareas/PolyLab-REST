package com.polylab.exams.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.polylab.exams.app.dto.ExamDto
import com.polylab.exams.persistence.model.Exam

@Mapper
object ExamDtoMapper : MirrorMapper<ExamDto, Exam> by mirrorMap()
