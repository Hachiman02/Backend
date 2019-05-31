package org.partner.minsa.acs.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Blob;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tipo_documento extends Pagination {
	private Integer idtipo_documento;
	private String descripcion;
	private Integer estado;

	public void setIdtipo_documento(Integer idtipo_documento) {
		this.idtipo_documento = idtipo_documento;
	}

	public Integer getIdtipo_documento() {
		return idtipo_documento;
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