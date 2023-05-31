package com.polylab.municipality.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.polylab.municipality.app.dto.MunicipalityDto
import com.polylab.municipality.persistence.model.Municipality

@Mapper
object MunicipalityDtoMapper : MirrorMapper<MunicipalityDto, Municipality> by mirrorMap()
