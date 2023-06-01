package com.polylab.doctors.domain.service

import com.jxareas.efficax.domain.service.PersistentService
import com.polylab.doctors.persistence.model.Doctor
import com.polylab.doctors.persistence.repository.DoctorRepository
import org.springframework.stereotype.Service

@Service
class DoctorServiceImpl(repository: DoctorRepository) :
    PersistentService<Doctor, Int>(repository), DoctorService
