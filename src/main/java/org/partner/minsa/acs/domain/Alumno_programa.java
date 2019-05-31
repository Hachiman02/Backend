package org.partner.minsa.acs.domain;

import java.sql.Timestamp;

import org.partner.minsa.acs.domain.Pagination;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Alumno_programa  extends Pagination {

	private String cod_alumno;
  	private String ape_paterno;
	private String ape_materno;
	private String nom_alumno;
	private String correo;
	private String correo_personal;
	private Boolean estado_correo;
	private String nom_programa;
	private Integer id_programa;
	private Boolean check;
	
	
	public Boolean getCheck() {
		return check;
	}
	public void setCheck(Boolean check) {
		this.check = check;
	}
	public Integer getId_programa() {
		return id_programa;
	}
	public void setId_programa(Integer id_programa) {
		this.id_programa = id_programa;
	}
	public String getNom_programa() {
		return nom_programa;
	}
	public void setNom_programa(String nom_programa) {
		this.nom_programa = nom_programa;
	}
	public Boolean getEstado_correo() {
		return estado_correo;
	}
	public void setEstado_correo(Boolean estado_correo) {
		this.estado_correo = estado_correo;
	}
	public String getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
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
	 

}