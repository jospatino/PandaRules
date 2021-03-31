package com.montessori.service;

import java.util.List;

import com.montessori.bean.ProfesorBean;
import com.montessori.bean.ProfesorSueldoBean;

public interface ProfesorService {
	public Integer saveProfesor(ProfesorBean profesorBean);
	public boolean updateProfesor(ProfesorBean profesorBean);
	public ProfesorBean findProfesorById(Integer idProf);
	public List<ProfesorBean> mostrarProfesores();
	public boolean deleteProfesorById(Integer idProf);
	
	public ProfesorSueldoBean sueldoProfesor(Integer id);
}
