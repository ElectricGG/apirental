package com.rdrental.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdrental.api.entity.Linea;
import com.rdrental.api.repository.LineaRepository;


@Service
public class LineaServiceImpl implements LineaService{

	@Autowired
	private LineaRepository repositorio;
	
	@Override
	public List<Linea> listaLineas() {
		// TODO Auto-generated method stub
		return repositorio.listaLineas();
	}

	

}
