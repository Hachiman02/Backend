package org.partner.minsa.acs.mapper;


import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.Parametros;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Options.FlushCachePolicy;
import org.apache.ibatis.annotations.Delete;
import java.util.List;

@Mapper
public interface ParametrosMapper {

	@Select("select idparametros,nombre,grupo,descripcion,codigo,valor,estado from parametros ;")
	public List<Parametros> retornaParametros(Parametros idparametros);

	@Select("select grupo,idparametros,nombre,descripcion,codigo,valor,estado from parametros where estado='1' ;")
	public List<Parametros> retornaParametrosTodas(Parametros idparametros);

	public List<Parametros> retornaParametrosPorEstadoCorreos(@Param("parametros") Parametros idparametros);

	public List<Parametros> retornaParametrosPorEstado(@Param("parametros") Parametros idparametros);

	public List<Parametros> retornaParametrosLikePorNombre(@Param("parametros") Parametros idparametros);

	@Select("select idparametros,nombre,grupo,descripcion,codigo,valor,estado from parametros where idparametros =#{idparametros}")
	public Parametros retornaObjParametros(Parametros idparametros);

	@Select("select idparametros,nombre,grupo,descripcion,codigo,valor,estado from parametros where codigo=#{codigo};")
	public Parametros retornaObjParametroPorEmpresaCodigo(Parametros idparametros);

	@Select("select idparametros,nombre,grupo,descripcion,codigo,valor,estado from parametros where grupo =#{grupo} ")
	public List<Parametros> retornaObjParametrosPorGrupo(Parametros idparametros);

	@Select("select idparametros,nombre,grupo,descripcion,codigo,valor,estado from parametros where codigo =#{codigo}  ")
	public Parametros retornaObjParametrosPorCosigo(Parametros idparametros);

	@Update("update parametros set nombre=#{nombre},grupo=#{grupo}, descripcion=#{descripcion}, codigo=#{codigo}, valor=#{valor}, estado=#{estado} where idparametros =#{idparametros};")
	public Integer updateParametros(Parametros idparametros);

	@Insert(" insert into parametros(nombre,grupo,descripcion,codigo,valor,estado)values(#{nombre},#{grupo},#{descripcion},#{codigo},#{valor},#{estado});")
	@SelectKey(statement = "select currval('sec_parametros') as idparametros", keyProperty = "idparametros", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "idparametros", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaParametros(Parametros idparametros);

	@Delete(" delete from  parametros where idparametros=#{idparametros}; ")
	public Integer eliminaParametros(Parametros idparametros);

	public Pagination retornaCantidadList(@Param("parametros") Parametros idparametros);

	public Pagination retornaCantidadListCorrep(@Param("parametros") Parametros idparametros);

}