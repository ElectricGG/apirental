package com.rdrental.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rdrental.api.entity.Equipo;
import com.rdrental.api.service.EquipoService;

@Controller
@RequestMapping("/api/rdrental/equipos")
public class EquipoControlle {
	
	@Autowired
	private EquipoService service;
	
	@GetMapping("/equipos_por_linea/{co_linea}")
	public ResponseEntity<List<Equipo>> listaEquiposPorLinea(@PathVariable("co_linea") String co_linea){
		
		List<Equipo> lstEquipos_linea = service.listaUsuarioPorCodClav(co_linea);
		
		return ResponseEntity.ok(lstEquipos_linea);
	}
}
