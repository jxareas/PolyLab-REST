package com.polylab.countries.app.controller

import com.jxareas.jxcore.annotations.ApiController
import com.jxareas.jxcore.app.controller.AppController
import com.polylab.countries.app.dto.CountryDto
import com.polylab.countries.app.mapper.CountryDtoMapper
import com.polylab.countries.domain.service.CountryService
import com.polylab.countries.persistence.model.Country

@ApiController("v1/countries", tagName = "Countries", tagDescription = "Endpoints for managing countries.")
class CountryController(service: CountryService, mapper: CountryDtoMapper) :
    AppController<CountryDto, Country, Int>(service, mapper)
