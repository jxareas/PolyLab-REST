package com.polylab.gender.domain.service

import com.jxareas.jxelerator.domain.service.PersistentService
import com.polylab.gender.persistence.model.Gender
import com.polylab.gender.persistence.repository.GenderRepository
import org.springframework.stereotype.Service

@Service
class GenderServiceImpl(repository: GenderRepository) :
    GenderService, PersistentService<Gender, Int>(repository)
