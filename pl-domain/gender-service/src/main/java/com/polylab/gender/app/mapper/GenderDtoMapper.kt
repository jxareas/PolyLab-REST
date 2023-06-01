package com.polylab.gender.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.extensions.mirrorMap
import com.polylab.gender.app.dto.GenderDto
import com.polylab.gender.persistence.model.Gender

@Mapper
object GenderDtoMapper : MirrorMapper<GenderDto, Gender> by mirrorMap()
