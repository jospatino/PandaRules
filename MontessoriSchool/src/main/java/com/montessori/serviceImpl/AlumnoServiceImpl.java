package com.montessori.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.montessori.bean.AlumnoBean;
import com.montessori.model.Alumno;
import com.montessori.repository.AlumnoRepository;
import com.montessori.service.AlumnoService;

@Service
@Transactional
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	AlumnoRepository alumnoRepo;

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
	public boolean updateAlumno(AlumnoBean alumnoBean) {
		
		Alumno alumno = this.alumnoRepo.findById(alumnoBean.getIdAlumno()).orElseThrow();
		BeanUtils.copyProperties(alumnoBean, alumno);
		this.alumnoRepo.save(alumno);
		return true;
	}

	@Override
	public AlumnoBean findAlumnoById(Integer id) {
		
		Alumno alumno = this.alumnoRepo.findById(id).orElseThrow();
		AlumnoBean alumnoBean = new AlumnoBean();
		BeanUtils.copyProperties(alumno, alumnoBean);
		
		
		return alumnoBean;
	}

	@Override
	public List<AlumnoBean> findAllAlumnos() {
		
		List<Alumno> alumnoList = this.alumnoRepo.findAll();
		List<AlumnoBean> alumnoBeanList = new ArrayList<>();
		
		for(Alumno alumno : alumnoList) {
			AlumnoBean alumnoBean = new AlumnoBean();
			BeanUtils.copyProperties(alumno, alumnoBean);
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

}
