
package org.partner.minsa.acs.service;
import org.partner.minsa.acs.domain.Agente_cs;
import org.partner.minsa.acs.domain.Red;
import java.util.List;
public interface	Agente_csService	{
public List<Agente_cs>	retornaAgente_cs(); 
public List<Agente_cs>	retornaAgente_csTodas (); 
public List<Agente_cs>	retornaAgente_csPorEstado (Agente_cs idagente_cs);
public List<Agente_cs>	retornaAgente_csLikePorNombre (Agente_cs idagente_cs);
public List<Agente_cs>	retornaAgente_csLikePorEstable(Agente_cs idagente_cs);

public List<Agente_cs>	retornaAgente_csLikePorDistrito(Agente_cs idagente_cs);
public List<Agente_cs>	retornaAgente_csLikePorProvincia (Agente_cs idagente_cs);
public List<Agente_cs>	retornaAgente_csLikePorDepartamento (Agente_cs idagente_cs);
public Red	retornaCantAgentePorPeriodo (Agente_cs idagente_cs);

public Agente_cs retornaAgente_csPorId (Agente_cs idagente_cs);




public Agente_cs	retornaObjAgente_cs(Agente_cs idagente_cs);
public Integer 	updateAgente_cs(Agente_cs idagente_cs);
public Integer 	insertaAgente_cs(Agente_cs idagente_cs);
public Integer 	eliminaAgente_cs(Agente_cs idagente_cs);
}