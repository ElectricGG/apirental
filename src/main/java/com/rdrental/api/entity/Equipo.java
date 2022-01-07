package com.rdrental.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "dr_tmequipo")
public class Equipo {
	
	@Id
	private String co_equipo;
	private String co_autogenerado;
	private String co_sublinea;
	private String co_linea;
	private Double nu_potcap;
	private String co_unimed_e;
	private String nu_pedido;
	private String co_ref;
	private String no_equipo;
	private String no_mod_eq;
	private String co_marca;
	private String nu_ser_eq;
	private String nu_factura;
	private String nu_guia;
	private Double im_valsigv;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fe_ingre;
	private Double nu_horo_ent;
	private Integer nu_anio_fab;
	private Date fe_ven_gar;
	private Double nu_con_com;
	private Double nu_cap_tan;
	private Integer ti_comb;
	private Double nu_horo_gar;
	private Double nu_peso_eq;
	private String co_unimed_p;
	private Double nu_anc_eq;
	private Double nu_lar_eq;
	private Double nu_alt_eq;
	private Boolean st_comple;
	private String de_ruta_img;
	private String ti_situacion;
	private String st_comp;
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
	private String st_equipo;
	private String st_usado;
	private Boolean st_registro;
	private String co_empr;
	private String co_sucu;
	private String de_larga;
	private String no_ubicacion;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fe_ulthoro;
	private Double nu_ulthoro;
	private String co_sucu_actual;
	private String co_proveedor;
	private String no_proveedor;
	private Boolean st_seguro;
	private String st_caseta;
	private String co_caseta;
	private Boolean st_campo;
	private String co_opcion;
	private String no_archivo_cot_factura;
	private String no_archivo_cot_pclocal_factura;
	private String no_ruta_archivo_cot_factura;
	private String no_archivo_cot_guia;
	private String no_archivo_cot_pclocal_guia;
	private String no_ruta_archivo_cot_guia;
	private String no_subsede;
	private Boolean st_subsede;
	private String co_subsede;
	private Double im_valeq_sigv;
	private String de_optimi;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fe_activacion;
	private String nu_activacion;
	private Double im_monto_rec;
	private String co_arancel;
	private String de_arancel;
	private String co_area;
	private Integer nu_banco;
	private String nu_leasing;
	private String co_anterior;
	 private Boolean st_horometro; 
	 
