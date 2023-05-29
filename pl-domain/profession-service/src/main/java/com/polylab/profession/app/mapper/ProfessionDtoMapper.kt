package com.polylab.profession.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirroring
import com.polylab.profession.app.dto.ProfessionDto
import com.polylab.profession.persistence.model.Profession

@Mapper
object ProfessionDtoMapper : MirrorMapper<ProfessionDto, Profession> by mirroring()
