package com.polylab.exams.app.mapper;

import com.jxareas.jxcore.core.mapper.TwoWayMapper;
import com.polylab.exams.app.dto.ExamDto;
import com.polylab.exams.persistence.model.Exam;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExamDtoMapper implements TwoWayMapper<ExamDto, Exam> {

    private final ModelMapper mapper;

    @Override
    public Exam mapTo(ExamDto source) {
        return mapper.map(source, Exam.class);
    }

    @Override
    public ExamDto mapFrom(Exam destination) {
        return mapper.map(destination, ExamDto.class);
    }
}
