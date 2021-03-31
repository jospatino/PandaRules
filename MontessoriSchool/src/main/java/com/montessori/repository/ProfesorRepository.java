package com.montessori.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.montessori.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{

@Query(value= "select sum(sueldo_prof) from tb_profesor",nativeQuery = true)
public double nominaTotal();

}
