
package org.partner.minsa.acs.service.impl;

import org.partner.minsa.acs.service.PerfilespaginasService;
import org.partner.minsa.acs.mapper.PerfilespaginasMapper;
import org.springframework.stereotype.Service;
import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.Perfilespaginas;
import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service("perfilespaginasService")
public class PerfilespaginasServiceImpl implements PerfilespaginasService {
	@Resource(name = "perfilespaginasMapper")
	PerfilespaginasMapper perfilespaginasMapper;

	@Override
	public List<Perfilespaginas> retornaPerfilespaginas() {
		List<Perfilespaginas> lsPerfilespaginas = new ArrayList<Perfilespaginas>();
		lsPerfilespaginas = perfilespaginasMapper.retornaPerfilespaginas();
		return lsPerfilespaginas;
	}

	@Override
	public List<Perfilespaginas> retornaPerfilespaginasTodas() {
		List<Perfilespaginas> lsPerfilespaginas = new ArrayList<Perfilespaginas>();
		lsPerfilespaginas = perfilespaginasMapper.retornaPerfilespaginasTodas();

		return lsPerfilespaginas;
	}

	@Override
	public List<Perfilespaginas> retornaPerfilespaginasLikePorNombre(Perfilespaginas idperfilespaginas) {
		List<Perfilespaginas> lsPerfilespaginas = new ArrayList<Perfilespaginas>();
		lsPerfilespaginas = perfilespaginasMapper.retornaPerfilespaginasLikePorNombre(idperfilespaginas);
		return lsPerfilespaginas;
	}

	@Override
	public List<Perfilespaginas> retornaPerfilespaginasPorEstado(Perfilespaginas idperfilespaginas) {
		List<Perfilespaginas> lsPerfilespaginas = new ArrayList<Perfilespaginas>();
		Pagination pg = new Pagination();
		pg = perfilespaginasMapper.retornaCantidadList(idperfilespaginas);
		lsPerfilespaginas = perfilespaginasMapper.retornaPerfilespaginasPorEstado(idperfilespaginas);
		if (lsPerfilespaginas != null && lsPerfilespaginas.size() > 0) {
			lsPerfilespaginas.get(0).setCantidad(pg.getCantidad());
		}
		return lsPerfilespaginas;
	}

	@Override
	public Perfilespaginas retornaObjPerfilespaginas(Perfilespaginas idperfilespaginas) {
		return perfilespaginasMapper.retornaObjPerfilespaginas(idperfilespaginas);
	}

	@Override
	public Integer updatePerfilespaginas(Perfilespaginas idperfilespaginas) {
		return perfilespaginasMapper.updatePerfilespaginas(idperfilespaginas);
	}

	@Override
	public Integer insertaPerfilespaginas(Perfilespaginas idperfilespaginas) {
		return perfilespaginasMapper.insertaPerfilespaginas(idperfilespaginas);
	}

	@Override
	public Integer eliminaPerfilespaginas(Perfilespaginas idperfilespaginas) {
		return perfilespaginasMapper.eliminaPerfilespaginas(idperfilespaginas);
	}
	 @Override
	    public Perfilespaginas retornaObjPerfilespaginasPorIdPerIdPagina(Perfilespaginas idperfilespaginas) {
	       return perfilespaginasMapper.retornaObjPerfilespaginasPorIdPerIdPagina(idperfilespaginas);

	    }
}