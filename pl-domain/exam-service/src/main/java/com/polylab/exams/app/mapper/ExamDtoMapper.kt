package com.polylab.exams.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.TwoWayMapper
import com.polylab.exams.app.dto.ExamDto
import com.polylab.exams.persistence.model.Exam
import org.modelmapper.ModelMapper

@Mapper
class ExamDtoMapper(private val mapper: ModelMapper) : TwoWayMapper<ExamDto, Exam> {
    override fun mapTo(source: ExamDto): Exam = mapper.map(source, Exam::class.java)

    override fun mapFrom(destination: Exam): ExamDto = mapper.map(destination, ExamDto::class.java)
}
