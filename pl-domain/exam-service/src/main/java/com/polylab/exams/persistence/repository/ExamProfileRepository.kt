package com.polylab.exams.persistence.repository

import com.jxareas.jxcore.repository.DefaultRepository
import com.polylab.exams.persistence.model.ExamProfile
import com.polylab.exams.persistence.model.Profile

interface ExamProfileRepository : DefaultRepository<ExamProfile, Int>

interface ProfileRepository : DefaultRepository<Profile, Int>
