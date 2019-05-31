 package org.partner.minsa.acs.gateway;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.partner.minsa.acs.domain.*;
import org.partner.minsa.acs.service.Alumno_programaService;

import org.partner.minsa.acs.service.ValidarCorreService;
import org.partner.minsa.acs.utils.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import freemarker.template.TemplateException;
 
@RestController
@RequestMapping(value = "/pub")
public class PublicRestController {
 

	@Resource(name = "validarCorreoService")
	ValidarCorreService validarCorreoService;
	
	@Resource(name = "alumno_programaService")
	Alumno_programaService alumno_programaService;
	
	 /*
@RequestMapping(value = "/validarcorreo", method = RequestMethod.POST)
	public ResponseWrapper validarcorreo(@RequestBody @Validated ResponseWrapper wrapper, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        String rpta=null;
        try {
        	
        	rpta=validarCorreoService.validarCorreo(wrapper.getCorreo());
        	
        	 obj.setCorreo(rpta);
        	 
 
        } catch (Exception e) {
             

        } finally {
            return obj;
        }

    }

@RequestMapping(value = "/lsalumnoprograma", method = RequestMethod.POST)
public ResponseWrapper lsAlumno_programa(@RequestBody @Validated Alumno_programa alumno_programa, HttpServletRequest request)
		throws Exception {
	HttpSession session = request.getSession();
	List objtList = new ArrayList();
	ResponseWrapper obj = new ResponseWrapper();
	try {
		 
			try {
			objtList = alumno_programaService.retornalsalumno_programa();
				if (objtList != null && objtList.size() > 0) {
					obj.setMsg(Constantes.msgTransaccionOk);
					obj.setEstado(Constantes.valTransaccionOk);
					obj.setAaData(objtList);
				} else {
					obj.setMsg(Constantes.msgTransaccionFiltroNoEncontrada);
					obj.setEstado(Constantes.valTransaccionNoEncontro);
					obj.setAaData(objtList);
				}
			} catch (Exception e) {
				 
				obj.setEstado(Constantes.valTransaccionErrornull);
				obj.setAaData(objtList);
			}

		 

	} catch (Exception e) {
		obj.setMsg(Constantes.msgTransaccionErrorNull);
		obj.setEstado(Constantes.valTransaccionErrornull);
		obj.setAaData(objtList);

	} finally {
		return obj;
	}

}

		 
	
	*/
	
}
