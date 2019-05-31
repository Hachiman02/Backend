 
package org.partner.minsa.acs.controller.rest;

import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/users")
public class UsersRestController {
/*	 @Resource(name = "userService")
	 UserService userService;
	@Resource(name = "tokenactivacionService")
	TokenactivacionService tokenactivacionService;
	@Resource(name = "usersService")
	UsersService usersService;
	@Resource(name = "userperfilesService")
	UserperfilesService userperfilesService;
	@Resource(name = "parametrosService")
	ParametrosService parametrosService;
	@Resource(name = "tokenpasswordService")
	TokenpasswordService tokenpasswordService;
	@Resource(name = "validacionFechaService")
	ValidacionFechaService validacionFechaService;
	
	Funciones fun;
	@Autowired
	private EmailService emailService;
	

	@RequestMapping(value = "/accesos", method = RequestMethod.POST)
	public ResponseWrapper listModulo(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		fun = new Funciones();
		ResponseWrapper retu = new ResponseWrapper();
		List objtList = new ArrayList();
		User g = new User();
		g.setUsername(fun.sacaid(request));
		objtList = usersService.retornaAccesosGestor(g);
		retu.setEstado(1);
		retu.setAaData(objtList);

		return retu;
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public ResponseWrapper returnUser(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		fun = new Funciones();
		ResponseWrapper retu = new ResponseWrapper();
	try{
 		User g = new User();
		g.setUsername(fun.sacaid(request));
		g.setEmail(fun.sacaid(request));
		g = usersService.findByUsername(g);
	 	
		Calendar c1 = Calendar.getInstance();
		String dia,mes,año;
		Integer fecha_actual;
		dia = Integer.toString(c1.get(Calendar.DATE));
		mes = Integer.toString(c1.get(Calendar.MONTH)+1)  ;
		
		switch(mes){
		case "10" : break;
		case "11" : break;
		case "12" : break;
		default :  mes="0"+mes;break;
		}
		switch(dia){
		case "1" : dia="0"+dia; break;
		case "2" : dia="0"+dia; break;
		case "3" : dia="0"+dia; break;
		case "4" : dia="0"+dia; break;
		case "5" : dia="0"+dia; break;
		case "6" : dia="0"+dia; break;
		case "7" : dia="0"+dia; break;
		case "8" : dia="0"+dia; break;
		case "9" : dia="0"+dia; break;
		default :   break;
		}
		
	 	año = Integer.toString(c1.get(Calendar.YEAR));
		fecha_actual=Integer.parseInt(año+mes+dia);
		
		// Valida que sea la fecha actual 
		ValidacionFecha ultimo_acceso= new ValidacionFecha(); ;
		ultimo_acceso=validacionFechaService.RetornaUltimoAcceso();
		
		if(Integer.parseInt(ultimo_acceso.getFecha_acceso())<=fecha_actual )
		{
	    Integer dias_faltantes=Integer.parseInt(g.getFecha_expiracion())-fecha_actual;
	 	if(dias_faltantes>=0){
		Userperfiles userperfiles = new Userperfiles();
			g.setDias_disponible(dias_faltantes);
		if (g != null) {
	 		userperfiles.setIdusuario(g.getId());
			userperfiles=userperfilesService.retornaObjUserperfilesPorUsuario(userperfiles);
			ValidacionFecha acceso_hoy= new ValidacionFecha();
			acceso_hoy.setFecha_acceso(año+mes+dia);
		 	validacionFechaService.insertaValidacionFecha(acceso_hoy);
			g.setUserperfiles(userperfiles);
	 		retu.setEstado(1);
			retu.setDefaultObj(g);
		} else {
			retu.setEstado(0);
		}
	}
	 	else{
	 		retu.setEstado(3);
			retu.setDefaultObj(g);
	   	}
	}else{  // fecha del sistema no es la correcta ( 
		retu.setEstado(4);
		retu.setDefaultObj(g);
	}
	 	
	 	
	} catch(Exception e){
		int a;
		
	}
		return retu;
	}
	
	 */

}