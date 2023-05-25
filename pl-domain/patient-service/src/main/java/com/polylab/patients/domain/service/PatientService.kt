package com.polylab.patients.domain.service

import com.jxareas.jxcore.domain.service.DomainService
import com.polylab.patients.persistence.model.Patient

interface PatientService : DomainService<Patient, Int>
