package com.sb.juices.service;

import com.sb.juices.model.juice;
import com.sb.juices.repository.JuiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuiceService {

    @Autowired
    private JuiceRepository repo;

    public List<juice> getAll() {
        return repo.findAll();
    }

    public juice save(juice j) {
        return repo.save(j);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}