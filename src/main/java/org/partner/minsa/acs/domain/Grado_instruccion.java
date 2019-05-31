package org.partner.minsa.acs.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Blob;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Grado_instruccion extends Pagination {
	private Integer idgrado_instruccion;
	private String descripcion;
	private Integer estado;

	public void setIdgrado_instruccion(Integer idgrado_instruccion) {
		this.idgrado_instruccion = idgrado_instruccion;
	}

	public Integer getIdgrado_instruccion() {
		return idgrado_instruccion;
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