package com.sb.juices2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.juices2.model.juice;

@Repository
public interface JuiceRepository extends JpaRepository<juice, Long> {
    // findAll(), save(), deleteById() automatic!
}