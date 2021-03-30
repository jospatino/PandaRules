package com.montessori.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montessori.bean.CuentaBean;
import com.montessori.model.Cuenta;
import com.montessori.repository.CuentaRepository;
import com.montessori.service.CuentaService;

@Service
@Transactional
public class CuentaServiceImpl implements CuentaService{
	
	@Autowired
	private CuentaRepository cuentaRepo;

	@Override
	public boolean saveCuenta(CuentaBean cuentaBean) {
		Cuenta cuenta= new Cuenta();
		
		BeanUtils.copyProperties(cuentaBean, cuenta);
		
		cuentaRepo.save(cuenta);
		
		return true;
	}

	@Override
	public CuentaBean findByIdCuenta(Integer id) {
		Cuenta cuenta = this.cuentaRepo.findById(id).orElseThrow();
		CuentaBean cuentaBean = new CuentaBean();
		
		BeanUtils.copyProperties(cuenta, cuentaBean);
		
		return cuentaBean;
	}

	@Override
	public List<CuentaBean> findAllCuentas() {
		List<Cuenta> cuentaList = this.cuentaRepo.findAll();
		List<CuentaBean> cuentaBeanList = new ArrayList<>();
		
		for(Cuenta cuenta : cuentaList) {
			CuentaBean cuentaBean = new CuentaBean();
			BeanUtils.copyProperties(cuenta, cuentaBean);
			cuentaBeanList.add(cuentaBean);			
		}
		
		return cuentaBeanList;
	}

	@Override
	public boolean updateCuenta(CuentaBean cuentaBean) {
		Cuenta cuenta = this.cuentaRepo.findById(cuentaBean.getIdCuenta()).orElseThrow();
		
		BeanUtils.copyProperties(cuentaBean, cuenta);
		this.cuentaRepo.save(cuenta);
		
		return true;
	}

	@Override
	public boolean deleteCuenta(CuentaBean cuentaBean) {
		Cuenta cuenta = this.cuentaRepo.findById(cuentaBean.getIdCuenta()).orElseThrow();
		this.cuentaRepo.delete(cuenta);
		return true;
	}
	
}
