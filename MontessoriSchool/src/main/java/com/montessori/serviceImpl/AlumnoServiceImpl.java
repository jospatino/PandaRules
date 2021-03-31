package com.montessori.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.montessori.bean.AlumnoBean;
import com.montessori.bean.AlumnoBeanId;
import com.montessori.bean.BoletaBean;
import com.montessori.bean.CuentaBean;
import com.montessori.bean.ProfesorBean;
import com.montessori.model.Alumno;
import com.montessori.model.Boleta;
import com.montessori.model.Cuenta;
import com.montessori.model.Profesor;
import com.montessori.repository.AlumnoRepository;
import com.montessori.repository.BoletaRepository;
import com.montessori.repository.CuentaRepository;
import com.montessori.repository.ProfesorRepository;
import com.montessori.service.AlumnoService;

@Service
@Transactional
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	AlumnoRepository alumnoRepo;
	
	@Autowired
	ProfesorRepository profesorRepo;
	
	@Autowired
	BoletaRepository boletaRepo;
	
	@Autowired
	CuentaRepository cuentaRepo;

	@Override
	public Integer saveAlumno(AlumnoBean alumnoBean) {
		
		Alumno alumno = new Alumno();

		
		alumno.setNombreAl(alumnoBean.getNombreAl());
		alumno.setAppAl(alumnoBean.getAppAl());
		alumno.setApmAl(alumnoBean.getApmAl());
		alumno.setEdadAl(alumnoBean.getEdadAl());
		alumno.setSexoAl(alumnoBean.getSexoAl());

		
		alumnoRepo.save(alumno);

		
		return alumno.getIdAlumno();
	}
	
	@Override
	public Integer saveAlumnoAll(AlumnoBeanId alumnoBeanId) {
		
		Alumno alumno = new Alumno();
		
		Profesor profesor = this.profesorRepo.findById(alumnoBeanId.getIdProf()).orElseThrow();
		
		Boleta boleta = this.boletaRepo.findById(alumnoBeanId.getIdBoleta()).orElseThrow();
		
		Cuenta cuenta = this.cuentaRepo.findById(alumnoBeanId.getIdCuenta()).orElseThrow();
		
		alumno.setNombreAl(alumnoBeanId.getNombreAl());
		alumno.setAppAl(alumnoBeanId.getAppAl());
		alumno.setApmAl(alumnoBeanId.getApmAl());
		alumno.setEdadAl(alumnoBeanId.getEdadAl());
		alumno.setSexoAl(alumnoBeanId.getSexoAl());
	
		alumno.setProfesor(profesor);
		alumno.setCuenta(cuenta);
		alumno.setBoleta(boleta);

		alumnoRepo.save(alumno);

		
		return alumno.getIdAlumno();
	}

	@Override
	public boolean updateAlumno(AlumnoBeanId alumnoBeanId) {
		
		Alumno alumno = this.alumnoRepo.findById(alumnoBeanId.getIdAlumno()).orElseThrow();
		
        Profesor profesor = this.profesorRepo.findById(alumnoBeanId.getIdProf()).orElseThrow();
		
		Boleta boleta = this.boletaRepo.findById(alumnoBeanId.getIdBoleta()).orElseThrow();
		
		Cuenta cuenta = this.cuentaRepo.findById(alumnoBeanId.getIdCuenta()).orElseThrow();
		
		BeanUtils.copyProperties(alumnoBeanId, alumno);
		alumno.setProfesor(profesor);
		alumno.setBoleta(boleta);
		alumno.setCuenta(cuenta);
		
		this.alumnoRepo.save(alumno);
		return true;
	}

	@Override
	public AlumnoBean findAlumnoById(Integer id) {
		
		Alumno alumno = this.alumnoRepo.findById(id).orElseThrow();
		AlumnoBean alumnoBean = new AlumnoBean();
		ProfesorBean profesorBean = new ProfesorBean();
		
		BeanUtils.copyProperties(alumno.getProfesor(), profesorBean);
		
		BoletaBean boletaBean = new BoletaBean();
		BeanUtils.copyProperties(alumno.getBoleta(), boletaBean);
		
		CuentaBean cuentaBean = new CuentaBean();
		BeanUtils.copyProperties(alumno.getCuenta(), cuentaBean);
		
		BeanUtils.copyProperties(alumno, alumnoBean);
		alumnoBean.setIdProf(profesorBean);
		alumnoBean.setIdBoleta(boletaBean);
		alumnoBean.setIdCuenta(cuentaBean);
		
		return alumnoBean;
	}

	@Override
	public List<AlumnoBean> findAllAlumnos() {
		
		List<Alumno> alumnoList = this.alumnoRepo.findAll();
		List<AlumnoBean> alumnoBeanList = new ArrayList<>();
		
		for(Alumno alumno : alumnoList) {
			AlumnoBean alumnoBean = new AlumnoBean();
			ProfesorBean profesorBean = new ProfesorBean();
			
			BeanUtils.copyProperties(alumno.getProfesor(), profesorBean);
			
			BoletaBean boletaBean = new BoletaBean();
			BeanUtils.copyProperties(alumno.getBoleta(), boletaBean);
			
			CuentaBean cuentaBean = new CuentaBean();
			BeanUtils.copyProperties(alumno.getCuenta(), cuentaBean);
			
			BeanUtils.copyProperties(alumno, alumnoBean);
			alumnoBean.setIdProf(profesorBean);
			alumnoBean.setIdBoleta(boletaBean);
			alumnoBean.setIdCuenta(cuentaBean);
			
			alumnoBeanList.add(alumnoBean);
		}
		
		return alumnoBeanList;
	}

	@Override
	public boolean deleteAlumno(Integer idAlumno) {
		
		Alumno alumno = this.alumnoRepo.findById(idAlumno).orElseThrow();
		
		this.alumnoRepo.delete(alumno);
		
		return true;
	}

	@Override
	public List<AlumnoBeanId> alumnosMajaderos(int conducta) {
		List<Alumno> alumnoList = this.alumnoRepo.findAlumnosMajaderos(conducta);
		List<AlumnoBeanId> alumnoBeanList = new ArrayList<AlumnoBeanId>();
		
		for(Alumno alumno : alumnoList) {
			AlumnoBeanId alumnoBean = new AlumnoBeanId();
			BeanUtils.copyProperties(alumno, alumnoBean);
			alumnoBean.setIdBoleta(alumno.getBoleta().getIdBoleta());
			alumnoBean.setIdCuenta(alumno.getCuenta().getIdCuenta());
			alumnoBean.setIdProf(alumno.getProfesor().getIdProf());
			
			alumnoBeanList.add(alumnoBean);
		}
		return alumnoBeanList;
 	}

	@Override
	public List<AlumnoBeanId> alumnosPorEdad(int edad1, int edad2) {
		List<Alumno> alumnoList = this.alumnoRepo.findAlumnosPorEdad(edad1, edad2);
		List<AlumnoBeanId> alumnoBeanList = new ArrayList<AlumnoBeanId>();
		
		for(Alumno alumno : alumnoList) {
			AlumnoBeanId alumnoBean = new AlumnoBeanId();
			BeanUtils.copyProperties(alumno, alumnoBean);
			alumnoBean.setIdBoleta(alumno.getBoleta().getIdBoleta());
			alumnoBean.setIdCuenta(alumno.getCuenta().getIdCuenta());
			alumnoBean.setIdProf(alumno.getProfesor().getIdProf());
			
			alumnoBeanList.add(alumnoBean);
		}
		return alumnoBeanList;
 	}

	@Override
	public List<AlumnoBean> findAllAlumnosRep() {
		List<Alumno> alumnoList = this.alumnoRepo.findAllAlumnosRep();
		List<AlumnoBean> alumnoBeanList = new ArrayList<>();
		
		for (Alumno alumno : alumnoList) {
			AlumnoBean alumnoBean = new AlumnoBean();
			
			BeanUtils.copyProperties(alumno, alumnoBean);
			//alumno.setBoleta(new Boleta(alumnoBean.getIdBoleta().getIdBoleta()));
			
			alumnoBeanList.add(alumnoBean);
		}
		
		return alumnoBeanList;
	}

}
