package com.montessori.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.montessori.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

	@Query(value = "SELECT * FROM tb_alumno WHERE id_boleta IN (SELECT id_boleta FROM tb_boleta WHERE conducta = :conducta)", nativeQuery = true)
	List<Alumno> findAlumnosMajaderos(int conducta);
	
	@Query(value = "select * from tb_alumno where edad_alumno = :edad1 or edad_alumno = :edad2", nativeQuery = true)
	List<Alumno> findAlumnosPorEdad(int edad1, int edad2);
}
