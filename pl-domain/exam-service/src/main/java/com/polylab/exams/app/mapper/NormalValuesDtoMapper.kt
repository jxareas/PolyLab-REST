package com.polylab.exams.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.polylab.exams.app.dto.NormalValuesDto
import com.polylab.exams.persistence.model.NormalValues

@Mapper
object NormalValuesDtoMapper : MirrorMapper<NormalValuesDto, NormalValues> by snapMirrorMap()
