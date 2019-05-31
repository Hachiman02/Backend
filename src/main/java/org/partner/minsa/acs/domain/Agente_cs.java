package org.partner.minsa.acs.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class Agente_cs extends Pagination {
	public String getBusquedapr() {
		return busquedapr;
	}

	public void setBusquedapr(String busquedapr) {
		this.busquedapr = busquedapr;
	}

	private Integer idagente_cs;
	private Integer idcomunidad;
	private Integer idperiodo;
	private Integer idtipo_documento;
	private Integer idgenero;
	private String apellido_paterno;
	private String apellido_materno;
	private String nombres;
	private String documento;
	private String telefono;
	private Timestamp fecha_nacimiento;
	private Timestamp fecha_inicio_actividad;
	private Timestamp fecha_fin_actividad;
	private String fecha_nacimientostr;
	private String fecha_inicio_actividadstr;
	private String fecha_fin_actividadstr;
	private Integer iddialecto;
	private Integer idetnia;
	private Integer idgrado_instruccion;
	private Integer idtipo_voluntario;
	private Integer idtipo_seguro;
	private Integer estado;
	private String celular;
	private String direccion;
	private String resactual;
	private String busquedapr;
	private String busquedade;
	private String busquedadi;
	private String busquedafecha1;
	private String busquedafecha2;
	private Double busquedafe;
	private String busquedaes;

	 
	public String getBusquedaes() {
		return busquedaes;
	}

	public void setBusquedaes(String busquedaes) {
		this.busquedaes = busquedaes;
	}



	

  

	public Double getBusquedafe() {
		return busquedafe;
	}

	public void setBusquedafe(Double busquedafe) {
		this.busquedafe = busquedafe;
	}

	public String getBusquedafecha1() {
		return busquedafecha1;
	}

	public void setBusquedafecha1(String busquedafecha1) {
		this.busquedafecha1 = busquedafecha1;
	}

	public String getBusquedafecha2() {
		return busquedafecha2;
	}

	public void setBusquedafecha2(String busquedafecha2) {
		this.busquedafecha2 = busquedafecha2;
	}

	public String getBusquedade() {
		return busquedade;
	}

	public void setBusquedade(String busquedade) {
		this.busquedade = busquedade;
	}

	public String getBusquedadi() {
		return busquedadi;
	}

	public void setBusquedadi(String busquedadi) {
		this.busquedadi = busquedadi;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getResactual() {
		return resactual;
	}

	public void setResactual(String resactual) {
		this.resactual = resactual;
	}

	

	public String getFecha_nacimientostr() {
		return fecha_nacimientostr;
	}

	public void setFecha_nacimientostr(String fecha_nacimientostr) {
		this.fecha_nacimientostr = fecha_nacimientostr;
	}

	public String getFecha_inicio_actividadstr() {
		return fecha_inicio_actividadstr;
	}

	public void setFecha_inicio_actividadstr(String fecha_inicio_actividadstr) {
		this.fecha_inicio_actividadstr = fecha_inicio_actividadstr;
	}

	public String getFecha_fin_actividadstr() {
		return fecha_fin_actividadstr;
	}

	public void setFecha_fin_actividadstr(String fecha_fin_actividadstr) {
		this.fecha_fin_actividadstr = fecha_fin_actividadstr;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setIdagente_cs(Integer idagente_cs) {
		this.idagente_cs = idagente_cs;
	}

	public Integer getIdagente_cs() {
		return idagente_cs;
	}

	public void setIdcomunidad(Integer idcomunidad) {
		this.idcomunidad = idcomunidad;
	}

	public Integer getIdcomunidad() {
		return idcomunidad;
	}

	public void setIdperiodo(Integer idperiodo) {
		this.idperiodo = idperiodo;
	}

	public Integer getIdperiodo() {
		return idperiodo;
	}

	public void setIdtipo_documento(Integer idtipo_documento) {
		this.idtipo_documento = idtipo_documento;
	}

	public Integer getIdtipo_documento() {
		return idtipo_documento;
	}

	public void setIdgenero(Integer idgenero) {
		this.idgenero = idgenero;
	}

	public Integer getIdgenero() {
		return idgenero;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNombres() {
		return nombres;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setFecha_nacimiento(Timestamp fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Timestamp getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_inicio_actividad(Timestamp fecha_inicio_actividad) {
		this.fecha_inicio_actividad = fecha_inicio_actividad;
	}

	public Timestamp getFecha_inicio_actividad() {
		return fecha_inicio_actividad;
	}

	public void setFecha_fin_actividad(Timestamp fecha_fin_actividad) {
		this.fecha_fin_actividad = fecha_fin_actividad;
	}

	public Timestamp getFecha_fin_actividad() {
		return fecha_fin_actividad;
	}

	public void setIddialecto(Integer iddialecto) {
		this.iddialecto = iddialecto;
	}

	public Integer getIddialecto() {
		return iddialecto;
	}

	public void setIdetnia(Integer idetnia) {
		this.idetnia = idetnia;
	}

	public Integer getIdetnia() {
		return idetnia;
	}

	public void setIdgrado_instruccion(Integer idgrado_instruccion) {
		this.idgrado_instruccion = idgrado_instruccion;
	}

	public Integer getIdgrado_instruccion() {
		return idgrado_instruccion;
	}

	public void setIdtipo_voluntario(Integer idtipo_voluntario) {
		this.idtipo_voluntario = idtipo_voluntario;
	}

	public Integer getIdtipo_voluntario() {
		return idtipo_voluntario;
	}

	public void setIdtipo_seguro(Integer idtipo_seguro) {
		this.idtipo_seguro = idtipo_seguro;
	}

	public Integer getIdtipo_seguro() {
		return idtipo_seguro;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getEstado() {
		return estado;
	}

	private Dialecto dialecto;
//	private Eess eess;
	private Comunidad comunidad;
	private Etnia etnia;
	private Genero genero;
	private Grado_instruccion grado_instruccion;
	private Periodo periodo;
	private Tipo_documento tipo_documento;
	private Tipo_seguro tipo_seguro;
	private Tipo_voluntario tipo_voluntario;

	public void setDialecto(Dialecto dialecto) {
		this.dialecto = dialecto;
	}

	public Dialecto getDialecto() {
		return dialecto;
	}

	public void setComunidad(Comunidad comunidad) {
		this.comunidad = comunidad;
	}

	public Comunidad getComunidad() {
		return comunidad;
	}

	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}

	public Etnia getEtnia() {
		return etnia;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGrado_instruccion(Grado_instruccion grado_instruccion) {
		this.grado_instruccion = grado_instruccion;
	}

	public Grado_instruccion getGrado_instruccion() {
		return grado_instruccion;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setTipo_documento(Tipo_documento tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public Tipo_documento getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_seguro(Tipo_seguro tipo_seguro) {
		this.tipo_seguro = tipo_seguro;
	}

	public Tipo_seguro getTipo_seguro() {
		return tipo_seguro;
	}

	public void setTipo_voluntario(Tipo_voluntario tipo_voluntario) {
		this.tipo_voluntario = tipo_voluntario;
	}

	public Tipo_voluntario getTipo_voluntario() {
		return tipo_voluntario;
	}

	private String accion;

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
}