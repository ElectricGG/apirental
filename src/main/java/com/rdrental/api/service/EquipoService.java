package com.rdrental.api.service;

import java.util.List;

import com.rdrental.api.entity.Equipo;

public interface EquipoService {
	public abstract List<Equipo> listaUsuarioPorCodClav(String co_linea);
}
