package com.polylab.patients.domain.service

import com.jxareas.efficax.domain.service.PersistentService
import com.polylab.patients.persistence.model.Patient
import com.polylab.patients.persistence.repository.PatientRepository
import org.springframework.stereotype.Service

@Service
class PatientServiceImpl(repository: PatientRepository) :
    PersistentService<Patient, Int>(repository), PatientService
