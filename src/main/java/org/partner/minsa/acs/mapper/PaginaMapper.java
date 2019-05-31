
package org.partner.minsa.acs.mapper;

import org.partner.minsa.acs.domain.Pagina;
import org.partner.minsa.acs.domain.Pagination;
import org.partner.minsa.acs.domain.Perfiles;
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

@Repository("paginaMapper")
public interface PaginaMapper {
	@Select("select idpagina,idmodulo,descripcion,url,parametros,icono,estado,orden from pagina ;")
	public List<Pagina> retornaPagina();

	@Select("select idpagina,idmodulo,descripcion,url,parametros,icono,estado,orden from pagina where estado='1';")
	public List<Pagina> retornaPaginaTodas();

	public List<Pagina> retornaPaginasMapPorPerfil(Perfiles p);

	Pagination retornaCantidadList(@Param("pagina") Pagina idpagina);

	public List<Pagina> retornaPaginaPorEstado(@Param("pagina") Pagina idpagina);

	public List<Pagina> retornaPaginaLikePorNombre(@Param("pagina") Pagina idpagina);

	public Pagina retornaObjPagina(@Param("pagina") Pagina idpagina);

	@Update("update pagina set  idmodulo=#{idmodulo}, descripcion=#{descripcion}, url=#{url}, parametros=#{parametros}, icono=#{icono}, estado=#{estado}, orden=#{orden} where idpagina =#{idpagina};")
	public Integer updatePagina(Pagina idpagina);

	@Insert(" insert into pagina(idmodulo,descripcion,url,parametros,icono,estado,orden)values(#{idmodulo},#{descripcion},#{url},#{parametros},#{icono},#{estado},#{orden});")
	@SelectKey(statement = "select currval('sec_pagina') as idpagina", keyProperty = "idpagina", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "idpagina", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaPagina(Pagina idpagina);

	@Delete(" delete from  pagina where idpagina=#{idpagina}; ")
	public Integer eliminaPagina(Pagina idpagina);
}