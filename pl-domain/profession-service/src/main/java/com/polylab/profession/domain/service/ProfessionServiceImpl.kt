package com.polylab.profession.domain.service

import com.jxareas.jxelerator.domain.service.PersistentService
import com.polylab.profession.persistence.model.Profession
import com.polylab.profession.persistence.repository.ProfessionRepository
import org.springframework.stereotype.Service

@Service
class ProfessionServiceImpl(repository: ProfessionRepository) :
    ProfessionService, PersistentService<Profession, Int>(repository)
