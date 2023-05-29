package com.polylab.countries.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirrorMapper
import com.polylab.countries.app.dto.CountryDto
import com.polylab.countries.persistence.model.Country

@Mapper
object CountryDtoMapper : MirrorMapper<CountryDto, Country> by mirrorMapper()
