package com.nisum.interview.entity;

import com.nisum.interview.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}