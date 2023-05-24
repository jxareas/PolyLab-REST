package com.polylab.exams.domain.service;

import com.jxareas.jxcore.domain.service.PersistentService;
import com.polylab.exams.persistence.model.Exam;
import com.polylab.exams.persistence.repository.ExamRepository;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl extends PersistentService<Exam, Integer> implements ExamService {
    public ExamServiceImpl(ExamRepository repository) {
        super(repository);
    }
}
