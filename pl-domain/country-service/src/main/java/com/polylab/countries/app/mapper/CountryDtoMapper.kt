package com.polylab.countries.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.polylab.countries.app.dto.CountryDto
import com.polylab.countries.persistence.model.Country

@Mapper
object CountryDtoMapper : MirrorMapper<CountryDto, Country> by mirrorMap()
