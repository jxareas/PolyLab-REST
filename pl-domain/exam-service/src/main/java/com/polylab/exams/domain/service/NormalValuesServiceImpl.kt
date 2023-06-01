package com.polylab.exams.domain.service

import com.jxareas.efficax.domain.service.PersistentService
import com.polylab.exams.persistence.model.NormalValues
import com.polylab.exams.persistence.repository.NormalValuesRepository
import org.springframework.stereotype.Service

@Service
class NormalValuesServiceImpl(repository: NormalValuesRepository) :
    PersistentService<NormalValues, Int>(repository), NormalValuesService
