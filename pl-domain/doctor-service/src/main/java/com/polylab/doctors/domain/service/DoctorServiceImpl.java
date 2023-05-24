package com.polylab.doctors.domain.service;

import com.jxareas.jxcore.domain.service.PersistentService;
import com.polylab.doctors.persistence.model.Doctor;
import com.polylab.doctors.persistence.repository.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl extends PersistentService<Doctor, Integer> implements DoctorService {
    public DoctorServiceImpl(DoctorRepository repository) {
        super(repository);
    }
}
