package com.montessori.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montessori.model.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{

}
