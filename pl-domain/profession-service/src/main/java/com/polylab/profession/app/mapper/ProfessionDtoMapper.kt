package com.polylab.profession.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.polylab.profession.app.dto.ProfessionDto
import com.polylab.profession.persistence.model.Profession

@Mapper
object ProfessionDtoMapper : MirrorMapper<ProfessionDto, Profession> by snapMirrorMap()
