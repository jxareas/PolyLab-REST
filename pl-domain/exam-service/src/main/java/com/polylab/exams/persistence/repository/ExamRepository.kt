package com.polylab.exams.persistence.repository

import com.jxareas.jxelerate.repository.IntKeyedRepository
import com.polylab.exams.persistence.model.Exam

interface ExamRepository : IntKeyedRepository<Exam>
