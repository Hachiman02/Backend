package org.partner.minsa.acs.domain;

import java.sql.Date;
import java.sql.Timestamp;

import org.partner.minsa.acs.domain.Pagination;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Alumno  extends Pagination {

	private Integer id_alum;
  	private String dni;
	private String ape_paterno;
	private String ape_materno;
	private String nom_alumno;
	private String correo;
	private String correo_personal;
  	private String dni_m;
  	private String telefono_movil;
  	private String telefono;
  	private Date  nac_fecha;
	private String domicilio_actual;
	private Integer id_programa;
	private String cod_alumno;
	private String nom_programa;

	
	 
	 
	
	public String getNom_programa() {
		return nom_programa;
	}
	public void setNom_programa(String nom_programa) {
		this.nom_programa = nom_programa;
	}
	public String getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
	public Integer getId_alumno() {
		return id_alum;
	}
	public void setId_alumno(Integer id_alum) {
		this.id_alum = id_alum;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApe_paterno() {
		return ape_paterno;
	}
	public void setApe_paterno(String ape_paterno) {
		this.ape_paterno = ape_paterno;
	}
	public String getApe_materno() {
		return ape_materno;
	}
	public void setApe_materno(String ape_materno) {
		this.ape_materno = ape_materno;
	}
	public String getNom_alumno() {
		return nom_alumno;
	}
	public void setNom_alumno(String nom_alumno) {
		this.nom_alumno = nom_alumno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCorreo_personal() {
		return correo_personal;
	}
	public void setCorreo_personal(String correo_personal) {
		this.correo_personal = correo_personal;
	}
	public String getDni_m() {
		return dni_m;
	}
	public void setDni_m(String dni_m) {
		this.dni_m = dni_m;
	}
	public String getTelefono_movil() {
		return telefono_movil;
	}
	public void setTelefono_movil(String telefono_movil) {
		this.telefono_movil = telefono_movil;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getNac_fecha() {
		return nac_fecha;
	}
	public void setNac_fecha(Date nac_fecha) {
		this.nac_fecha = nac_fecha;
	}
	public String getDomicilio_actual() {
		return domicilio_actual;
	}
	public void setDomicilio_actual(String domicilio_actual) {
		this.domicilio_actual = domicilio_actual;
	}
	public Integer getId_programa() {
		return id_programa;
	}
	public void setId_programa(Integer id_programa) {
		this.id_programa = id_programa;
	}
 	
	   

}