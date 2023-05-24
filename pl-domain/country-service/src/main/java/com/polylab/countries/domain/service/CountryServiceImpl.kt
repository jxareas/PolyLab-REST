package com.polylab.countries.domain.service

import com.jxareas.jxcore.domain.service.PersistentService
import com.polylab.countries.persistence.model.Country
import com.polylab.countries.persistence.repository.CountryRepository
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl(repository: CountryRepository) :
    PersistentService<Country, Int>(repository), CountryService
