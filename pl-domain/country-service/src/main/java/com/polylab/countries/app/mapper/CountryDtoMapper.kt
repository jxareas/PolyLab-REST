package com.polylab.countries.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.extensions.mirrorMap
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.polylab.countries.app.dto.CountryDto
import com.polylab.countries.persistence.model.Country

@Mapper
object CountryDtoMapper : MirrorMapper<CountryDto, Country> by mirrorMap()
