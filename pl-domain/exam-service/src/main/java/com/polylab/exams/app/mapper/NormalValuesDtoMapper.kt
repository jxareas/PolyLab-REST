package com.polylab.exams.app.mapper

import com.jxareas.efficax.annotations.Mapper
import com.jxareas.efficax.domain.mapper.MirrorMapper
import com.jxareas.efficax.common.extensions.mirrorMap
import com.polylab.exams.app.dto.NormalValuesDto
import com.polylab.exams.persistence.model.NormalValues

@Mapper
object NormalValuesDtoMapper : MirrorMapper<NormalValuesDto, NormalValues> by mirrorMap()
