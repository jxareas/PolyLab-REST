package com.polylab.gender.app.controller;

import com.jxareas.jxcore.app.controller.HypermediaController;
import com.polylab.gender.app.dto.GenderDto;
import com.polylab.gender.app.mapper.GenderDtoMapper;
import com.polylab.gender.domain.service.GenderService;
import com.polylab.gender.persistence.model.Gender;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/genders")
@Tag(name = "Genders", description = "Registered genders.")
public class GenderControllerImpl extends HypermediaController<GenderDto, Gender, Integer> implements GenderController {
    public GenderControllerImpl(GenderService domainService, GenderDtoMapper mapper) {
        super(domainService, mapper);
    }
}
