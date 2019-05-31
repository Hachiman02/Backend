package org.partner.minsa.acs.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.sql.Timestamp;
import java.sql.Blob;
import java.sql.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parametros extends Pagination{

    private Integer idparametros;
    private String descripcion;
    private String codigo;
    private String valor;
    private Integer estado;
    private String accion;
    private String grupo;
private String nombre;
private Integer  idempresa;

    public Integer getIdempresa() {
	return idempresa;
}

public void setIdempresa(Integer idempresa) {
	this.idempresa = idempresa;
}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setIdparametros(Integer idparametros) {
        this.idparametros = idparametros;
    }

    public Integer getIdparametros() {
        return idparametros;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
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
}