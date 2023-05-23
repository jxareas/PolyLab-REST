package com.polylab.countries.persistence.repository;

import com.jxareas.jxcore.persistence.repository.DefaultRepository;
import com.polylab.countries.persistence.model.Country;
import org.jetbrains.annotations.NotNull;
import org.springframework.lang.NonNull;

import java.util.List;

public interface CountryRepository extends DefaultRepository<Country, Integer> {
}
