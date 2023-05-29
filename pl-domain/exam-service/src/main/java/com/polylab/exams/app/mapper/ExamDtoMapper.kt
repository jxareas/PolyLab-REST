package com.polylab.exams.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirrorMapper
import com.polylab.exams.app.dto.ExamDto
import com.polylab.exams.persistence.model.Exam

@Mapper
object ExamDtoMapper : MirrorMapper<ExamDto, Exam> by mirrorMapper()
