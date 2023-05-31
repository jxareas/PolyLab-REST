package com.polylab.gender.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.polylab.gender.app.dto.GenderDto
import com.polylab.gender.persistence.model.Gender

@Mapper
object GenderDtoMapper : MirrorMapper<GenderDto, Gender> by snapMirrorMap()
