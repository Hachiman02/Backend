package org.partner.minsa.acs.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Blob;
import java.sql.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Nives_eess extends Pagination {
	private Integer idnives_eess;
	private String descripcion;
	private Integer estado;

	public void setIdnives_eess(Integer idnives_eess) {
		this.idnives_eess = idnives_eess;
	}

	public Integer getIdnives_eess() {
		return idnives_eess;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
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