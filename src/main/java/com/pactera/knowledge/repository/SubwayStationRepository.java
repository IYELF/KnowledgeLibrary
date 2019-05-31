package com.pactera.knowledge.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pactera.knowledge.entity.SubwayStation;

public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
