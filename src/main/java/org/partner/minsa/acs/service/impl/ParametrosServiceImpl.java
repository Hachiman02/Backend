package org.partner.minsa.acs.service.impl;

import org.partner.minsa.acs.domain.Pagination;
import org.springframework.stereotype.Service;
import org.partner.minsa.acs.domain.Parametros;
import org.partner.minsa.acs.mapper.ParametrosMapper;
import org.partner.minsa.acs.service.ParametrosService;

import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service("parametrosService")
public class ParametrosServiceImpl implements ParametrosService {

    @Resource(name = "parametrosMapper")
    ParametrosMapper parametrosMapper;

    @Override
    public List<Parametros> retornaParametrose(Parametros idparametros) {
        List<Parametros> lsParametros = new ArrayList<Parametros>();
        lsParametros = parametrosMapper.retornaParametros(idparametros);
        return lsParametros;
    }

    @Override
    public List<Parametros> retornaParametrosTodase(Parametros idparametros) {
        List<Parametros> lsParametros = new ArrayList<Parametros>();
        lsParametros = parametrosMapper.retornaParametrosTodas(idparametros);
        return lsParametros;
    }

    @Override
    public List<Parametros> retornaObjParametrosPorGrupoe(Parametros idparametros) {
        List<Parametros> lsParametros = new ArrayList<Parametros>();
        lsParametros = parametrosMapper.retornaObjParametrosPorGrupo(idparametros);
        return lsParametros;
    }

    @Override
    public List<Parametros> retornaParametrosLikePorNombree(Parametros idparametros) {
        List<Parametros> lsParametros = new ArrayList<Parametros>();
        lsParametros = parametrosMapper.retornaParametrosLikePorNombre(idparametros);
        return lsParametros;
    }
 @Override
    public List<Parametros> retornaParametrosPorEstadoCorreos(Parametros idparametros) {
        List<Parametros> lsParametros = new ArrayList<Parametros>();
        Pagination pg = new Pagination();
        pg = parametrosMapper.retornaCantidadListCorrep(idparametros);
        lsParametros = parametrosMapper.retornaParametrosPorEstadoCorreos(idparametros);
        if (lsParametros != null && lsParametros.size() > 0) {
            lsParametros.get(0).setCantidad(pg.getCantidad());
        }
        return lsParametros;
    }
    @Override
    public List<Parametros> retornaParametrosPorEstadoe(Parametros idparametros) {
        List<Parametros> lsParametros = new ArrayList<Parametros>();
        Pagination pg = new Pagination();
        pg = parametrosMapper.retornaCantidadList(idparametros);
        lsParametros = parametrosMapper.retornaParametrosPorEstado(idparametros);
        if (lsParametros != null && lsParametros.size() > 0) {
            lsParametros.get(0).setCantidad(pg.getCantidad());
        }
        return lsParametros;
    }
 @Override
    public Parametros retornaObjParametrose(Parametros idparametros) {
        return parametrosMapper.retornaObjParametros(idparametros);
    }
    @Override
    public Parametros retornaObjParametroPorEmpresaCodigo(Parametros idparametros) {
        return parametrosMapper.retornaObjParametroPorEmpresaCodigo(idparametros);
    }

    @Override
    public Parametros retornaObjParametrosPorCosigoe(Parametros idparametros) {
        return parametrosMapper.retornaObjParametrosPorCosigo(idparametros);
    }

    @Override
    public Integer updateParametrose(Parametros idparametros) {
        return parametrosMapper.updateParametros(idparametros);
    }

    @Override
    public Integer insertaParametrose(Parametros idparametros) {
        return parametrosMapper.insertaParametros(idparametros);
    }

    @Override
    public Integer eliminaParametrose(Parametros idparametros) {
        return parametrosMapper.eliminaParametros(idparametros);
    }
    
    
}