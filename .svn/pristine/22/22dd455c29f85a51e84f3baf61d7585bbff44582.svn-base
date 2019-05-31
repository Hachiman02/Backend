
package org.partner.minsa.acs.mapper;

import org.partner.minsa.acs.domain.Perfiles;
import org.partner.minsa.acs.domain.Pagina;
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

@Repository("perfilesMapper")
public interface PerfilesMapper {
	@Select("select idperfiles,nombres,ambito,estado from perfiles ;")
	public List<Perfiles> retornaPerfiles();

	@Select("select idperfiles,nombres,ambito,estado from perfiles where estado='1';")
	public List<Perfiles> retornaPerfilesTodas();

	public List<Pagina> retornaPaginasMapPorPerfil(Perfiles p);

	Pagination retornaCantidadList(@Param("perfiles") Perfiles idperfiles);

	public List<Perfiles> retornaPerfilesPorEstado(@Param("perfiles") Perfiles idperfiles);

	public List<Perfiles> retornaPerfilesLikePorNombre(@Param("perfiles") Perfiles idperfiles);
	
	public Perfiles retornaPaginasPrueba(@Param("perfilss") Perfiles idperfiles);

	@Select("select idperfiles,nombres,ambito,estado from perfiles where idperfiles =#{idperfiles}")
	public Perfiles retornaObjPerfiles(Perfiles idperfiles);

	@Update("update perfiles set  nombres=#{nombres}, ambito=#{ambito}, estado=#{estado} where idperfiles =#{idperfiles};")
	public Integer updatePerfiles(Perfiles idperfiles);

	@Insert(" insert into perfiles(nombres,ambito,estado)values(#{nombres},#{ambito},#{estado});")
	@SelectKey(statement = "select currval('sec_perfiles') as idperfiles", keyProperty = "idperfiles", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "idperfiles", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaPerfiles(Perfiles idperfiles);

	@Delete(" delete from  perfiles where idperfiles=#{idperfiles}; ")
	public Integer eliminaPerfiles(Perfiles idperfiles);
}