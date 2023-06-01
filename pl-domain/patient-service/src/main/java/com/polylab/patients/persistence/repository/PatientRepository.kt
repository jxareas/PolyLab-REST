package com.polylab.patients.persistence.repository

import com.jxareas.efficax.extensions.IntKeyedRepository
import com.polylab.patients.persistence.model.Patient

interface PatientRepository : IntKeyedRepository<Patient>
