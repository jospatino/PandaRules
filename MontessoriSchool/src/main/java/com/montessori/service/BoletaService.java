package com.montessori.service;

import java.util.List;

import com.montessori.bean.BoletaBean;
import com.montessori.model.Boleta;

public interface BoletaService {

	List<BoletaBean> findAllBoleta();
	BoletaBean findBoletaById(int id);
	Integer saveBoleta(BoletaBean boletaBean);
	boolean updateBoleta(BoletaBean boletaBean);
	boolean deleteBoleta(int id);
}