	 @JsonFormat(pattern = "yyyy-MM-dd")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date fe_emision; 
	 private Integer v_util;   
	 private Integer nu_tasa ;   
	 private Double ho_ultimo ;
	public String getCo_equipo() {
		return co_equipo;
	}
	public void setCo_equipo(String co_equipo) {
		this.co_equipo = co_equipo;
	}
	public String getCo_autogenerado() {
		return co_autogenerado;
	}
	public void setCo_autogenerado(String co_autogenerado) {
		this.co_autogenerado = co_autogenerado;
	}
	public String getCo_sublinea() {
		return co_sublinea;
	}
	public void setCo_sublinea(String co_sublinea) {
		this.co_sublinea = co_sublinea;
	}
	public String getCo_linea() {
		return co_linea;
	}
	public void setCo_linea(String co_linea) {
		this.co_linea = co_linea;
	}
	public Double getNu_potcap() {
		return nu_potcap;
	}
	public void setNu_potcap(Double nu_potcap) {
		this.nu_potcap = nu_potcap;
	}
	public String getCo_unimed_e() {
		return co_unimed_e;
	}
	public void setCo_unimed_e(String co_unimed_e) {
		this.co_unimed_e = co_unimed_e;
	}
	public String getNu_pedido() {
		return nu_pedido;
	}
	public void setNu_pedido(String nu_pedido) {
		this.nu_pedido = nu_pedido;
	}
	public String getCo_ref() {
		return co_ref;
	}
	public void setCo_ref(String co_ref) {
		this.co_ref = co_ref;
	}
	public String getNo_equipo() {
		return no_equipo;
	}
	public void setNo_equipo(String no_equipo) {
		this.no_equipo = no_equipo;
	}
	public String getNo_mod_eq() {
		return no_mod_eq;
	}
	public void setNo_mod_eq(String no_mod_eq) {
		this.no_mod_eq = no_mod_eq;
	}
	public String getCo_marca() {
		return co_marca;
	}
	public void setCo_marca(String co_marca) {
		this.co_marca = co_marca;
	}
	public String getNu_ser_eq() {
		return nu_ser_eq;
	}
	public void setNu_ser_eq(String nu_ser_eq) {
		this.nu_ser_eq = nu_ser_eq;
	}
	public String getNu_factura() {
		return nu_factura;
	}
	public void setNu_factura(String nu_factura) {
		this.nu_factura = nu_factura;
	}
	public String getNu_guia() {
		return nu_guia;
	}
	public void setNu_guia(String nu_guia) {
		this.nu_guia = nu_guia;
	}
	public Double getIm_valsigv() {
		return im_valsigv;
	}
	public void setIm_valsigv(Double im_valsigv) {
		this.im_valsigv = im_valsigv;
	}
	public Date getFe_ingre() {
		return fe_ingre;
	}
	public void setFe_ingre(Date fe_ingre) {
		this.fe_ingre = fe_ingre;
	}
	public Double getNu_horo_ent() {
		return nu_horo_ent;
	}
	public void setNu_horo_ent(Double nu_horo_ent) {
		this.nu_horo_ent = nu_horo_ent;
	}
	public Integer getNu_anio_fab() {
		return nu_anio_fab;
	}
	public void setNu_anio_fab(Integer nu_anio_fab) {
		this.nu_anio_fab = nu_anio_fab;
	}
	public Date getFe_ven_gar() {
		return fe_ven_gar;
	}
	public void setFe_ven_gar(Date fe_ven_gar) {
		this.fe_ven_gar = fe_ven_gar;
	}
	public Double getNu_con_com() {
		return nu_con_com;
	}
	public void setNu_con_com(Double nu_con_com) {
		this.nu_con_com = nu_con_com;
	}
	public Double getNu_cap_tan() {
		return nu_cap_tan;
	}
	public void setNu_cap_tan(Double nu_cap_tan) {
		this.nu_cap_tan = nu_cap_tan;
	}
	public Integer getTi_comb() {
		return ti_comb;
	}
	public void setTi_comb(Integer ti_comb) {
		this.ti_comb = ti_comb;
	}
	public Double getNu_horo_gar() {
		return nu_horo_gar;
	}
	public void setNu_horo_gar(Double nu_horo_gar) {
		this.nu_horo_gar = nu_horo_gar;
	}
	public Double getNu_peso_eq() {
		return nu_peso_eq;
	}
	public void setNu_peso_eq(Double nu_peso_eq) {
		this.nu_peso_eq = nu_peso_eq;
	}
	public String getCo_unimed_p() {
		return co_unimed_p;
	}
	public void setCo_unimed_p(String co_unimed_p) {
		this.co_unimed_p = co_unimed_p;
	}
	public Double getNu_anc_eq() {
		return nu_anc_eq;
	}
	public void setNu_anc_eq(Double nu_anc_eq) {
		this.nu_anc_eq = nu_anc_eq;
	}
	public Double getNu_lar_eq() {
		return nu_lar_eq;
	}
	public void setNu_lar_eq(Double nu_lar_eq) {
		this.nu_lar_eq = nu_lar_eq;
	}
	public Double getNu_alt_eq() {
		return nu_alt_eq;
	}
	public void setNu_alt_eq(Double nu_alt_eq) {
		this.nu_alt_eq = nu_alt_eq;
	}
	public Boolean getSt_comple() {
		return st_comple;
	}
	public void setSt_comple(Boolean st_comple) {
		this.st_comple = st_comple;
	}
	public String getDe_ruta_img() {
		return de_ruta_img;
	}
	public void setDe_ruta_img(String de_ruta_img) {
		this.de_ruta_img = de_ruta_img;
	}
	public String getTi_situacion() {
		return ti_situacion;
	}
	public void setTi_situacion(String ti_situacion) {
		this.ti_situacion = ti_situacion;
	}
	public String getSt_comp() {
		return st_comp;
	}
	public void setSt_comp(String st_comp) {
		this.st_comp = st_comp;
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
	public String getSt_equipo() {
		return st_equipo;
	}
	public void setSt_equipo(String st_equipo) {
		this.st_equipo = st_equipo;
	}
	public String getSt_usado() {
		return st_usado;
	}
	public void setSt_usado(String st_usado) {
		this.st_usado = st_usado;
	}
	public Boolean getSt_registro() {
		return st_registro;
	}
	public void setSt_registro(Boolean st_registro) {
		this.st_registro = st_registro;
	}
	public String getCo_empr() {
		return co_empr;
	}
	public void setCo_empr(String co_empr) {
		this.co_empr = co_empr;
	}
	public String getCo_sucu() {
		return co_sucu;
	}
	public void setCo_sucu(String co_sucu) {
		this.co_sucu = co_sucu;
	}
	public String getDe_larga() {
		return de_larga;
	}
	public void setDe_larga(String de_larga) {
		this.de_larga = de_larga;
	}
	public String getNo_ubicacion() {
		return no_ubicacion;
	}
	public void setNo_ubicacion(String no_ubicacion) {
		this.no_ubicacion = no_ubicacion;
	}
	public Date getFe_ulthoro() {
		return fe_ulthoro;
	}
	public void setFe_ulthoro(Date fe_ulthoro) {
		this.fe_ulthoro = fe_ulthoro;
	}
	public Double getNu_ulthoro() {
		return nu_ulthoro;
	}
	public void setNu_ulthoro(Double nu_ulthoro) {
		this.nu_ulthoro = nu_ulthoro;
	}
	public String getCo_sucu_actual() {
		return co_sucu_actual;
	}
	public void setCo_sucu_actual(String co_sucu_actual) {
		this.co_sucu_actual = co_sucu_actual;
	}
	public String getCo_proveedor() {
		return co_proveedor;
	}
	public void setCo_proveedor(String co_proveedor) {
		this.co_proveedor = co_proveedor;
	}
	public String getNo_proveedor() {
		return no_proveedor;
	}
	public void setNo_proveedor(String no_proveedor) {
		this.no_proveedor = no_proveedor;
	}
	public Boolean getSt_seguro() {
		return st_seguro;
	}
	public void setSt_seguro(Boolean st_seguro) {
		this.st_seguro = st_seguro;
	}
	public String getSt_caseta() {
		return st_caseta;
	}
	public void setSt_caseta(String st_caseta) {
		this.st_caseta = st_caseta;
	}
	public String getCo_caseta() {
		return co_caseta;
	}
	public void setCo_caseta(String co_caseta) {
		this.co_caseta = co_caseta;
	}
	public Boolean getSt_campo() {
		return st_campo;
	}
	public void setSt_campo(Boolean st_campo) {
		this.st_campo = st_campo;
	}
	public String getCo_opcion() {
		return co_opcion;
	}
	public void setCo_opcion(String co_opcion) {
		this.co_opcion = co_opcion;
	}
	public String getNo_archivo_cot_factura() {
		return no_archivo_cot_factura;
	}
	public void setNo_archivo_cot_factura(String no_archivo_cot_factura) {
		this.no_archivo_cot_factura = no_archivo_cot_factura;
	}
	public String getNo_archivo_cot_pclocal_factura() {
		return no_archivo_cot_pclocal_factura;
	}
	public void setNo_archivo_cot_pclocal_factura(String no_archivo_cot_pclocal_factura) {
		this.no_archivo_cot_pclocal_factura = no_archivo_cot_pclocal_factura;
	}
	public String getNo_ruta_archivo_cot_factura() {
		return no_ruta_archivo_cot_factura;
	}
	public void setNo_ruta_archivo_cot_factura(String no_ruta_archivo_cot_factura) {
		this.no_ruta_archivo_cot_factura = no_ruta_archivo_cot_factura;
	}
	public String getNo_archivo_cot_guia() {
		return no_archivo_cot_guia;
	}
	public void setNo_archivo_cot_guia(String no_archivo_cot_guia) {
		this.no_archivo_cot_guia = no_archivo_cot_guia;
	}
	public String getNo_archivo_cot_pclocal_guia() {
		return no_archivo_cot_pclocal_guia;
	}
	public void setNo_archivo_cot_pclocal_guia(String no_archivo_cot_pclocal_guia) {
		this.no_archivo_cot_pclocal_guia = no_archivo_cot_pclocal_guia;
	}
	public String getNo_ruta_archivo_cot_guia() {
		return no_ruta_archivo_cot_guia;
	}
	public void setNo_ruta_archivo_cot_guia(String no_ruta_archivo_cot_guia) {
		this.no_ruta_archivo_cot_guia = no_ruta_archivo_cot_guia;
	}
	public String getNo_subsede() {
		return no_subsede;
	}
	public void setNo_subsede(String no_subsede) {
		this.no_subsede = no_subsede;
	}
	public Boolean getSt_subsede() {
		return st_subsede;
	}
	public void setSt_subsede(Boolean st_subsede) {
		this.st_subsede = st_subsede;
	}
	public String getCo_subsede() {
		return co_subsede;
	}
	public void setCo_subsede(String co_subsede) {
		this.co_subsede = co_subsede;
	}
	public Double getIm_valeq_sigv() {
		return im_valeq_sigv;
	}
	public void setIm_valeq_sigv(Double im_valeq_sigv) {
		this.im_valeq_sigv = im_valeq_sigv;
	}
	public String getDe_optimi() {
		return de_optimi;
	}
	public void setDe_optimi(String de_optimi) {
		this.de_optimi = de_optimi;
	}
	public Date getFe_activacion() {
		return fe_activacion;
	}
	public void setFe_activacion(Date fe_activacion) {
		this.fe_activacion = fe_activacion;
	}
	public String getNu_activacion() {
		return nu_activacion;
	}
	public void setNu_activacion(String nu_activacion) {
		this.nu_activacion = nu_activacion;
	}
	public Double getIm_monto_rec() {
		return im_monto_rec;
	}
	public void setIm_monto_rec(Double im_monto_rec) {
		this.im_monto_rec = im_monto_rec;
	}
	public String getCo_arancel() {
		return co_arancel;
	}
	public void setCo_arancel(String co_arancel) {
		this.co_arancel = co_arancel;
	}
	public String getDe_arancel() {
		return de_arancel;
	}
	public void setDe_arancel(String de_arancel) {
		this.de_arancel = de_arancel;
	}
	public String getCo_area() {
		return co_area;
	}
	public void setCo_area(String co_area) {
		this.co_area = co_area;
	}
	public Integer getNu_banco() {
		return nu_banco;
	}
	public void setNu_banco(Integer nu_banco) {
		this.nu_banco = nu_banco;
	}
	public String getNu_leasing() {
		return nu_leasing;
	}
	public void setNu_leasing(String nu_leasing) {
		this.nu_leasing = nu_leasing;
	}
	public String getCo_anterior() {
		return co_anterior;
	}
	public void setCo_anterior(String co_anterior) {
		this.co_anterior = co_anterior;
	}
	public Boolean getSt_horometro() {
		return st_horometro;
	}
	public void setSt_horometro(Boolean st_horometro) {
		this.st_horometro = st_horometro;
	}
	public Date getFe_emision() {
		return fe_emision;
	}
	public void setFe_emision(Date fe_emision) {
		this.fe_emision = fe_emision;
	}
	public Integer getV_util() {
		return v_util;
	}
	public void setV_util(Integer v_util) {
		this.v_util = v_util;
	}
	public Integer getNu_tasa() {
		return nu_tasa;
	}
	public void setNu_tasa(Integer nu_tasa) {
		this.nu_tasa = nu_tasa;
	}
	public Double getHo_ultimo() {
		return ho_ultimo;
	}
	public void setHo_ultimo(Double ho_ultimo) {
		this.ho_ultimo = ho_ultimo;
	}
	 
	 
	 

}
