
package org.partner.minsa.acs.service.impl;

import org.partner.minsa.acs.service.UserperfilesService;
import org.partner.minsa.acs.utils.Constantes;
import org.partner.minsa.acs.mapper.UserperfilesMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.Userperfiles;
import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service("userperfilesService")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserperfilesServiceImpl implements UserperfilesService {
	@Resource(name = "userperfilesMapper")
	UserperfilesMapper userperfilesMapper;

	@Override
	public List<Userperfiles> retornaUserperfiles() {
		List<Userperfiles> lsUserperfiles = new ArrayList<Userperfiles>();
		lsUserperfiles = userperfilesMapper.retornaUserperfiles();
		return lsUserperfiles;
	}

	@Override
	public List<Userperfiles> retornaUserperfilesTodas() {
		List<Userperfiles> lsUserperfiles = new ArrayList<Userperfiles>();
		lsUserperfiles = userperfilesMapper.retornaUserperfilesTodas();

		return lsUserperfiles;
	}

	@Override
	public List<Userperfiles> retornaUserperfilesLikePorNombre(Userperfiles iduserperfiles) {
		List<Userperfiles> lsUserperfiles = new ArrayList<Userperfiles>();
		lsUserperfiles = userperfilesMapper.retornaUserperfilesLikePorNombre(iduserperfiles);
		return lsUserperfiles;
	}

	@Override
	public List<Userperfiles> retornaUserperfilesPorEstado(Userperfiles iduserperfiles) {
		List<Userperfiles> lsUserperfiles = new ArrayList<Userperfiles>();
		Pagination pg = new Pagination();
		pg = userperfilesMapper.retornaCantidadList(iduserperfiles);
		lsUserperfiles = userperfilesMapper.retornaUserperfilesPorEstado(iduserperfiles);
		if (lsUserperfiles != null && lsUserperfiles.size() > 0) {
			lsUserperfiles.get(0).setCantidad(pg.getCantidad());
		}
		return lsUserperfiles;
	}

	@Override
	public Userperfiles retornaObjUserperfilesPorUsuario(Userperfiles iduserperfiles) {

		return userperfilesMapper.retornaObjUserperfilesPorUsuario(iduserperfiles);
	}

	@Override
	public Integer eliminaPerfilusuario(Userperfiles iduserperfiles) {
		return userperfilesMapper.eliminaPerfilusuario(iduserperfiles);
	}

	@Override
	public Userperfiles retornaObjUserperfiles(Userperfiles iduserperfiles) {
		return userperfilesMapper.retornaObjUserperfiles(iduserperfiles);
	}

	@Override
	public Integer updateUserperfiles(Userperfiles iduserperfiles) {
		return userperfilesMapper.updateUserperfiles(iduserperfiles);
	}

	@Override
	public Integer insertaUserperfiles(Userperfiles iduserperfiles) {
		int g = 1;
		try {
			Userperfiles c = new Userperfiles();
			c=userperfilesMapper.retornaObjUserperfilesPorUsuario(iduserperfiles);
			if (c != null && c.getIdperfiles().equals(iduserperfiles.getIdperfiles())) {
				return g;
			} else {
				g = userperfilesMapper.eliminaPerfilusuario(iduserperfiles);
				g = userperfilesMapper.insertaUserperfiles(iduserperfiles);
				if (g > 0) {
					g = 2;
				}
			}
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			return g;
		}
	}

	@Override
	public Integer eliminaUserperfiles(Userperfiles iduserperfiles) {
		return userperfilesMapper.eliminaUserperfiles(iduserperfiles);
	}
}