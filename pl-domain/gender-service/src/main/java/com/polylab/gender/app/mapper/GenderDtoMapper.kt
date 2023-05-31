package com.polylab.gender.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.polylab.gender.app.dto.GenderDto
import com.polylab.gender.persistence.model.Gender

@Mapper
object GenderDtoMapper : MirrorMapper<GenderDto, Gender> by mirrorMap()
