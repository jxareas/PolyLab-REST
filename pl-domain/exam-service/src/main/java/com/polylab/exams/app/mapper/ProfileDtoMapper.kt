package com.polylab.exams.app.mapper

import com.jxareas.jxelerator.annotations.Mapper
import com.jxareas.jxelerator.domain.mapper.MirrorMapper
import com.jxareas.jxelerator.extensions.snapMirrorMap
import com.polylab.exams.app.dto.ProfileDto
import com.polylab.exams.persistence.model.Profile

@Mapper
object ProfileDtoMapper :  MirrorMapper<ProfileDto, Profile> by snapMirrorMap()
