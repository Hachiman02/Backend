
package org.partner.minsa.acs.service.impl;

import org.partner.minsa.acs.service.ModuloService;
import org.partner.minsa.acs.mapper.ModuloMapper;
import org.springframework.stereotype.Service;
import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.Modulo;
import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service("moduloService")
public class ModuloServiceImpl implements ModuloService {
	@Resource(name = "moduloMapper")
	ModuloMapper moduloMapper;

	@Override
	public List<Modulo> retornaModulo() {
		List<Modulo> lsModulo = new ArrayList<Modulo>();
		lsModulo = moduloMapper.retornaModulo();
		return lsModulo;
	}

	@Override
	public List<Modulo> retornaModuloTodas() {
		List<Modulo> lsModulo = new ArrayList<Modulo>();
		lsModulo = moduloMapper.retornaModuloTodas();

		return lsModulo;
	}

	@Override
	public List<Modulo> retornaModuloLikePorNombre(Modulo idmodulo) {
		List<Modulo> lsModulo = new ArrayList<Modulo>();
		lsModulo = moduloMapper.retornaModuloLikePorNombre(idmodulo);
		return lsModulo;
	}

	@Override
	public List<Modulo> retornaModuloPorEstado(Modulo idmodulo) {
		List<Modulo> lsModulo = new ArrayList<Modulo>();
		Pagination pg = new Pagination();
		pg = moduloMapper.retornaCantidadList(idmodulo);
		lsModulo = moduloMapper.retornaModuloPorEstado(idmodulo);
		if (lsModulo != null && lsModulo.size() > 0) {
			lsModulo.get(0).setCantidad(pg.getCantidad());
		}
		return lsModulo;
	}

	@Override
	public Modulo retornaObjModulo(Modulo idmodulo) {
		return moduloMapper.retornaObjModulo(idmodulo);
	}

	@Override
	public Integer updateModulo(Modulo idmodulo) {
		return moduloMapper.updateModulo(idmodulo);
	}

	@Override
	public Integer insertaModulo(Modulo idmodulo) {
		return moduloMapper.insertaModulo(idmodulo);
	}

	@Override
	public Integer eliminaModulo(Modulo idmodulo) {
		return moduloMapper.eliminaModulo(idmodulo);
	}
}