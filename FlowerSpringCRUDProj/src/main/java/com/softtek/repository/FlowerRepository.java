package com.softtek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.entity.Flower;

public interface FlowerRepository extends JpaRepository<Flower,Integer> {

}
