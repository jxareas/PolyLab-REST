package com.polylab.municipality.domain.service;

import com.jxareas.jxcore.service.CrudDomainService;
import com.polylab.municipality.persistence.model.Municipality;
import com.polylab.municipality.persistence.repository.MunicipalityRepository;
import org.springframework.stereotype.Service;

@Service
public class MunicipalityServiceImpl extends CrudDomainService<Municipality, Integer> implements MunicipalityService {
    public MunicipalityServiceImpl(MunicipalityRepository repository) {
        super(repository);
    }
}
