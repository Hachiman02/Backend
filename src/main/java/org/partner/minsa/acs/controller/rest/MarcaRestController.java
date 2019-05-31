package org.partner.minsa.acs.controller.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.partner.minsa.acs.domain.Marca;
import org.partner.minsa.acs.domain.ResponseWrapper;
import org.partner.minsa.acs.service.MarcaService;
import org.partner.minsa.acs.utils.Constantes;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pub/marca")
public class MarcaRestController {
	
	 @Resource(name = "marcaService")
	    MarcaService marcaService;
	 
 

}
