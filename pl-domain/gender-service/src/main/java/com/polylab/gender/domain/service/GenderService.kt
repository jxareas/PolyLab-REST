package com.polylab.gender.domain.service

import com.jxareas.jxelerator.domain.service.DomainService
import com.polylab.gender.persistence.model.Gender

interface GenderService : DomainService<Gender, Int>
