
package org.partner.minsa.acs.service;
import org.partner.minsa.acs.domain.Periodo;
import java.util.List;
public interface	PeriodoService	{
public List<Periodo>	retornaPeriodo(); 
public List<Periodo>	retornaPeriodoTodas (); 
public List<Periodo>	retornaPeriodoPorEstado (Periodo idperiodo);public List<Periodo>	retornaPeriodoLikePorNombre (Periodo idperiodo);

public Periodo	retornaObjPeriodo(Periodo idperiodo);
public Integer 	updatePeriodo(Periodo idperiodo);
public Integer 	insertaPeriodo(Periodo idperiodo);
public Integer 	eliminaPeriodo(Periodo idperiodo);
}