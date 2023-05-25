package com.polylab.patients.persistence.repository

import com.jxareas.jxcore.persistence.repository.DefaultRepository
import com.polylab.patients.persistence.model.Patient

interface PatientRepository : DefaultRepository<Patient, Int>
