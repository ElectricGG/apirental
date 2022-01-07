package com.rdrental.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdrental.api.entity.Equipo;
import com.rdrental.api.repository.EquipoRepository;

@Service
public class EquipoServiceImpl implements EquipoService{

	@Autowired
	private EquipoRepository repositorio;
	
	@Override
	public List<Equipo> listaUsuarioPorCodClav(String co_linea) {
		// TODO Auto-generated method stub
		return repositorio.listaEquiposPorLinea(co_linea);
	}

}
