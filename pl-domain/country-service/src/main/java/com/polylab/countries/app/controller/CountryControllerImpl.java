package com.polylab.countries.app.controller;

import com.jxareas.jxcore.app.controller.CrudController;
import com.polylab.countries.app.dto.CountryDto;
import com.polylab.countries.app.mapper.CountryDtoMapper;
import com.polylab.countries.domain.service.CountryService;
import com.polylab.countries.persistence.model.Country;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/countries")
@Tag(name = "Countries", description = "Registered countries.")
public class CountryControllerImpl extends CrudController<CountryDto, Country, Integer> implements CountryController {

    public CountryControllerImpl(CountryService domainService, CountryDtoMapper mapper) {
        super(domainService, mapper);
    }

}
