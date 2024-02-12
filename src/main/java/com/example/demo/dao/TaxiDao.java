package com.example.demo.dao;

import com.example.demo.models.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxiDao extends JpaRepository<Taxi, Integer> {
}
