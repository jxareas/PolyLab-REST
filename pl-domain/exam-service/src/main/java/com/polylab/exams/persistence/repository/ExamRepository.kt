package com.polylab.exams.persistence.repository

import com.jxareas.jxcore.persistence.repository.DefaultRepository
import com.polylab.exams.persistence.model.Exam

interface ExamRepository : DefaultRepository<Exam, Int>
