package com.polylab.religion.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.extensions.mirrorMap
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.polylab.religion.app.dto.ReligionDto
import com.polylab.religion.persistence.model.Religion

@Mapper
object ReligionDtoMapper : MirrorMapper<ReligionDto, Religion> by mirrorMap()
