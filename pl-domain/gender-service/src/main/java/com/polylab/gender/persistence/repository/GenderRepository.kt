package com.polylab.gender.persistence.repository

import com.jxareas.jxelerator.extensions.IntKeyedRepository
import com.polylab.gender.persistence.model.Gender

interface GenderRepository : IntKeyedRepository<Gender>
