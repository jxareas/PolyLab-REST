package com.polylab.municipality.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.extensions.mirrorMap
import com.polylab.municipality.app.dto.MunicipalityDto
import com.polylab.municipality.persistence.model.Municipality

@Mapper
object MunicipalityDtoMapper : MirrorMapper<MunicipalityDto, Municipality> by mirrorMap()
