package com.rdrental.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rdrental.api.entity.Linea;

public interface LineaRepository extends JpaRepository<Linea, Integer>{

	@Query("Select new Linea(a.co_linea,a.no_linea,a.co_usua_crea,a.fe_usua_crea,a.co_usua_modi,a.fe_usua_modi,a.st_linea,a.st_registro) from Linea a where a.st_registro=1 order by a.no_linea asc")
	public abstract List<Linea> listaLineas();
	
	
	
}
