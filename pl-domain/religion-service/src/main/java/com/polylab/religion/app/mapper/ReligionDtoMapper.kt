package com.polylab.religion.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.polylab.religion.app.dto.ReligionDto
import com.polylab.religion.persistence.model.Religion

@Mapper
object ReligionDtoMapper : MirrorMapper<ReligionDto, Religion> by mirrorMap()
