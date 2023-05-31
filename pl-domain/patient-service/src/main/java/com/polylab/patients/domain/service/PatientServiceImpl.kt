package com.polylab.patients.domain.service

import com.jxareas.jxelerator.domain.service.PersistentService
import com.polylab.patients.persistence.model.Patient
import com.polylab.patients.persistence.repository.PatientRepository
import org.springframework.stereotype.Service

@Service
class PatientServiceImpl(repository: PatientRepository) :
    PatientService, PersistentService<Patient, Int>(repository)
