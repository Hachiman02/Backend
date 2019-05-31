
package org.partner.minsa.acs.service;
import org.partner.minsa.acs.domain.Nives_eess;
import java.util.List;
public interface	Nives_eessService	{
public List<Nives_eess>	retornaNives_eess(); 
public List<Nives_eess>	retornaNives_eessTodas (); 
public List<Nives_eess>	retornaNives_eessPorEstado (Nives_eess idnives_eess);public List<Nives_eess>	retornaNives_eessLikePorNombre (Nives_eess idnives_eess);

public Nives_eess	retornaObjNives_eess(Nives_eess idnives_eess);
public Integer 	updateNives_eess(Nives_eess idnives_eess);
public Integer 	insertaNives_eess(Nives_eess idnives_eess);
public Integer 	eliminaNives_eess(Nives_eess idnives_eess);
}