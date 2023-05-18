package com.polylab.countries.domain.service;

import com.jxareas.jxcore.domain.service.CrudDomainService;
import com.polylab.countries.persistence.model.Country;
import com.polylab.countries.persistence.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends CrudDomainService<Country, Integer> implements CountryService {
    public CountryServiceImpl(CountryRepository repository) {
        super(repository);
    }
}
