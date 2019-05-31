package org.partner.minsa.acs.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Blob;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ubigeo extends Pagination {
	private Integer idubigeo;
	private String departamento;
	private String provincia;
	private String distrito;
	private Integer estado;

	public void setIdubigeo(Integer idubigeo) {
		this.idubigeo = idubigeo;
	}

	public Integer getIdubigeo() {
		return idubigeo;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getDistrito() {
		return distrito;
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