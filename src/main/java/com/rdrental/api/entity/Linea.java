package com.rdrental.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "gr_tmlinea")
public class Linea {
	
	@Id
	private String co_linea;
	private String no_linea;
	private String co_usua_crea;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fe_usua_crea;
	
	private String co_usua_modi;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fe_usua_modi;
	
	private String st_linea;
	private Boolean st_registro;

	
	
	
	
	public String getCo_linea() {
		return co_linea;
	}
	public void setCo_linea(String co_linea) {
		this.co_linea = co_linea;
	}
	public String getNo_linea() {
		return no_linea;
	}
	public void setNo_linea(String no_linea) {
		this.no_linea = no_linea;
	}
	public String getCo_usua_crea() {
		return co_usua_crea;
	}
	public void setCo_usua_crea(String co_usua_crea) {
		this.co_usua_crea = co_usua_crea;
	}
	public Date getFe_usua_crea() {
		return fe_usua_crea;
	}
	public void setFe_usua_crea(Date fe_usua_crea) {
		this.fe_usua_crea = fe_usua_crea;
	}
	public String getCo_usua_modi() {
		return co_usua_modi;
	}
	public void setCo_usua_modi(String co_usua_modi) {
		this.co_usua_modi = co_usua_modi;
	}
	public Date getFe_usua_modi() {
		return fe_usua_modi;
	}
	public void setFe_usua_modi(Date fe_usua_modi) {
		this.fe_usua_modi = fe_usua_modi;
	}
	public String getSt_linea() {
		return st_linea;
	}
	public void setSt_linea(String st_linea) {
		this.st_linea = st_linea;
	}
	public Boolean getSt_registro() {
		return st_registro;
	}
	public void setSt_registro(Boolean st_registro) {
		this.st_registro = st_registro;
	}
	public Linea(String co_linea, String no_linea, String co_usua_crea, Date fe_usua_crea, String co_usua_modi,
			Date fe_usua_modi, String st_linea, Boolean st_registro) {
		super();
		this.co_linea = co_linea;
		this.no_linea = no_linea;
		this.co_usua_crea = co_usua_crea;
		this.fe_usua_crea = fe_usua_crea;
		this.co_usua_modi = co_usua_modi;
		this.fe_usua_modi = fe_usua_modi;
		this.st_linea = st_linea;
		this.st_registro = st_registro;
	}
	

	
	
	
	
}
