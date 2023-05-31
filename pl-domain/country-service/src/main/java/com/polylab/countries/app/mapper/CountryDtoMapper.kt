package com.polylab.countries.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.polylab.countries.app.dto.CountryDto
import com.polylab.countries.persistence.model.Country

@Mapper
object CountryDtoMapper : MirrorMapper<CountryDto, Country> by snapMirrorMap()
