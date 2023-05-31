package com.polylab.exams.app.mapper

import com.jxareas.jxelerate.annotations.Mapper
import com.jxareas.jxelerate.domain.mapper.MirrorMapper
import com.jxareas.jxelerate.common.extensions.mirrorMap
import com.polylab.exams.app.dto.NormalValuesDto
import com.polylab.exams.persistence.model.NormalValues

@Mapper
object NormalValuesDtoMapper : MirrorMapper<NormalValuesDto, NormalValues> by mirrorMap()
