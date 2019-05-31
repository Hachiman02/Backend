
package org.partner.minsa.acs.mapper;

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

@Repository("moduloMapper")
public interface ModuloMapper {
	@Select("select idmodulo,descripcion,icono,estado,raiz from modulo ;")
	public List<Modulo> retornaModulo();

	@Select("select idmodulo,descripcion,icono,estado,raiz from modulo where estado='1';")
	public List<Modulo> retornaModuloTodas();

	public Pagination retornaCantidadList(@Param("modulo") Modulo idmodulo);

	public List<Modulo> retornaModuloPorEstado(@Param("modulo") Modulo idmodulo);

	public List<Modulo> retornaModuloLikePorNombre(@Param("modulo") Modulo idmodulo);


	public Modulo retornaObjModulo(@Param("modulo") Modulo idmodulo);

	@Update("update modulo set  descripcion=#{descripcion}, icono=#{icono}, estado=#{estado}, raiz=#{raiz} where idmodulo =#{idmodulo};")
	public Integer updateModulo(Modulo idmodulo);

	@Insert(" insert into modulo(descripcion,icono,estado,raiz)values(#{descripcion},#{icono},#{estado},#{raiz});")
	@SelectKey(statement = "select currval('sec_modulo') as idmodulo", keyProperty = "idmodulo", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "idmodulo", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaModulo(Modulo idmodulo);

	@Delete(" delete from  modulo where idmodulo=#{idmodulo}; ")
	public Integer eliminaModulo(Modulo idmodulo);
}