package com.polylab.municipality.app.controller;

import com.jxareas.jxcore.app.controller.AppController;
import com.polylab.municipality.app.dto.MunicipalityDto;
import com.polylab.municipality.app.mapper.MunicipalityDtoMapper;
import com.polylab.municipality.domain.service.MunicipalityService;
import com.polylab.municipality.persistence.model.Municipality;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/municipalities")
@Tag(name = "Municipalities", description = "Registered municipalities.")
public class MunicipalityControllerImpl extends AppController<MunicipalityDto, Municipality, Integer> implements MunicipalityController {
    public MunicipalityControllerImpl(MunicipalityService domainService, MunicipalityDtoMapper mapper) {
        super(domainService, mapper);
    }
}
