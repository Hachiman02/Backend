
package org.partner.minsa.acs.mapper;

import org.partner.minsa.acs.domain.Perfilespaginas;
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

@Repository("perfilespaginasMapper")
public interface PerfilespaginasMapper {
	@Select("select idperfilespaginas,idperfil,idpagina,estado from perfilespaginas ;")
	public List<Perfilespaginas> retornaPerfilespaginas();

	@Select("select idperfilespaginas,idperfil,idpagina,estado from perfilespaginas where estado='1';")
	public List<Perfilespaginas> retornaPerfilespaginasTodas();

	Pagination retornaCantidadList(@Param("perfilespaginas") Perfilespaginas idperfilespaginas);

	public List<Perfilespaginas> retornaPerfilespaginasPorEstado(
			@Param("perfilespaginas") Perfilespaginas idperfilespaginas);

	public List<Perfilespaginas> retornaPerfilespaginasLikePorNombre(
			@Param("perfilespaginas") Perfilespaginas idperfilespaginas);

	@Select("select idperfilespaginas,idperfil,idpagina,estado from perfilespaginas where idperfilespaginas =#{idperfilespaginas}")
	public Perfilespaginas retornaObjPerfilespaginas(Perfilespaginas idperfilespaginas);

	@Update("update perfilespaginas set  idperfil=#{idperfil}, idpagina=#{idpagina}, estado=#{estado} where idperfilespaginas =#{idperfilespaginas};")
	public Integer updatePerfilespaginas(Perfilespaginas idperfilespaginas);

	@Insert(" insert into perfilespaginas(idperfil,idpagina,estado)values(#{idperfil},#{idpagina},#{estado});")
	@SelectKey(statement = "select currval('sec_perfilespaginas') as idperfilespaginas", keyProperty = "idperfilespaginas", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "idperfilespaginas", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaPerfilespaginas(Perfilespaginas idperfilespaginas);

	@Delete(" delete from  perfilespaginas where idperfilespaginas=#{idperfilespaginas}; ")
	public Integer eliminaPerfilespaginas(Perfilespaginas idperfilespaginas);

	@Select("select idperfilespaginas,idperfil,idpagina,estado from perfilespaginas where idperfil =#{idperfil} and idpagina=#{idpagina}")
	public Perfilespaginas retornaObjPerfilespaginasPorIdPerIdPagina(Perfilespaginas idperfilespaginas);
}