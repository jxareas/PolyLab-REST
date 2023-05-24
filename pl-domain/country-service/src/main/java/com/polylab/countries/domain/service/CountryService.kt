package com.polylab.countries.domain.service

import com.jxareas.jxcore.domain.service.DomainService
import com.polylab.countries.persistence.model.Country

interface CountryService : DomainService<Country, Int>
