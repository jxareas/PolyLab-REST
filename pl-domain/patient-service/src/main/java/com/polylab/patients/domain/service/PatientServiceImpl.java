package com.polylab.patients.domain.service;

import com.jxareas.jxcore.domain.service.PersistentService;
import com.polylab.patients.persistence.model.Patient;
import com.polylab.patients.persistence.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends PersistentService<Patient, Integer> implements PatientService {
    public PatientServiceImpl(PatientRepository repository) {
        super(repository);
    }
}
