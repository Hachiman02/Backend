package org.partner.minsa.acs.controller.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.partner.minsa.acs.domain.Ingreso;
import org.partner.minsa.acs.domain.Marca;
import org.partner.minsa.acs.domain.ResponseWrapper;
import org.partner.minsa.acs.service.IngresoService;
import org.partner.minsa.acs.utils.Constantes;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pub/marca")
public class IngresoRestController {
	
	 @Resource(name = "ingresoService")
	 IngresoService ingresoService;
	 
	 
	 /*
	  * Retorna las guias registradas para listarlas al momento de registrar un documento de ingreso
	  * Parametro:	idempresa
					idalmacen
					periodo_mes
					periodo_año
 	  * SM
	  * 28/05
	  */
@RequestMapping(value = "/lsguias", method = RequestMethod.POST)
    public ResponseWrapper lsguias(@RequestBody @Validated ResponseWrapper wrapper, HttpServletRequest request) throws Exception {
		List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        Ingreso ingreso= new Ingreso();
        try { 			
        	ingreso.setIdalmacen(wrapper.getIdalmacen());
        	ingreso.setIdempresa(wrapper.getIdempresa());
        	ingreso.setPeriodo_año(wrapper.getPeriodo_año());
        	ingreso.setPeriodo_mes(wrapper.getPeriodo_mes());
             objtList = ingresoService.lsGuias(ingreso);
              if (objtList != null && objtList.size() > 0) {
                          obj.setMsg(Constantes.msgTransaccionOk);
                          obj.setEstado(Constantes.valTransaccionOk);
                          obj.setAaData(objtList);
               } else {
                 	 obj.setMsg(Constantes.msgNoGuiasRegistros);
                     obj.setEstado(Constantes.valTransaccionNoEncontro);
                     obj.setAaData(objtList);
                        }
        			} catch (Exception e) {
				        	System.out.println(this.getClass().getSimpleName() + "/lsguias" + "Linea nro : "+e.getStackTrace()[0].getLineNumber());
				        	System.out.println("ERROR: "+e.getMessage());
			 	        	obj.setMsg(Constantes.msgErrorGuias);
			 	            obj.setEstado(Constantes.valTransaccionErrornull);
			 	            obj.setAaData(objtList);
		       } finally {
		            return obj;
		        }
		}

/*
 * Web service que agrupa todos los productos de las guias enviadas
 * Parametro:	
				lsguias [
				"id_guia_ingreso":
				]
 * SM
 * 28/05
 */	
@RequestMapping(value = "/lsGuiasSelecc", method = RequestMethod.POST)
public ResponseWrapper lsGuiasSelecc(@RequestBody @Validated ResponseWrapper wrapper, HttpServletRequest request) throws Exception {
	List objtList = new ArrayList();
	Integer[] ls_id_guias;
    ResponseWrapper obj = new ResponseWrapper();
    try { 		    	
    					ls_id_guias=wrapper.getLsguia_sel();
    					objtList = ingresoService.agrupaProductos(wrapper.getLsguia_sel());
                    if (objtList != null && objtList.size() > 0) {
                        obj.setMsg(Constantes.msgTransaccionOk);
                        obj.setEstado(Constantes.valTransaccionOk);
                          obj.setAaData(objtList);
                    } else {
                    	 obj.setMsg(Constantes.msgNoGuiasRegistros);
                        obj.setEstado(Constantes.valTransaccionNoEncontro);
                        obj.setAaData(objtList);
                    }
    } catch (Exception e) {
			        	System.out.println(this.getClass().getSimpleName() + "/lsguias" + "Linea nro : "+e.getStackTrace()[0].getLineNumber());
			        	System.out.println("ERROR: "+e.getMessage());
		 	        	obj.setMsg(Constantes.msgErrorGuias);
		 	            obj.setEstado(Constantes.valTransaccionErrornull);
		 	            obj.setAaData(objtList);
   } finally {
        return obj;
    }
}

}
