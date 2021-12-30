package com.rdrental.api.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdrental.api.entity.Usuario;

import com.rdrental.api.service.UsuarioService;


@RestController
@RequestMapping("/api/rdrental")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	
	@GetMapping("/usuarios/valida/{cod}/{clav}")
	public ResponseEntity<List<Usuario>> listaUsuarioPorCodClav(@PathVariable("cod") String cod,@PathVariable("clav") String clave){
		
		List<Usuario> lstUsuario = service.listaUsuarioPorCodClav(cod, clave);
		
		return ResponseEntity.ok(lstUsuario);
	}

}
