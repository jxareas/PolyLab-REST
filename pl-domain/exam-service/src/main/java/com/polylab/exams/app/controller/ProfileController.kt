package com.polylab.exams.app.controller

import com.jxareas.jxelerator.annotations.ApiController
import com.jxareas.jxelerator.controller.HyperController
import com.polylab.exams.app.dto.ProfileDto
import com.polylab.exams.app.mapper.ProfileDtoMapper
import com.polylab.exams.domain.service.ProfileService
import com.polylab.exams.persistence.model.Profile

@ApiController("v1/profiles", tagName = "Profiles", tagDescription = "API endpoints for managing profiles.")
class ProfileController(service: ProfileService, mapper: ProfileDtoMapper) :
    HyperController<ProfileDto, Profile, Int>(service, mapper)
