package com.rdrental.api.service;

import java.util.List;

import com.rdrental.api.entity.Usuario;




public interface UsuarioService {
	
	public abstract List<Usuario> listaUsuarios();
	
	public abstract List<Usuario> listaUsuarioPorNombre(String nombre);
	
	public abstract List<Usuario> listaUsuarioPorCodClav(String cod,String clave);
	
}