package com.montessori.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montessori.bean.AlumnoBean;
import com.montessori.bean.NominaTotalProfesores;
import com.montessori.bean.ProfesorBean;
import com.montessori.bean.ProfesorConAlumnoBean;
import com.montessori.bean.ProfesorSueldoBean;
import com.montessori.model.Alumno;
import com.montessori.model.Profesor;
import com.montessori.repository.ProfesorRepository;
import com.montessori.service.ProfesorService;

@Service
@Transactional
public class ProfesorServiceImpl implements ProfesorService{

	@Autowired
	private ProfesorRepository profesorRepo;
	
	@Override
	public Integer saveProfesor(ProfesorBean profesorBean) {
		
		Profesor prof = new Profesor();
		
		prof.setNomProf(profesorBean.getNomProf());
		prof.setAppProf(profesorBean.getAppProf());
		prof.setApmProf(profesorBean.getApmProf());
		prof.setEdad(profesorBean.getEdad());
		prof.setSexoProf(profesorBean.getSexoProf());
		prof.setRfc(profesorBean.getRfc());
		prof.setSueldoProf(profesorBean.getSueldoProf());
		
		profesorRepo.save(prof);
		
		return prof.getIdProf();
	}

	@Override
	public boolean updateProfesor(ProfesorBean profesorBean) {
		
		Profesor prof = this.profesorRepo.findById(profesorBean.getIdProf()).orElseThrow();
		
		prof.setNomProf(profesorBean.getNomProf());
		prof.setAppProf(profesorBean.getAppProf());
		prof.setApmProf(profesorBean.getApmProf());
		prof.setEdad(profesorBean.getEdad());
		prof.setSexoProf(profesorBean.getSexoProf());
		prof.setRfc(profesorBean.getRfc());
		prof.setSueldoProf(profesorBean.getSueldoProf());
		
		profesorRepo.save(prof);
		
		return true;
	}

	@Override
	public ProfesorBean findProfesorById(Integer idProf) {
		
		Profesor prof = profesorRepo.findById(idProf).orElseThrow();
		ProfesorBean profBean = new ProfesorBean();
		
		BeanUtils.copyProperties(prof, profBean);
			
		return profBean;
	}

	@Override
	public List<ProfesorBean> mostrarProfesores() {
		
		List<Profesor> profList = this.profesorRepo.findAll();
		List<ProfesorBean> profBeanList = new ArrayList<>();
		
		for(Profesor prof : profList) {
			ProfesorBean profBean = new ProfesorBean();
			BeanUtils.copyProperties(prof, profBean);
			profBeanList.add(profBean);
		}
		
		return profBeanList;
	}

	@Override
	public boolean deleteProfesorById(Integer idProf) {
		
		Profesor prof = this.profesorRepo.findById(idProf).orElseThrow();
		profesorRepo.delete(prof);
		
		return true;
	}

	@Override
	public ProfesorSueldoBean sueldoProfesor(Integer id) {
		Profesor profesor = this.profesorRepo.findById(id).orElseThrow();
		ProfesorSueldoBean profesorSueldoBean = new ProfesorSueldoBean(profesor.getSueldoProf());
		return profesorSueldoBean;	
	}

	@Override
	public NominaTotalProfesores nominaTotalProfesores() {
		NominaTotalProfesores nomina = new NominaTotalProfesores();
		nomina.setNominaTotal(this.profesorRepo.nominaTotal());
		return nomina;
	}

	@Override
	public ProfesorConAlumnoBean mostrarAlumnosProfesor(Integer IdProf) {
		
		Profesor profe = this.profesorRepo.findById(IdProf).orElseThrow();
		ProfesorConAlumnoBean profConAlumnBean = new ProfesorConAlumnoBean();
		List<AlumnoBean> alumnoBeanList = new ArrayList<>();
		
		for (Alumno alumno : profe.getAlumno()) {
			AlumnoBean alumnoBean = new AlumnoBean();
			
			BeanUtils.copyProperties(alumno, alumnoBean);
			//alumnoBean.setIdBoleta(alumno.getBoleta().getIdBoleta());;
			alumnoBean.setIdProf(alumno.getProfesor().getIdProf());
			
			alumnoBeanList.add(alumnoBean);
		}
		
		BeanUtils.copyProperties(profe, profConAlumnBean);
		profConAlumnBean.setAlumnoBeanList(alumnoBeanList);
		
		return profConAlumnBean;
	}
	
}
