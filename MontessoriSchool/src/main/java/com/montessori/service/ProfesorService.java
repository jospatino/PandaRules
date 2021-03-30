package com.montessori.service;

import java.util.List;

import com.montessori.bean.ProfesorBean;

public interface ProfesorService {
	public Integer saveProfesor(ProfesorBean profesorBean);
	public boolean updateProfesor(ProfesorBean profesorBean);
	public ProfesorBean findProfesorById(Integer idProf);
	public List<ProfesorBean> mostrarProfesores();
	public boolean deleteProfesorById(Integer idProf);
}
