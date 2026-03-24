package com.sb.juices.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.juices.model.juice;

@Repository
public interface JuiceRepository extends JpaRepository<juice, Long> {
    // findAll(), save(), deleteById() automatic!
}