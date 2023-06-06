package com.polylab.exams.domain.service

import com.jxareas.jxelerator.domain.service.PersistentService
import com.polylab.exams.persistence.model.Profile
import com.polylab.exams.persistence.repository.ProfileRepository
import org.springframework.stereotype.Service

@Service
class ProfileServiceImpl(repository : ProfileRepository) :
    ProfileService, PersistentService<Profile, Int>(repository)
