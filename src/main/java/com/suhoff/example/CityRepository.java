package com.suhoff.example;

import org.springframework.data.keyvalue.repository.KeyValueRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * Created by Valeriy Suhotskiy <suhotskiy@gmail.com> on 20.11.18.
 */
public interface CityRepository extends KeyValueRepository<City, String>, QuerydslPredicateExecutor<City> {
}