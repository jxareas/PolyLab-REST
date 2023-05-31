package com.polylab.exams.domain.service

import com.jxareas.jxelerate.domain.service.DomainService
import com.polylab.exams.persistence.model.Exam

interface ExamService : DomainService<Exam, Int>
