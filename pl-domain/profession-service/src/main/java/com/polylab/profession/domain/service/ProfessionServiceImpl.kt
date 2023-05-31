package com.polylab.profession.domain.service

import com.jxareas.jxelerate.domain.service.PersistentService
import com.polylab.profession.persistence.model.Profession
import com.polylab.profession.persistence.repository.ProfessionRepository
import org.springframework.stereotype.Service

@Service
class ProfessionServiceImpl(repository: ProfessionRepository) :
    PersistentService<Profession, Int>(repository), ProfessionService
