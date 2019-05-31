
package org.partner.minsa.acs.mapper;

import org.partner.minsa.acs.domain.Userperfiles;
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

@Repository("userperfilesMapper")
public interface UserperfilesMapper {
	@Select("select iduserperfiles,idperfiles,idusuario,estado from userperfiles ;")
	public List<Userperfiles> retornaUserperfiles();

	@Select("select iduserperfiles,idperfiles,idusuario,estado from userperfiles where estado='1';")
	public List<Userperfiles> retornaUserperfilesTodas();

	Pagination retornaCantidadList(@Param("userperfiles") Userperfiles iduserperfiles);

	public List<Userperfiles> retornaUserperfilesPorEstado(@Param("userperfiles") Userperfiles iduserperfiles);

	public List<Userperfiles> retornaUserperfilesLikePorNombre(@Param("userperfiles") Userperfiles iduserperfiles);

	@Select("select iduserperfiles,idperfiles,idusuario,estado from userperfiles where iduserperfiles =#{iduserperfiles}")
	public Userperfiles retornaObjUserperfiles(Userperfiles iduserperfiles);

	@Select("select iduserperfiles,idperfiles,idusuario,estado from userperfiles where idusuario =#{idusuario} and estado=1")
	public Userperfiles retornaObjUserperfilesPorUsuario(Userperfiles iduserperfiles);
	
	@Update("update userperfiles set estado=0 where idusuario =#{idusuario}")
	public Integer eliminaPerfilusuario(Userperfiles iduserperfiles);
	
	@Update("update userperfiles set  idperfiles=#{idperfiles}, idusuario=#{idusuario}, estado=#{estado} where iduserperfiles =#{iduserperfiles};")
	public Integer updateUserperfiles(Userperfiles iduserperfiles);

	@Insert(" insert into userperfiles(idperfiles,idusuario,estado)values(#{idperfiles},#{idusuario},#{estado});")
	@SelectKey(statement = "select currval('sec_userperfiles') as iduserperfiles", keyProperty = "iduserperfiles", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "iduserperfiles", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaUserperfiles(Userperfiles iduserperfiles);

	@Delete(" delete from  userperfiles where iduserperfiles=#{iduserperfiles}; ")
	public Integer eliminaUserperfiles(Userperfiles iduserperfiles);
}