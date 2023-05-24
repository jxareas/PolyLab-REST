package com.polylab.countries.persistence.repository

import com.jxareas.jxcore.persistence.repository.DefaultRepository
import com.polylab.countries.persistence.model.Country

interface CountryRepository : DefaultRepository<Country, Int>
