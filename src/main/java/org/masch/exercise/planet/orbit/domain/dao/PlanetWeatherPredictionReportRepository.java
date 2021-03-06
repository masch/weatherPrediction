package org.masch.exercise.planet.orbit.domain.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import org.masch.exercise.planet.orbit.domain.entity.PlanetWeatherPredictionReportEntity;


public interface PlanetWeatherPredictionReportRepository extends CrudRepository<PlanetWeatherPredictionReportEntity, Long> {

    Optional<PlanetWeatherPredictionReportEntity> findByName(String name);

}
