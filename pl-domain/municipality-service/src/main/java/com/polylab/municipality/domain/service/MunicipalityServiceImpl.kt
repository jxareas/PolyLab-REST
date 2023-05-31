package com.polylab.municipality.domain.service

import com.jxareas.jxelerator.domain.service.PersistentService
import com.polylab.municipality.persistence.model.Municipality
import com.polylab.municipality.persistence.repository.MunicipalityRepository
import org.springframework.stereotype.Service

@Service
class MunicipalityServiceImpl(repository: MunicipalityRepository) :
    MunicipalityService, PersistentService<Municipality, Int>(repository)
