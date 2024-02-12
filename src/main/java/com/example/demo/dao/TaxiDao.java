package com.example.demo.dao;

import com.example.demo.models.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxiDao extends JpaRepository<Taxi, Integer> {
}
