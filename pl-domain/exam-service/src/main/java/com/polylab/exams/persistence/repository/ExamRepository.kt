package com.polylab.exams.persistence.repository

import com.jxareas.efficax.extensions.IntKeyedRepository
import com.polylab.exams.persistence.model.Exam

interface ExamRepository : IntKeyedRepository<Exam>
