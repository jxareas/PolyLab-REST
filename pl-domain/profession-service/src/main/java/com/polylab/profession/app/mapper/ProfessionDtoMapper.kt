package com.polylab.profession.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.polylab.profession.app.dto.ProfessionDto
import com.polylab.profession.persistence.model.Profession

@Mapper
object ProfessionDtoMapper : MirrorMapper<ProfessionDto, Profession> by mirrorMap()
