package com.montessori.service;

import java.util.List;

import com.montessori.bean.AlumnoBean;

public interface AlumnoService {
	
	public Integer saveAlumno(AlumnoBean alumnoBean); //Create
	public boolean updateAlumno (AlumnoBean alumnoBean); //Update object
	public AlumnoBean findAlumnoById(Integer id); //Read by id
	public List<AlumnoBean> findAllAlumnos(); //Read all
	public boolean deleteAlumno (Integer idAlumno); //Delete object

}
