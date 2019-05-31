package org.partner.minsa.acs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Options.FlushCachePolicy;

import org.partner.minsa.acs.domain.Marca;
import org.springframework.stereotype.Repository;

@Repository("marcaMapper")
public interface MarcaMapper {

	@Select("select id,nombre,pais_fabricante,fecha_fundacion,ruc,limite_compra from marca order by id asc")
	public List<Marca> retornaMarca();

	@Select("select id,nombre,pais_fabricante,fecha_fundacion,ruc,limite_compra from marca where id=#{id}")
	public Marca retornaObjMarca(Marca marca);

	@Update("update marca set nombre=#{nombre},pais_fabricante=#{pais_fabricante},fecha_fundacion=#{fecha_fundacion},ruc=#{ruc},limite_compra=#{limite_compra} where id=#{id};")
	public Integer updateMarca(Marca marca);

	@Insert(" insert into marca(nombre,pais_fabricante,fecha_fundacion,ruc,limite_compra)values(#{nombre},#{pais_fabricante},#{fecha_fundacion},#{ruc},#{limite_compra});")
	@SelectKey(statement = "select currval('sec_marca') as id", keyProperty = "id", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "id", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaMarca(Marca marca);

	@Delete(" delete from marca where id=#{id}; ")
	public Integer eliminaMarca(Marca marca);
}
