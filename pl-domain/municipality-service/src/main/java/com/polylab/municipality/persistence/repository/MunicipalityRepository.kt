package com.polylab.municipality.persistence.repository

import com.jxareas.jxcore.persistence.repository.DefaultRepository
import com.polylab.municipality.persistence.model.Municipality

interface MunicipalityRepository : DefaultRepository<Municipality, Int>
