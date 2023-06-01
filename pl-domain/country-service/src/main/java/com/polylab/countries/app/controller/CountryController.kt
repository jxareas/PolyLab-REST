package com.polylab.countries.app.controller

import com.jxareas.efficax.annotations.ApiController
import com.jxareas.efficax.controller.HyperController
import com.polylab.countries.app.dto.CountryDto
import com.polylab.countries.app.mapper.CountryDtoMapper
import com.polylab.countries.domain.service.CountryService
import com.polylab.countries.persistence.model.Country

@ApiController("v1/countries", tagName = "Countries", tagDescription = "Endpoints for managing countries.")
class CountryController(service: CountryService, mapper: CountryDtoMapper) :
    HyperController<CountryDto, Country, Int>(service, mapper)
