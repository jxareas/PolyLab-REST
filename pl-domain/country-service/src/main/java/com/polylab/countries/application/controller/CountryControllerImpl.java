package com.polylab.countries.application.controller;

import com.jxareas.jxcore.controller.CrudController;
import com.jxareas.jxcore.mapper.TwoWayMapper;
import com.jxareas.jxcore.service.DomainService;
import com.polylab.countries.application.dto.CountryDto;
import com.polylab.countries.persistence.model.Country;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("countries")
@Tag(name = "Countries", description = "Registered nations.")
public class CountryControllerImpl extends CrudController<CountryDto, Country, Integer> implements CountryController {

    public CountryControllerImpl(DomainService<Country, Integer> domainService,
                                 TwoWayMapper<CountryDto, Country> mapper) {
        super(domainService, mapper);
    }
}
