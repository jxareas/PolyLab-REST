package com.polylab.profession.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.extensions.mirrorMap
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.polylab.profession.app.dto.ProfessionDto
import com.polylab.profession.persistence.model.Profession

@Mapper
object ProfessionDtoMapper : MirrorMapper<ProfessionDto, Profession> by mirrorMap()
