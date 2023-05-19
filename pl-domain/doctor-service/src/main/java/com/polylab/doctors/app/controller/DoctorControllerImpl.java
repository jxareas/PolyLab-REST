package com.polylab.doctors.app.controller;

import com.jxareas.jxcore.app.controller.CrudController;
import com.polylab.doctors.app.dto.DoctorDto;
import com.polylab.doctors.app.mapper.DoctorDtoMapper;
import com.polylab.doctors.domain.service.DoctorService;
import com.polylab.doctors.persistence.model.Doctor;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/doctors")
@Tag(name = "Doctors", description = "Registered doctors.")
public class DoctorControllerImpl extends CrudController<DoctorDto, Doctor, Integer> implements DoctorController {
    public DoctorControllerImpl(DoctorService domainService, DoctorDtoMapper mapper) {
        super(domainService, mapper);
    }
}
