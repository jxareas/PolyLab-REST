package com.polylab.countries.persistence.repository

import com.jxareas.efficax.repository.IntKeyedRepository
import com.polylab.countries.persistence.model.Country

interface CountryRepository : IntKeyedRepository<Country>
