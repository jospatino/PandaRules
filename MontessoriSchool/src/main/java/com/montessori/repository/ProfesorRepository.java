package com.montessori.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montessori.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{

}
