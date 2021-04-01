package com.montessori.service;

import java.util.List;

import com.montessori.bean.AlumnoBean;
import com.montessori.bean.AlumnoBeanId;

public interface AlumnoService {
	
	public Integer saveAlumno(AlumnoBean alumnoBean/*, ProfesorBean profesorBean, BoletaBean boletaBean, CuentaBean cuentaBean*/); //Create
	public Integer saveAlumnoAll(AlumnoBeanId alumnoBeanId); //Create
	public boolean updateAlumno (AlumnoBeanId alumnoBeanId); //Update object
	public AlumnoBean findAlumnoById(Integer id); //Read by id
	public List<AlumnoBean> findAllAlumnos(); //Read all
	public boolean deleteAlumno (Integer idAlumno); //Delete object
	public List<AlumnoBeanId> alumnosMajaderos(int conducta);
	public List<AlumnoBeanId> alumnosPorEdad(int edad1, int edad2);

	public List<AlumnoBeanId> alumnosPorPromedio(double promedio);
	public boolean saveListAlumnos(List<AlumnoBeanId> alumnoBeanIdList);

}
