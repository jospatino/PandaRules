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

import com.montessori.bean.CuentaBean;
import com.montessori.service.CuentaService;

@RestController
@RequestMapping("/cuenta")
public class CuentaController{
	@Autowired
	private CuentaService cuentaService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarCuenta(@RequestBody CuentaBean cuentaBean){
		return new ResponseEntity<>(this.cuentaService.saveCuenta(cuentaBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idCuenta}")
	public ResponseEntity<CuentaBean> buscarPorIdCuenta(@PathVariable("idCuenta") Integer idCuenta){
		return new ResponseEntity<>(this.cuentaService.findByIdCuenta(idCuenta), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<CuentaBean>> mostrarTodasCuenta(){
		return new ResponseEntity<>(this.cuentaService.findAllCuentas(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarCuenta(@RequestBody CuentaBean cuentaBean){
		return new ResponseEntity<>(this.cuentaService.updateCuenta(cuentaBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Boolean> eliminarCuenta(@RequestBody CuentaBean cuentaBean){
		return new ResponseEntity<>(this.cuentaService.deleteCuenta(cuentaBean), HttpStatus.OK);
	}
}
