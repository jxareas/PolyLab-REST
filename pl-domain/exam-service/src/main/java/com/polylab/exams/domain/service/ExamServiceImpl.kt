package com.polylab.exams.domain.service

import com.jxareas.jxelerate.domain.service.PersistentService
import com.polylab.exams.persistence.model.Exam
import com.polylab.exams.persistence.repository.ExamRepository
import org.springframework.stereotype.Service

@Service
class ExamServiceImpl(repository: ExamRepository) :
    PersistentService<Exam, Int>(repository), ExamService
