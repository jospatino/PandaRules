package com.montessori.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montessori.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
