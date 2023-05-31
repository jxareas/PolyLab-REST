package com.polylab.municipality.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.polylab.municipality.app.dto.MunicipalityDto
import com.polylab.municipality.persistence.model.Municipality

@Mapper
object MunicipalityDtoMapper : MirrorMapper<MunicipalityDto, Municipality> by snapMirrorMap()
