package com.polylab.doctors.persistence.repository

import com.jxareas.jxelerator.extensions.IntKeyedRepository
import com.polylab.doctors.persistence.model.Doctor

interface DoctorRepository : IntKeyedRepository<Doctor>
