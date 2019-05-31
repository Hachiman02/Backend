
package org.partner.minsa.acs.service;

import org.partner.minsa.acs.domain.Modulo;
import org.partner.minsa.acs.domain.User;
import java.util.List;

public interface UsersService {
	public List<User> retornaUser();

	public List<User> retornaUserTodas();

	public List<User> retornaUserPorEstado(User username);
	
	public List<User> retornalistUserUserName(User username);

	
	

	public List<User> retornaUserLikePorNombre(User username);

	 public User loginUser(User id) ;
	 
	 public User findByUsername(String name) ;

	  

	
	public User retornaObjUser(User username);

	public Integer updateUser(User username);

	public Integer insertaUser(User username);

	public Integer eliminaUser(User username);
	public List<Modulo> retornaAccesosGestor(User idgestor);
}