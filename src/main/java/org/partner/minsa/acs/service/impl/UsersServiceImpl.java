
package org.partner.minsa.acs.service.impl;

import org.partner.minsa.acs.service.UserService;
import org.partner.minsa.acs.service.UsersService;
import org.partner.minsa.acs.mapper.UserMapper;
import org.springframework.stereotype.Service;
 import org.partner.minsa.acs.domain.Modulo;
import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.User;
import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
	@Resource(name = "userMapper")
	UserMapper userMapper;

	@Override
	public List<User> retornaUser() {
		List<User> lsUser = new ArrayList<User>();
		lsUser = userMapper.retornaUser();
		return lsUser;
	}
    @Override
    public List<Modulo> retornaAccesosGestor(User idgestor) {
        return userMapper.retornaAccesosGestor(idgestor);
    }
	@Override
	public List<User> retornaUserTodas() {
		List<User> lsUser = new ArrayList<User>();
		lsUser = userMapper.retornaUserTodas();

		return lsUser;
	}

	@Override
	public List<User> retornaUserLikePorNombre(User username) {
		List<User> lsUser = new ArrayList<User>();
		lsUser = userMapper.retornaUserLikePorNombre(username);
		return lsUser;
	}

	@Override
	public List<User> retornaUserPorEstado(User username) {
		List<User> lsUser = new ArrayList<User>();
		Pagination pg = new Pagination();
		pg = userMapper.retornaCantidadList(username);
		lsUser = userMapper.retornaUserPorEstado(username);
		if (lsUser != null && lsUser.size() > 0) {
			lsUser.get(0).setCantidad(pg.getCantidad());
		}
		return lsUser;
	}
	
	@Override
	public List<User> retornalistUserUserName(User username) {
		List<User> lsUser = new ArrayList<User>();
	   
	  	lsUser = userMapper.retornaUserUserName(username);
	  	return lsUser;
	}
	
	

	@Override
	public User retornaObjUser(User username) {
		return userMapper.retornaObjUser(username);
	}
	
	@Override
	public User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}
	
	

 @Override
 public User loginUser(User id) {
	 return userMapper.loginUser(id);
	    }

	@Override
	public Integer updateUser(User username) {
		return userMapper.updateUser(username);
	}

	@Override
	public Integer insertaUser(User username) {
		return userMapper.insertaUser(username);
	}

	@Override
	public Integer eliminaUser(User username) {
		return userMapper.eliminaUser(username);
	}
}