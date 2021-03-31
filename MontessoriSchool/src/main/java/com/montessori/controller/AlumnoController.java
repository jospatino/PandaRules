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

import com.montessori.bean.AbonarDeudaAlumnoBean;
import com.montessori.bean.AlumnoBean;
import com.montessori.bean.AlumnoBeanId;
import com.montessori.service.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
	@Autowired
	private AlumnoService alumnoService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> guardarAlumno(@RequestBody AlumnoBean alumnoBean){
		return new ResponseEntity<>(this.alumnoService.saveAlumno(alumnoBean), HttpStatus.OK);
	}
	
	@PostMapping("/saveAll")
	public ResponseEntity<Integer> guardarAlumnoId(@RequestBody AlumnoBeanId alumnoBeanId){
		return new ResponseEntity<>(this.alumnoService.saveAlumnoAll(alumnoBeanId), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarAlumno(@RequestBody AlumnoBeanId alumnoBeanId){
		return new ResponseEntity<>(this.alumnoService.updateAlumno(alumnoBeanId), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idAlumno}")
	public ResponseEntity<AlumnoBean> buscarAlumnoId(@PathVariable("idAlumno") Integer idAlumno){
		return new ResponseEntity<>(this.alumnoService.findAlumnoById(idAlumno), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<AlumnoBean>> mostrarTodosLosAlumno(){
		return new ResponseEntity<>(this.alumnoService.findAllAlumnos(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idAlumno}")
	public ResponseEntity<Boolean> eliminarPorId(@PathVariable("idAlumno") Integer idAlumno){
		return new ResponseEntity<>(this.alumnoService.deleteAlumno(idAlumno), HttpStatus.OK);
	}
	
	@GetMapping("/findAlumnosMajaderos/{conducta}")
	public ResponseEntity<List<AlumnoBeanId>> alumnosMajaderos(@PathVariable("conducta") Integer conducta){
		return new ResponseEntity<>(this.alumnoService.alumnosMajaderos(conducta), HttpStatus.OK);
	}
	
	@GetMapping("/findAlumnosPorEdad/{edad1}/{edad2}")
	public ResponseEntity<List<AlumnoBeanId>> alumnosPorEdad(@PathVariable("edad1") Integer edad1, @PathVariable("edad2") Integer edad2){
		return new ResponseEntity<>(this.alumnoService.alumnosPorEdad(edad1, edad2), HttpStatus.OK);
	}
	
	@GetMapping("/findAlumosPorProm/{promedio}")
	public ResponseEntity<List<AlumnoBeanId>> alumnosPorPromedio(@PathVariable("promedio") Double promedio){
		return new ResponseEntity<>(this.alumnoService.alumnosPorPromedio(promedio), HttpStatus.OK);
	}
	
	@PutMapping("/deleteList")
	public ResponseEntity<Boolean> eliminaListaAlumnos(@RequestBody List<AlumnoBeanId> listAlumnos){
		return new ResponseEntity<>(this.alumnoService.deleteAllList(listAlumnos),HttpStatus.OK);
	}
	
	@PutMapping("/abonoDeuda")
	public ResponseEntity<?> abonoDeuda(@RequestBody AbonarDeudaAlumnoBean abonoDeoudaAlumno){
		return new ResponseEntity<>(this.alumnoService.abonoeuda(abonoDeoudaAlumno),HttpStatus.OK);
	}

}
