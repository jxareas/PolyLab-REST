package com.polylab.exams.persistence.repository

import com.jxareas.efficax.repository.StandardRepository
import com.polylab.exams.persistence.model.ExamProfile
import com.polylab.exams.persistence.model.Profile

interface ExamProfileRepository : StandardRepository<ExamProfile, Int>

interface ProfileRepository : StandardRepository<Profile, Int>
