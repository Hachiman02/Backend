
package org.partner.minsa.acs.service.impl;
import org.partner.minsa.acs.service.PeriodoService;
import org.partner.minsa.acs.mapper.PeriodoMapper;
import org.springframework.stereotype.Service;import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.Periodo;
import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;
@Service("periodoService")
public class	PeriodoServiceImpl	implements PeriodoService	{
@Resource(name = "periodoMapper")
PeriodoMapper	periodoMapper;

@Override
public List<Periodo>	retornaPeriodo() {
 List<Periodo> lsPeriodo=new ArrayList<Periodo>() ;
 lsPeriodo=periodoMapper.retornaPeriodo() ;
return  lsPeriodo;
}
@Override
public List<Periodo>	retornaPeriodoTodas() {
 List<Periodo> lsPeriodo=new ArrayList<Periodo>() ;
 lsPeriodo=periodoMapper.retornaPeriodoTodas() ;


return  lsPeriodo;
}

@Override
public List<Periodo>	retornaPeriodoLikePorNombre(Periodo idperiodo){
 List<Periodo> lsPeriodo=new ArrayList<Periodo>() ;
 lsPeriodo=periodoMapper.retornaPeriodoLikePorNombre(idperiodo);
return  lsPeriodo;
}

@Override
public List<Periodo>	retornaPeriodoPorEstado(Periodo idperiodo){
 List<Periodo> lsPeriodo=new ArrayList<Periodo>() ;
Pagination pg = new Pagination();
        pg =periodoMapper.retornaCantidadList(idperiodo);
        lsPeriodo = periodoMapper.retornaPeriodoPorEstado(idperiodo);
        if (lsPeriodo != null && lsPeriodo.size() > 0) {
            lsPeriodo.get(0).setCantidad(pg.getCantidad());
        }
return  lsPeriodo;
}
@Override
public Periodo	retornaObjPeriodo(Periodo idperiodo){
return periodoMapper.retornaObjPeriodo(idperiodo);
}
@Override
public Integer 	updatePeriodo(Periodo idperiodo){
return periodoMapper.updatePeriodo(idperiodo);
}
@Override
public Integer 	insertaPeriodo(Periodo idperiodo){
return periodoMapper.insertaPeriodo(idperiodo);
}
@Override
public Integer 	eliminaPeriodo(Periodo idperiodo){
return periodoMapper.eliminaPeriodo(idperiodo);
}
}