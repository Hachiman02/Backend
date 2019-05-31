package org.partner.minsa.acs.service;

import org.partner.minsa.acs.domain.Parametros;
import java.util.List;

public interface ParametrosService {

    public List<Parametros> retornaParametrose(Parametros idparametros);

    public List<Parametros> retornaParametrosTodase(Parametros idparametros);
    public List<Parametros> retornaObjParametrosPorGrupoe(Parametros p);
    public List<Parametros> retornaParametrosPorEstadoe(Parametros idparametros);
 public List<Parametros> retornaParametrosPorEstadoCorreos(Parametros idparametros);
    public List<Parametros> retornaParametrosLikePorNombree(Parametros idparametros);

    public Parametros retornaObjParametrosPorCosigoe(Parametros idparametros);
public Parametros retornaObjParametrose(Parametros idparametros);
    public Parametros retornaObjParametroPorEmpresaCodigo(Parametros idparametros);

    public Integer updateParametrose(Parametros idparametros);

    public Integer insertaParametrose(Parametros idparametros);

    public Integer eliminaParametrose(Parametros idparametros);
}