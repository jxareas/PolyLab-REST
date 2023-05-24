package com.polylab.municipality.domain.service;

import com.jxareas.jxcore.domain.service.PersistentService;
import com.polylab.municipality.persistence.model.Municipality;
import com.polylab.municipality.persistence.repository.MunicipalityRepository;
import org.springframework.stereotype.Service;

@Service
public class MunicipalityServiceImpl extends PersistentService<Municipality, Integer> implements MunicipalityService {
    public MunicipalityServiceImpl(MunicipalityRepository repository) {
        super(repository);
    }
}
