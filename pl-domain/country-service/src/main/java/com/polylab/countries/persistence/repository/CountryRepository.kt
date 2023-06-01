package com.polylab.countries.persistence.repository

import com.jxareas.efficax.extensions.IntKeyedRepository
import com.polylab.countries.persistence.model.Country

interface CountryRepository : IntKeyedRepository<Country>
