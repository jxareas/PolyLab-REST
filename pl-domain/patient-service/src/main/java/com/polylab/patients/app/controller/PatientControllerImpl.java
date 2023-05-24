package com.polylab.patients.app.controller;

import com.jxareas.jxcore.app.controller.AppController;
import com.polylab.patients.app.dto.PatientDto;
import com.polylab.patients.app.mapper.PatientDtoMapper;
import com.polylab.patients.domain.service.PatientService;
import com.polylab.patients.persistence.model.Patient;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/patients")
@Tag(name = "Patients", description = "Registered patients.")
public class PatientControllerImpl extends AppController<PatientDto, Patient, Integer> implements PatientController {
    public PatientControllerImpl(PatientService domainService, PatientDtoMapper mapper) {
        super(domainService, mapper);
    }
}
