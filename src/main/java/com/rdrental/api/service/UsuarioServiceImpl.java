package com.rdrental.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdrental.api.entity.Usuario;

import com.rdrental.api.repository.UsuarioRepository;



@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repositorio;
	


	@Override
	public List<Usuario> listaUsuarios() {
		// TODO Auto-generated method stub
		return repositorio.listaUsuarios();
	}



	@Override
	public List<Usuario> listaUsuarioPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return repositorio.listaUsuarioPorNombre(nombre);
	}



	@Override
	public List<Usuario> listaUsuarioPorCodClav(String cod,String clave) {
		// TODO Auto-generated method stub
		return repositorio.listaUsuarioPorCodClav(cod,clave);
	}




}
