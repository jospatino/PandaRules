package com.montessori.service;

import java.util.List;

import com.montessori.bean.CuentaBean;

public interface CuentaService {
	
	public boolean saveCuenta(CuentaBean cuentaBean);
	public CuentaBean findByIdCuenta(Integer id);
	public List<CuentaBean> findAllCuentas();
	public boolean updateCuenta(CuentaBean cuentaBean);
	public boolean deleteCuenta(Integer id);
	
	public boolean updatePromBeca();

}
