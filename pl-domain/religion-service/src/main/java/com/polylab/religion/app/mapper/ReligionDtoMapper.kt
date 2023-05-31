package com.polylab.religion.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.polylab.religion.app.dto.ReligionDto
import com.polylab.religion.persistence.model.Religion

@Mapper
object ReligionDtoMapper : MirrorMapper<ReligionDto, Religion> by snapMirrorMap()
