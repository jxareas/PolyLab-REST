package com.polylab.exams.app.controller;

import com.jxareas.jxcore.app.controller.AppController;
import com.polylab.exams.app.dto.ExamDto;
import com.polylab.exams.app.mapper.ExamDtoMapper;
import com.polylab.exams.domain.service.ExamService;
import com.polylab.exams.persistence.model.Exam;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/exams")
@Tag(name = "Exams", description = "Registered exams.")
public class ExamControllerImpl extends AppController<ExamDto, Exam, Integer> implements ExamController {

    public ExamControllerImpl(ExamService domainService, ExamDtoMapper mapper) {
        super(domainService, mapper);
    }

}
