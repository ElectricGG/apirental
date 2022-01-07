package com.rdrental.api.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rdrental.api.entity.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{


	@Query("Select a from Usuario a where co_usua like :fil")
	public abstract List<Usuario> listaUsuarioPorNombre(@Param("fil") String filtro);
	
	@Query("Select a from Usuario a")
	public abstract List<Usuario> listaUsuarios();
	
	@Query("Select a from Usuario a where a.co_usua = :cod and a.no_clav = :clav and st_registro=1")
	public abstract List<Usuario> listaUsuarioPorCodClav(@Param("cod") String cod, @Param("clav") String clave);
	
	
	
	
}
