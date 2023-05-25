package com.polylab.exams.domain.service

import com.jxareas.jxcore.domain.service.DomainService
import com.polylab.exams.persistence.model.Exam

interface ExamService : DomainService<Exam, Int>
