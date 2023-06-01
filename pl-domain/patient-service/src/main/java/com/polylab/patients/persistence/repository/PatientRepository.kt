package com.polylab.patients.persistence.repository

import com.jxareas.efficax.repository.IntKeyedRepository
import com.polylab.patients.persistence.model.Patient

interface PatientRepository : IntKeyedRepository<Patient>
