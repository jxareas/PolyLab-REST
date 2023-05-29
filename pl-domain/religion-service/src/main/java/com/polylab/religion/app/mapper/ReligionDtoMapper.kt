package com.polylab.religion.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirroring
import com.polylab.religion.app.dto.ReligionDto
import com.polylab.religion.persistence.model.Religion

@Mapper
object ReligionDtoMapper : MirrorMapper<ReligionDto, Religion> by mirroring()
