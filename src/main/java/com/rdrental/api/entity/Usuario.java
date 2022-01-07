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
@Table(name = "ad_tmusua")
public class Usuario {
	
	
	
	private String co_usua;
	private String co_grup;
	
	private String co_perf;
	
	private String no_usua;
	
	private String no_clav;
    
	private Date fe_modi_clav;
	
	private String st_expi_clav;
	
	@JsonFormat(pattern =  "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fe_expi_clav;   
	
	private String st_expi_usua ;  
	
	@JsonFormat(pattern =  "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fe_expi_usua  ; 
	private String st_adm  ;
	private String co_usua_crea;  
	private Date fe_usua_crea ; 
	private String st_usua;   
	private String de_correo;  
	private String co_usua_modi;  
	
	@JsonFormat(pattern =  "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fe_usua_modi;  
	private Boolean st_registro;  
	private String nu_telef1;  
	private String nu_telef2;   
	private String ti_linea1;  
	private String ti_linea2;  
	private String fondo;  
	private String nu_anexo;   
	private String co_sucu_usuario;  
	private String no_iniciales_usu  ;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identificador")
	private int id;

	public String getCo_usua() {
		return co_usua;
	}

	public void setCo_usua(String co_usua) {
		this.co_usua = co_usua;
	}

	public String getCo_grup() {
		return co_grup;
	}

	public void setCo_grup(String co_grup) {
		this.co_grup = co_grup;
	}

	public String getCo_perf() {
		return co_perf;
	}

	public void setCo_perf(String co_perf) {
		this.co_perf = co_perf;
	}

	public String getNo_usua() {
		return no_usua;
	}

	public void setNo_usua(String no_usua) {
		this.no_usua = no_usua;
	}

	public String getNo_clav() {
		return no_clav;
	}

	public void setNo_clav(String no_clav) {
		this.no_clav = no_clav;
	}

	public Date getFe_modi_clav() {
		return fe_modi_clav;
	}

	public void setFe_modi_clav(Date fe_modi_clav) {
		this.fe_modi_clav = fe_modi_clav;
	}

	public String getSt_expi_clav() {
		return st_expi_clav;
	}

	public void setSt_expi_clav(String st_expi_clav) {
		this.st_expi_clav = st_expi_clav;
	}

	public Date getFe_expi_clav() {
		return fe_expi_clav;
	}

	public void setFe_expi_clav(Date fe_expi_clav) {
		this.fe_expi_clav = fe_expi_clav;
	}

	public String getSt_expi_usua() {
		return st_expi_usua;
	}

	public void setSt_expi_usua(String st_expi_usua) {
		this.st_expi_usua = st_expi_usua;
	}

	public Date getFe_expi_usua() {
		return fe_expi_usua;
	}

	public void setFe_expi_usua(Date fe_expi_usua) {
		this.fe_expi_usua = fe_expi_usua;
	}

	public String getSt_adm() {
		return st_adm;
	}

	public void setSt_adm(String st_adm) {
		this.st_adm = st_adm;
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

	public String getSt_usua() {
		return st_usua;
	}

	public void setSt_usua(String st_usua) {
		this.st_usua = st_usua;
	}

	public String getDe_correo() {
		return de_correo;
	}

	public void setDe_correo(String de_correo) {
		this.de_correo = de_correo;
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

	public Boolean getSt_registro() {
		return st_registro;
	}

	public void setSt_registro(Boolean st_registro) {
		this.st_registro = st_registro;
	}

	public String getNu_telef1() {
		return nu_telef1;
	}

	public void setNu_telef1(String nu_telef1) {
		this.nu_telef1 = nu_telef1;
	}

	public String getNu_telef2() {
		return nu_telef2;
	}

	public void setNu_telef2(String nu_telef2) {
		this.nu_telef2 = nu_telef2;
	}

	public String getTi_linea1() {
		return ti_linea1;
	}

	public void setTi_linea1(String ti_linea1) {
		this.ti_linea1 = ti_linea1;
	}

	public String getTi_linea2() {
		return ti_linea2;
	}

	public void setTi_linea2(String ti_linea2) {
		this.ti_linea2 = ti_linea2;
	}

	public String getFondo() {
		return fondo;
	}

	public void setFondo(String fondo) {
		this.fondo = fondo;
	}

	public String getNu_anexo() {
		return nu_anexo;
	}

	public void setNu_anexo(String nu_anexo) {
		this.nu_anexo = nu_anexo;
	}

	public String getCo_sucu_usuario() {
		return co_sucu_usuario;
	}

	public void setCo_sucu_usuario(String co_sucu_usuario) {
		this.co_sucu_usuario = co_sucu_usuario;
	}

	public String getNo_iniciales_usu() {
		return no_iniciales_usu;
	}

	public void setNo_iniciales_usu(String no_iniciales_usu) {
		this.no_iniciales_usu = no_iniciales_usu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}


