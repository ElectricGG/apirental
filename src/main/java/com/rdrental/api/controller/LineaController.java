package com.rdrental.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import com.rdrental.api.entity.Linea;

import com.rdrental.api.service.LineaService;

@Controller
@RequestMapping("/api/rdrental/lineas")
public class LineaController {
	@Autowired
	private LineaService service;
	
	
	@GetMapping("/listado")
	public ResponseEntity<List<Linea>> listaUsuarioPorCodClav(){
		
		List<Linea> lstLineas = service.listaLineas();
		
		return ResponseEntity.ok(lstLineas);
	}
	
	
	
}
