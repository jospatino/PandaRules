package com.montessori.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montessori.bean.BoletaBean;
import com.montessori.service.BoletaService;

@RestController
@RequestMapping("/boleta")
public class BoletaController {

	@Autowired
	BoletaService boletaService;
	
	@GetMapping
	public ResponseEntity<List<BoletaBean>> findAllBoleta(){
		return new ResponseEntity<>(this.boletaService.findAllBoleta(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Integer> saveBoleta(@RequestBody BoletaBean boletaBean){
		return new ResponseEntity<>(this.boletaService.saveBoleta(boletaBean),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BoletaBean> findBoletaById(@PathVariable int id){
		return new ResponseEntity<>(this.boletaService.findBoletaById(id),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Boolean> updateBoleta(@RequestBody BoletaBean boletaBean){
		return new ResponseEntity<>(this.boletaService.updateBoleta(boletaBean),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Boolean> deleteBoleta(@PathVariable int id){
		return new ResponseEntity<>(this.boletaService.deleteBoleta(id),HttpStatus.OK);
	}
}
