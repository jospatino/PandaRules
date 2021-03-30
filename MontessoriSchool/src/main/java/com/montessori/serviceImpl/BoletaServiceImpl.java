package com.montessori.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montessori.bean.BoletaBean;
import com.montessori.model.Boleta;
import com.montessori.repository.BoletaRepository;
import com.montessori.service.BoletaService;

@Service
@Transactional
public class BoletaServiceImpl implements BoletaService{

	@Autowired
	BoletaRepository boletaRepository;
	
	@Override
	public List<BoletaBean> findAllBoleta() {
		List<Boleta> boletaList=this.boletaRepository.findAll();
		List<BoletaBean> boletaBeanList=new ArrayList<>();
		for(Boleta boleta:boletaList) {
			BoletaBean boletaBean= new BoletaBean();
			BeanUtils.copyProperties(boleta, boletaBean);
			boletaBeanList.add(boletaBean);
		}
		return boletaBeanList;
	}

	@Override
	public BoletaBean findBoletaById(int id) {
		Boleta boleta= this.boletaRepository.findById(id).orElseThrow();
		BoletaBean boletaBean = new BoletaBean();
		BeanUtils.copyProperties(boleta, boletaBean);
		return boletaBean;
	}

	@Override
	public Integer saveBoleta(BoletaBean boletaBean) {
		Boleta boleta=new Boleta();
		BeanUtils.copyProperties(boletaBean, boleta);
		this.boletaRepository.save(boleta);
		return boleta.getIdBoleta();
		
		
	}

	@Override
	public boolean updateBoleta(BoletaBean boletaBean) {
		Boleta boleta= this.boletaRepository.findById(boletaBean.getIdBoleta()).orElseThrow();
		BeanUtils.copyProperties(boletaBean, boleta);
		this.boletaRepository.save(boleta);
		return true;
	}

	@Override
	public boolean deleteBoleta(int id) {
		Boleta boleta= this.boletaRepository.findById(id).orElseThrow();
		this.boletaRepository.delete(boleta);
		return true;
	}

}
