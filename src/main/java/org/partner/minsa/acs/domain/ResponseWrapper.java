/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.partner.minsa.acs.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;



/**
 *prueba 
 * @author gteperu
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseWrapper {

	Object defaultObj;
	List<Object> aaData;
	List<Object> lsprograma;

	private Integer estado;
	private String msg;
	private String token;
	private String page;
	private Integer cantidad;
	private String accion;
	private Integer iduser;
	private String idfactura;
	private Integer tipo_autorizacion;
	private String tipo_facturas;
	private String pass;
	private String companyName;

	private String filtrofechaini;
	private String filtrofechafinal;
	private User user_remitente ;
	private User user_destinatario ;
	private String modo_pago;
	private String numero_cheque;
	private Timestamp fecha_pago;
	private Double monto_pagado;
	private Double monto_autorizado;
	private Integer idcuenta_banco;
	private Integer idproceso_pago;
	private String bankShortName;
	private Integer iddetalle_proceso_autorizacion;
	private String tipo_moneda;
	private String companyCode;
	private Integer contadorsoles;
	private Integer contadordolares;
	private Double montosoles;
	private Double montodolares;
	private Integer customerBankAccountUsd;
	private String cuentapen;
	private Boolean cuentasoles;
	private Boolean cuentadolares;
	private	Integer	iddetalle_proceso_pago;
	private Boolean proceso_autorizacion;
	private Integer nivel_autorizacion;
	private String fechapago_txt;
	private String fechaant;
	private String fechaact;
	private String mesmid;
	private String mesmidini;
	private String mestresini;
	private String bankMasterId;
	private String glosa_cheque;
	private String fecha_emision_cheque;
	private String glosa_transferencia;
 	private List<List<String>> lscontenido=new ArrayList<List<String>>() ;
 	private List<Alumno_programa> lsAlumno_programa=new ArrayList<Alumno_programa>() ;

 	/*
 	 * 
 	 * 
 	 * 
 	 */
	private String idempresa;
	public List<Object> getLsprograma() {
		return lsprograma;
	}

	public void setLsprograma(List<Object> lsprograma) {
		this.lsprograma = lsprograma;
	}

	private String idalmacen;
	private String periodo_mes;
	private String periodo_año;
	private Integer[] lsguia_sel; 

    
	public Integer[] getLsguia_sel() {
		return lsguia_sel;
	}

	public void setLsguia_sel(Integer[] lsguia_sel) {
		this.lsguia_sel = lsguia_sel;
	}

	public String getIdempresa() {
		return idempresa;
	}
 
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}
   
	public String getIdalmacen() {
		return idalmacen;
	}
 
	public void setIdalmacen(String idalmacen) {
		this.idalmacen = idalmacen;
	}
 
	public String getPeriodo_mes() {
		return periodo_mes;
	}
 
	public void setPeriodo_mes(String periodo_mes) {
		this.periodo_mes = periodo_mes;
	}
 
	public String getPeriodo_año() {
		return periodo_año;
	}
 
	public void setPeriodo_año(String periodo_año) {
		this.periodo_año = periodo_año;
	}


	
	
	

	public List<Alumno_programa> getLsAlumno_programa() {
		return lsAlumno_programa;
	}



	public void setLsAlumno_programa(List<Alumno_programa> lsAlumno_programa) {
		this.lsAlumno_programa = lsAlumno_programa;
	}

	private Timestamp fecha_busqueda;
    private String correo;
    

 	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public Timestamp getFecha_busqueda() {
		return fecha_busqueda;
	}



	public void setFecha_busqueda(Timestamp fecha_busqueda) {
		this.fecha_busqueda = fecha_busqueda;
	}


 



	public List<List<String>> getLscontenido() {
		return lscontenido;
	}



	public void setLscontenido(List<List<String>> lscontenido) {
		this.lscontenido = lscontenido;
	}


 


 	public String getGlosa_transferencia() {
		return glosa_transferencia;
	}



	public void setGlosa_transferencia(String glosa_transferencia) {
		this.glosa_transferencia = glosa_transferencia;
	}


 	public String getBankMasterId() {
		return bankMasterId;
	}



	public void setBankMasterId(String bankMasterId) {
		this.bankMasterId = bankMasterId;
	}



	public String getGlosa_cheque() {
		return glosa_cheque;
	}



	public void setGlosa_cheque(String glosa_cheque) {
		this.glosa_cheque = glosa_cheque;
	}



	public String getFecha_emision_cheque() {
		return fecha_emision_cheque;
	}



	public void setFecha_emision_cheque(String fecha_emision_cheque) {
		this.fecha_emision_cheque = fecha_emision_cheque;
	}



	public String getFechaant() {
		return fechaant;
	}



	public void setFechaant(String fechaant) {
		this.fechaant = fechaant;
	}



	public String getFechaact() {
		return fechaact;
	}



	public void setFechaact(String fechaact) {
		this.fechaact = fechaact;
	}



	public String getMesmid() {
		return mesmid;
	}



	public void setMesmid(String mesmid) {
		this.mesmid = mesmid;
	}



	public String getMesmidini() {
		return mesmidini;
	}



	public void setMesmidini(String mesmidini) {
		this.mesmidini = mesmidini;
	}



	public String getMestresini() {
		return mestresini;
	}



	public void setMestresini(String mestresini) {
		this.mestresini = mestresini;
	}
 


	public String getFechapago_txt() {
		return fechapago_txt;
	}



	public void setFechapago_txt(String fechapago_txt) {
		this.fechapago_txt = fechapago_txt;
	}



	public Integer getNivel_autorizacion() {
		return nivel_autorizacion;
	}



	public void setNivel_autorizacion(Integer nivel_autorizacion) {
		this.nivel_autorizacion = nivel_autorizacion;
	}



	public Boolean getProceso_autorizacion() {
		return proceso_autorizacion;
	}



	public void setProceso_autorizacion(Boolean proceso_autorizacion) {
		this.proceso_autorizacion = proceso_autorizacion;
	}



	public Integer getIddetalle_proceso_pago() {
		return iddetalle_proceso_pago;
	}



	public Double getMonto_autorizado() {
		return monto_autorizado;
	}



	public void setMonto_autorizado(Double monto_autorizado) {
		this.monto_autorizado = monto_autorizado;
	}



	public void setIddetalle_proceso_pago(Integer iddetalle_proceso_pago) {
		this.iddetalle_proceso_pago = iddetalle_proceso_pago;
	}



	public String getCuentapen() {
		return cuentapen;
	}



	public void setCuentapen(String cuentapen) {
		this.cuentapen = cuentapen;
	}



	public Boolean getCuentasoles() {
		return cuentasoles;
	}



	public void setCuentasoles(Boolean cuentasoles) {
		this.cuentasoles = cuentasoles;
	}



	public Boolean getCuentadolares() {
		return cuentadolares;
	}



	public void setCuentadolares(Boolean cuentadolares) {
		this.cuentadolares = cuentadolares;
	}



	public void setCustomerBankAccountUsd(Integer customerBankAccountUsd) {
		this.customerBankAccountUsd = customerBankAccountUsd;
	}



	public Integer getCustomerBankAccountUsd() {
		return customerBankAccountUsd;
	}

	 

	public String getCustomerBankAccountPen() {
		return cuentapen;
	}

  

 	public Integer getContadorsoles() {
		return contadorsoles;
	}

	public void setContadorsoles(Integer contadorsoles) {
		this.contadorsoles = contadorsoles;
	}

	public Integer getContadordolares() {
		return contadordolares;
	}

	public void setContadordolares(Integer contadordolares) {
		this.contadordolares = contadordolares;
	}

	public Double getMontosoles() {
		return montosoles;
	}

	public void setMontosoles(Double montosoles) {
		this.montosoles = montosoles;
	}

	public Double getMontodolares() {
		return montodolares;
	}

	public void setMontodolares(Double montodolares) {
		this.montodolares = montodolares;
	}
 

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getTipo_moneda() {
		return tipo_moneda;
	}

	public void setTipo_moneda(String tipo_moneda) {
		this.tipo_moneda = tipo_moneda;
	}

	public Integer getIddetalle_proceso_autorizacion() {
		return iddetalle_proceso_autorizacion;
	}

	public void setIddetalle_proceso_autorizacion(Integer iddetalle_proceso_autorizacion) {
		this.iddetalle_proceso_autorizacion = iddetalle_proceso_autorizacion;
	}

	public String getBankShortName() {
		return bankShortName;
	}

	public void setBankShortName(String bankShortName) {
		this.bankShortName = bankShortName;
	}

	public Integer getIdcuenta_banco() {
		return idcuenta_banco;
	}

	public void setIdcuenta_banco(Integer idcuenta_banco) {
		this.idcuenta_banco = idcuenta_banco;
	}

	public Integer getIdproceso_pago() {
		return idproceso_pago;
	}

	public void setIdproceso_pago(Integer idproceso_pago) {
		this.idproceso_pago = idproceso_pago;
	}

	public Double getMonto_pagado() {
		return monto_pagado;
	}

	public void setMonto_pagado(Double monto_pagado) {
		this.monto_pagado = monto_pagado;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	 

	public String getModo_pago() {
		return modo_pago;
	}



	public void setModo_pago(String modo_pago) {
		this.modo_pago = modo_pago;
	}



	public String getNumero_cheque() {
		return numero_cheque;
	}



	public void setNumero_cheque(String numero_cheque) {
		this.numero_cheque = numero_cheque;
	}



	public Timestamp getFecha_pago() {
		return fecha_pago;
	}



	public void setFecha_pago(Timestamp fecha_pago) {
		this.fecha_pago = fecha_pago;
	}



	public String getFiltrofechaini() {
		return filtrofechaini;
	}

	

	public User getUser_remitente() {
		return user_remitente;
	}



	public void setUser_remitente(User user_remitente) {
		this.user_remitente = user_remitente;
	}



	public User getUser_destinatario() {
		return user_destinatario;
	}



	public void setUser_destinatario(User user_destinatario) {
		this.user_destinatario = user_destinatario;
	}



	public String getIdfactura() {
		return idfactura;
	}



	public void setIdfactura(String idfactura) {
		this.idfactura = idfactura;
	}



	public void setFiltrofechaini(String filtrofechaini) {
		this.filtrofechaini = filtrofechaini;
	}

	public String getFiltrofechafinal() {
		return filtrofechafinal;
	}

	public void setFiltrofechafinal(String filtrofechafinal) {
		this.filtrofechafinal = filtrofechafinal;
	}


	 

	public String getTipo_facturas() {
		return tipo_facturas;
	}

	public void setTipo_facturas(String tipo_facturas) {
		this.tipo_facturas = tipo_facturas;
	}

	public Integer getTipo_autorizacion() {
		return tipo_autorizacion;
	}

	public void setTipo_autorizacion(Integer tipo_autorizacion) {
		this.tipo_autorizacion = tipo_autorizacion;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public Object getDefaultObj() {
		return defaultObj;
	}

	public void setDefaultObj(Object defaultObj) {
		this.defaultObj = defaultObj;
	}

	public List<Object> getAaData() {
		return aaData;
	}

	public void setAaData(List<Object> aaData) {
		this.aaData = aaData;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	

	
}
