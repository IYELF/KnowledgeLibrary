package com.pactera.knowledge.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pactera.knowledge.entity.Subway;

public interface SubwayRepository extends CrudRepository<Subway, Long>{
    List<Subway> findAllByCityEnName(String cityEnName);
}
