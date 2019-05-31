package org.partner.minsa.acs.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.sql.Timestamp;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends Pagination {

	private Integer id;
	private String username;
	private String password;
	private String accion;
	private Integer estado;
	private String role;
	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	private Integer idred;
	private Integer ambito;
	private Red red;
	private String email;
	private String departamento;
	private String name;
	private Timestamp fechabusqueda ;
	private String fechabusquedast ;

	public Timestamp getFechabusqueda() {
		return fechabusqueda;
	}

	public void setFechabusqueda(Timestamp fechabusqueda) {
		this.fechabusqueda = fechabusqueda;
	}

	public String getName() {
		return name;
	}

	public String getFechabusquedast() {
		return fechabusquedast;
	}

	public void setFechabusquedast(String fechabusquedast) {
		this.fechabusquedast = fechabusquedast;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Red getRed() {
		return red;
	}

	public void setRed(Red red) {
		this.red = red;
	}

	public Integer getIdred() {
		return idred;
	}

	public void setIdred(Integer idred) {
		this.idred = idred;
	}

	public Integer getAmbito() {
		return ambito;
	}

	public void setAmbito(Integer ambito) {
		this.ambito = ambito;
	}

	 
	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
