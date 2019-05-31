
package org.partner.minsa.acs.service;
import org.partner.minsa.acs.domain.Tipo_seguro;
import java.util.List;
public interface	Tipo_seguroService	{
public List<Tipo_seguro>	retornaTipo_seguro(); 
public List<Tipo_seguro>	retornaTipo_seguroTodas (); 
public List<Tipo_seguro>	retornaTipo_seguroPorEstado (Tipo_seguro idtipo_seguro);public List<Tipo_seguro>	retornaTipo_seguroLikePorNombre (Tipo_seguro idtipo_seguro);

public Tipo_seguro	retornaObjTipo_seguro(Tipo_seguro idtipo_seguro);
public Integer 	updateTipo_seguro(Tipo_seguro idtipo_seguro);
public Integer 	insertaTipo_seguro(Tipo_seguro idtipo_seguro);
public Integer 	eliminaTipo_seguro(Tipo_seguro idtipo_seguro);
}