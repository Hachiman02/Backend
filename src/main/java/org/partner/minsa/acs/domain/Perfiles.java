package org.partner.minsa.acs.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Blob;
import java.sql.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Perfiles extends Pagination {
	private Integer idperfiles;
	private String nombres;
	private Integer ambito;
	private Integer estado;
	private Integer estado_pag;
	
	

	public Integer getEstado_pag() {
		return estado_pag;
	}

	public void setEstado_pag(Integer estado_pag) {
		this.estado_pag = estado_pag;
	}

	public void setIdperfiles(Integer idperfiles) {
		this.idperfiles = idperfiles;
	}

	public Integer getIdperfiles() {
		return idperfiles;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNombres() {
		return nombres;
	}

	public void setAmbito(Integer ambito) {
		this.ambito = ambito;
	}

	public Integer getAmbito() {
		return ambito;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getEstado() {
		return estado;
	}

	private String accion;

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
}