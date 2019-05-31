package org.partner.minsa.acs.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Blob;
import java.sql.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Perfilespaginas extends Pagination {
	private Integer idperfilespaginas;
	private Integer idperfil;
	private Integer idpagina;
	private String estado;

	public void setIdperfilespaginas(Integer idperfilespaginas) {
		this.idperfilespaginas = idperfilespaginas;
	}

	public Integer getIdperfilespaginas() {
		return idperfilespaginas;
	}

	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}

	public Integer getIdperfil() {
		return idperfil;
	}

	public void setIdpagina(Integer idpagina) {
		this.idpagina = idpagina;
	}

	public Integer getIdpagina() {
		return idpagina;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	private Pagina pagina;
	private Perfiles perfiles;

	public void setPagina(Pagina pagina) {
		this.pagina = pagina;
	}

	public Pagina getPagina() {
		return pagina;
	}

	public void setPerfiles(Perfiles perfiles) {
		this.perfiles = perfiles;
	}

	public Perfiles getPerfiles() {
		return perfiles;
	}

	private String accion;

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
}