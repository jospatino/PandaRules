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

import com.montessori.bean.ProfesorBean;
import com.montessori.service.ProfesorService;

@RequestMapping("/profesor")
@RestController
public class ProfesorController {
	
	@Autowired
	private ProfesorService profeService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> guardarProfesor(@RequestBody ProfesorBean profesorBean){
		return new ResponseEntity<>(this.profeService.saveProfesor(profesorBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarProfesor(@RequestBody ProfesorBean profesorBean){
		return new ResponseEntity<>(this.profeService.updateProfesor(profesorBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{IdProf}")
	public ResponseEntity<ProfesorBean> findProfesorById(@PathVariable("IdProf") Integer IdProf){
		return new ResponseEntity<>(this.profeService.findProfesorById(IdProf), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<ProfesorBean>> findAllProfesor(){
		return new ResponseEntity<>(this.profeService.mostrarProfesores(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{IdProf}")
	public ResponseEntity<Boolean> eliminarProfesor(@PathVariable("IdProf") Integer IdProf){
		return new ResponseEntity<>(this.profeService.deleteProfesorById(IdProf), HttpStatus.OK);
	}

}
