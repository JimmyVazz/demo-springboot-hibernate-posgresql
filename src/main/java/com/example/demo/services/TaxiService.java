package com.example.demo.services;

import com.example.demo.models.Taxi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TaxiService {
    Page<Taxi> findAll(Pageable pageable);
}
