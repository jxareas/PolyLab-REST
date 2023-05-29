package com.polylab.exams.app.mapper

import com.jxareas.jxcore.annotations.Mapper
import com.jxareas.jxcore.domain.mapper.MirrorMapper
import com.jxareas.jxcore.common.extensions.mirrorMapper
import com.polylab.exams.app.dto.NormalValuesDto
import com.polylab.exams.persistence.model.NormalValues

@Mapper
object NormalValuesDtoMapper : MirrorMapper<NormalValuesDto, NormalValues> by mirrorMapper()
