
package org.partner.minsa.acs.service.impl;

import org.partner.minsa.acs.service.PerfilesService;
import org.partner.minsa.acs.mapper.PerfilesMapper;
import org.springframework.stereotype.Service;
import org.partner.minsa.acs.domain.Pagina;
import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.Perfiles;
import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service("perfilesService")
public class PerfilesServiceImpl implements PerfilesService {
	@Resource(name = "perfilesMapper")
	PerfilesMapper perfilesMapper;

	@Override
	public List<Perfiles> retornaPerfiles() {
		List<Perfiles> lsPerfiles = new ArrayList<Perfiles>();
		lsPerfiles = perfilesMapper.retornaPerfiles();
		return lsPerfiles;
	}

	@Override
	public List<Perfiles> retornaPerfilesTodas() {
		List<Perfiles> lsPerfiles = new ArrayList<Perfiles>();
		lsPerfiles = perfilesMapper.retornaPerfilesTodas();

		return lsPerfiles;
	}

	@Override
	public List<Perfiles> retornaPerfilesLikePorNombre(Perfiles idperfiles) {
		List<Perfiles> lsPerfiles = new ArrayList<Perfiles>();
		lsPerfiles = perfilesMapper.retornaPerfilesLikePorNombre(idperfiles);
		return lsPerfiles;
	}

	@Override
	public List<Perfiles> retornaPerfilesPorEstado(Perfiles idperfiles) {
		List<Perfiles> lsPerfiles = new ArrayList<Perfiles>();
		Pagination pg = new Pagination();
		pg = perfilesMapper.retornaCantidadList(idperfiles);
		lsPerfiles = perfilesMapper.retornaPerfilesPorEstado(idperfiles);
		if (lsPerfiles != null && lsPerfiles.size() > 0) {
			lsPerfiles.get(0).setCantidad(pg.getCantidad());
		}
		return lsPerfiles;
	}

	@Override
	public Perfiles retornaObjPerfiles(Perfiles idperfiles) {
		return perfilesMapper.retornaObjPerfiles(idperfiles);
	}

	@Override
	public Integer updatePerfiles(Perfiles idperfiles) {
		return perfilesMapper.updatePerfiles(idperfiles);
	}

	@Override
	public Integer insertaPerfiles(Perfiles idperfiles) {
		return perfilesMapper.insertaPerfiles(idperfiles);
	}

	@Override
	public Integer eliminaPerfiles(Perfiles idperfiles) {
		return perfilesMapper.eliminaPerfiles(idperfiles);
	}
	  @Override
	    public List<Pagina> retornaPaginasMapPorPerfil(Perfiles p) {
	        return perfilesMapper.retornaPaginasMapPorPerfil(p);
	    }
}