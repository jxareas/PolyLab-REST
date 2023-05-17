package com.polylab.gender.app.controller;

import com.jxareas.jxcore.controller.CrudController;
import com.jxareas.jxcore.mapper.TwoWayMapper;
import com.polylab.gender.app.dto.GenderDto;
import com.polylab.gender.domain.service.GenderService;
import com.polylab.gender.persistence.model.Gender;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("genders")
@Tag(name = "Genders", description = "Registered genders.")
public class GenderControllerImpl extends CrudController<GenderDto, Gender, Integer> implements GenderController {
    public GenderControllerImpl(GenderService domainService, TwoWayMapper<GenderDto, Gender> mapper) {
        super(domainService, mapper);
    }
}
