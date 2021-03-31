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
	
	@Query(value = "SELECT * FROM tb_alumno WHERE id_cuenta IN (SELECT id_cuenta FROM cuenta WHERE prom_beca = :promedio)", nativeQuery = true)
	List<Alumno> findAlumnosPorPromedio(double promedio);
	
	@Query(value = "SELECT * FROM tb_alumno WHERE id_cuenta IN (SELECT id_cuenta FROM cuenta WHERE prom_beca >= 9.5)", nativeQuery = true)
	List<Alumno> findAlumnosCuadroDeHonor();
	
	@Query(value = "SELECT * FROM tb_alumno INNER JOIN cuenta ON tb_alumno.id_cuenta = cuenta.id_cuenta WHERE deuda > 0", nativeQuery =  true)
	List<Alumno> findAlumnosDeuda();
	
}
