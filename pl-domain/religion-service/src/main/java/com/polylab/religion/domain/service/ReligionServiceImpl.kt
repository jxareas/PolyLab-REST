package com.polylab.religion.domain.service

import com.jxareas.jxelerator.domain.service.PersistentService
import com.polylab.religion.persistence.model.Religion
import com.polylab.religion.persistence.repository.ReligionRepository
import org.springframework.stereotype.Service

@Service
class ReligionServiceImpl(repository: ReligionRepository) :
    ReligionService, PersistentService<Religion, Int>(repository)
