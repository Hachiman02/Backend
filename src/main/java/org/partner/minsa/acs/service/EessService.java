
package org.partner.minsa.acs.service;
import org.partner.minsa.acs.domain.Eess;
import org.partner.minsa.acs.domain.Comunidad;
import org.partner.minsa.acs.domain.Red;
import java.util.List;
public interface	EessService	{
public List<Eess>	retornaEess(); 
public List<Eess>	retornaEessTodas ();
public List<Eess>	retornaEessId (Red idred);
public List<Comunidad>	retornaComunidad (Eess eess);
public List<Eess>	retornaEessPorEstado (Eess ideess);public List<Eess>	retornaEessLikePorNombre (Eess ideess);

public Eess	retornaObjEess(Eess ideess);
public Integer 	updateEess(Eess ideess);
public Integer 	insertaEess(Eess ideess);
public Integer 	eliminaEess(Eess ideess);
}