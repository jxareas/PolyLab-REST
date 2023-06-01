package com.polylab.doctors.persistence.repository

import com.jxareas.efficax.repository.IntKeyedRepository
import com.polylab.doctors.persistence.model.Doctor

interface DoctorRepository : IntKeyedRepository<Doctor>
