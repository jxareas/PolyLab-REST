package com.polylab.countries.persistence.repository

import com.jxareas.jxelerate.repository.IntKeyedRepository
import com.polylab.countries.persistence.model.Country

interface CountryRepository : IntKeyedRepository<Country>
