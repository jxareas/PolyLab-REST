package com.polylab.gender.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirrorMapper
import com.polylab.gender.app.dto.GenderDto
import com.polylab.gender.persistence.model.Gender

@Mapper
object GenderDtoMapper : MirrorMapper<GenderDto, Gender> by mirrorMapper()
