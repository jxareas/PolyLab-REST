package com.polylab.doctors.persistence.repository

import com.jxareas.jxcore.persistence.repository.DefaultRepository
import com.polylab.doctors.persistence.model.Doctor

interface DoctorRepository : DefaultRepository<Doctor, Int>
