
package org.partner.minsa.acs.mapper;

import org.partner.minsa.acs.domain.User;
import org.partner.minsa.acs.domain.Modulo;
import org.partner.minsa.acs.domain.Pagination;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Options.FlushCachePolicy;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import java.util.List;

@Repository("userMapper")
public interface UserMapper {
	@Select("select * from users  where username=#{u};")
	public User findByUsername(String u);

	@Select("select * from users ;")
	public List<User> retornaUser();

	@Select("select * from users where estado='1';")
	public List<User> retornaUserTodas();

	public List<Modulo> retornaAccesosGestor(User u);
	
	public User loginUser(User id);


	public Pagination retornaCantidadList(@Param("users") User username);

	public List<User> retornaUserPorEstado(@Param("users") User username);
	
	public List<User> retornaUserUserName(@Param("users") User username);

	

	public List<User> retornaUserLikePorNombre(@Param("users") User username);

	public User retornaObjUsers(@Param("users") User username);

	@Select("select * from users where iduser =#{iduser}")
	public User retornaObjUser(User username);

	@Update("update users set estado=#{estado},departamento=#{departamento},idred=#{idred},ambito=#{ambito},  email=#{email}, name=#{name} where iduser=#{iduser};")
	public Integer updateUser(User username);

	@Insert(" insert into users(estado,departamento,idred,ambito,password,email,name,username)values(#{estado},#{departamento},#{idred},#{ambito},#{password},#{email},#{name},#{username});")
	@SelectKey(statement = "select currval('sec_users') as iduser", keyProperty = "iduser", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "iduser", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaUser(User username);

	@Delete(" delete from  users where username=#{username}; ")
	public Integer eliminaUser(User username);
}