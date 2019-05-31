
package org.partner.minsa.acs.service.impl;

import org.partner.minsa.acs.service.UbigeoService;
import org.partner.minsa.acs.mapper.UbigeoMapper;
import org.springframework.stereotype.Service;
import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.Ubigeo;
import org.partner.minsa.acs.domain.Red;
import org.partner.minsa.acs.domain.Eess;

import org.partner.minsa.acs.domain.Microred;

import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service("ubigeoService")
public class UbigeoServiceImpl implements UbigeoService {
	@Resource(name = "ubigeoMapper")
	UbigeoMapper ubigeoMapper;

	@Override
	public List<Ubigeo> retornaUbigeo() {
		List<Ubigeo> lsUbigeo = new ArrayList<Ubigeo>();
		lsUbigeo = ubigeoMapper.retornaUbigeo();
		return lsUbigeo;
	}

	@Override
	public List<Ubigeo> retornaUbigeoTodas() {
		List<Ubigeo> lsUbigeo = new ArrayList<Ubigeo>();
		lsUbigeo = ubigeoMapper.retornaUbigeoTodas();

		return lsUbigeo;
	}
	 @Override
	    public List<Red> retornaObjRed(Ubigeo idubigeo) {
	        return ubigeoMapper.retornaObjRed(idubigeo);
	    }

	  @Override
	    public List<Eess> retornaObjEstable(Microred mr){
	        return ubigeoMapper.retornaObjEstable(mr);

	    }
	    @Override
	    public List<Microred> retornaObjUbigeoDistrito(Red r) {
	        return ubigeoMapper.retornaObjUbigeoDistrito(r);

	    }
	 
	@Override
	public List<Ubigeo> retornaUbigeoLikePorNombre(Ubigeo idubigeo) {
		List<Ubigeo> lsUbigeo = new ArrayList<Ubigeo>();
		lsUbigeo = ubigeoMapper.retornaUbigeoLikePorNombre(idubigeo);
		return lsUbigeo;
	}

	@Override
	public List<Ubigeo> retornaUbigeoPorEstado(Ubigeo idubigeo) {
		List<Ubigeo> lsUbigeo = new ArrayList<Ubigeo>();
		Pagination pg = new Pagination();
		pg = ubigeoMapper.retornaCantidadList(idubigeo);
		lsUbigeo = ubigeoMapper.retornaUbigeoPorEstado(idubigeo);
		if (lsUbigeo != null && lsUbigeo.size() > 0) {
			lsUbigeo.get(0).setCantidad(pg.getCantidad());
		}
		return lsUbigeo;
	}
	
	
	@Override
	public List<Ubigeo> retornaUbigeoPorDepartamento(Ubigeo idubigeo) {
		List<Ubigeo> lsUbigeo = new ArrayList<Ubigeo>();
		Pagination pg = new Pagination();
	//	pg = ubigeoMapper.retornaCantidadList(idubigeo);
		lsUbigeo = ubigeoMapper.retornaUbigeoPorDepartamento(idubigeo);
		if (lsUbigeo != null && lsUbigeo.size() > 0) {
		//	lsUbigeo.get(0).setCantidad(pg.getCantidad());
		}
		return lsUbigeo;
	}
	
	@Override
	public List<Ubigeo> retornaUbigeoPorProvincia(Ubigeo idubigeo) {
		List<Ubigeo> lsUbigeo = new ArrayList<Ubigeo>();
		Pagination pg = new Pagination();
		pg = ubigeoMapper.retornaCantidadList(idubigeo);
		lsUbigeo = ubigeoMapper.retornaUbigeoPorProvincia(idubigeo);
		if (lsUbigeo != null && lsUbigeo.size() > 0) {
			lsUbigeo.get(0).setCantidad(pg.getCantidad());
		}
		return lsUbigeo;
	}
	
	@Override
	public List<Ubigeo> retornaUbigeoPorDistrito(Ubigeo idubigeo) {
		List<Ubigeo> lsUbigeo = new ArrayList<Ubigeo>();
		Pagination pg = new Pagination();
		pg = ubigeoMapper.retornaCantidadList(idubigeo);
		lsUbigeo = ubigeoMapper.retornaUbigeoPorDistrito(idubigeo);
		if (lsUbigeo != null && lsUbigeo.size() > 0) {
			lsUbigeo.get(0).setCantidad(pg.getCantidad());
		}
		return lsUbigeo;
	}
	
	
	

	@Override
	public Ubigeo retornaObjUbigeo(Ubigeo idubigeo) {
		return ubigeoMapper.retornaObjUbigeo(idubigeo);
	}

	@Override
	public Integer updateUbigeo(Ubigeo idubigeo) {
		return ubigeoMapper.updateUbigeo(idubigeo);
	}

	@Override
	public Integer insertaUbigeo(Ubigeo idubigeo) {
		return ubigeoMapper.insertaUbigeo(idubigeo);
	}

	@Override
	public Integer eliminaUbigeo(Ubigeo idubigeo) {
		return ubigeoMapper.eliminaUbigeo(idubigeo);
	}
    @Override
    public List<Red> retornaObjDepartamento() {
        return ubigeoMapper.retornaObjDepartamento();
    }

    @Override
    public List<Ubigeo> retornaObjProvincia(Ubigeo idubigeo) {
        return ubigeoMapper.retornaObjProvincia(idubigeo);
    }

  
}