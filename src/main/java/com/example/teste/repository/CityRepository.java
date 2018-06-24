/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.teste.repository;

import com.example.teste.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author souno
 */
public interface CityRepository extends JpaRepository<City, Long>{
    
}
