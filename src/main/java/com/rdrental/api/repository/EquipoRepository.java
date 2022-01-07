package com.rdrental.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rdrental.api.entity.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Integer>{
	@Query("Select e from Equipo e where e.st_registro=1 and e.co_linea = :co_linea")
	public abstract List<Equipo> listaEquiposPorLinea(@Param("co_linea") String co_linea);
}
