package com.polylab.countries.domain.service

import com.jxareas.jxelerator.domain.service.PersistentService
import com.polylab.countries.persistence.model.Country
import com.polylab.countries.persistence.repository.CountryRepository
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl(repository: CountryRepository) :
    CountryService, PersistentService<Country, Int>(repository)
