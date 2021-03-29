package com.montessori.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montessori.model.Boleta;
@Repository
public interface BoletaRepository extends JpaRepository<Boleta, Integer> {

}
