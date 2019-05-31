
package org.partner.minsa.acs.service;
import org.partner.minsa.acs.domain.Comunidad;


import java.util.List;
public interface	ComunidadService	{
	
public List<Comunidad>	retornaComunidad(); 
public Integer 	updateComunidad(Comunidad ideess);
public Integer 	insertaComunidad(Comunidad ideess);
public Integer 	eliminaComunidad(Comunidad ideess);
public Comunidad 	retornaObjComunidad(Comunidad ideess);

}