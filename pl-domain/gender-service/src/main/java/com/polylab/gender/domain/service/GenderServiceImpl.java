package com.polylab.gender.domain.service;

import com.jxareas.jxcore.domain.service.PersistentService;
import com.polylab.gender.persistence.model.Gender;
import com.polylab.gender.persistence.repository.GenderRepository;
import org.springframework.stereotype.Service;

@Service
public class GenderServiceImpl extends PersistentService<Gender, Integer> implements GenderService {
    public GenderServiceImpl(GenderRepository repository) {
        super(repository);
    }
}
