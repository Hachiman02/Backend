
package org.partner.minsa.acs.service;
import org.partner.minsa.acs.domain.Tipo_documento;
import java.util.List;
public interface	Tipo_documentoService	{
public List<Tipo_documento>	retornaTipo_documento(); 
public List<Tipo_documento>	retornaTipo_documentoTodas (); 
public List<Tipo_documento>	retornaTipo_documentoPorEstado (Tipo_documento idtipo_documento);public List<Tipo_documento>	retornaTipo_documentoLikePorNombre (Tipo_documento idtipo_documento);

public Tipo_documento	retornaObjTipo_documento(Tipo_documento idtipo_documento);
public Integer 	updateTipo_documento(Tipo_documento idtipo_documento);
public Integer 	insertaTipo_documento(Tipo_documento idtipo_documento);
public Integer 	eliminaTipo_documento(Tipo_documento idtipo_documento);
}