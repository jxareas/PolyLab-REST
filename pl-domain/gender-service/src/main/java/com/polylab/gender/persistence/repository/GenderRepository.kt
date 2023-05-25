package com.polylab.gender.persistence.repository

import com.jxareas.jxcore.persistence.repository.DefaultRepository
import com.polylab.gender.persistence.model.Gender

interface GenderRepository : DefaultRepository<Gender, Int>
