package com.polylab.municipality.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirrorMapper
import com.polylab.municipality.app.dto.MunicipalityDto
import com.polylab.municipality.persistence.model.Municipality

@Mapper
object MunicipalityDtoMapper : MirrorMapper<MunicipalityDto, Municipality> by mirrorMapper()
