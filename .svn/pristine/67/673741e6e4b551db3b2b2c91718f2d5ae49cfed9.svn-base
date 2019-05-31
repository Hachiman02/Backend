package org.partner.minsa.acs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Options.FlushCachePolicy;
import org.apache.ibatis.annotations.Param;
import org.partner.minsa.acs.domain.Modelo;
import org.springframework.stereotype.Repository;

@Repository("modeloMapper")
public interface ModeloMapper {

	@Select("select id,idmarca,nombre,precio,fecha_fabricacion from modelo order by id asc")
	public List<Modelo> retornaModelo();

	public List<Modelo> retornaMarca();
	
   
	public List<Modelo> buscarMarca(@Param("modelo")Modelo modelo);
	
	@Select("select id,idmarca,nombre,precio,fecha_fabricacion from modelo where id=#{id}")
	public Modelo retornaObjModelo(Modelo modelo);

	@Update("update modelo set idmarca=#{marca.id},nombre=#{nombre},precio=#{precio},fecha_fabricacion=#{fecha_fabricacion} where id=#{id};")
	public Integer updateModelo(Modelo modelo);

	@Insert(" insert into modelo(idmarca,nombre,precio,fecha_fabricacion)values(#{marca.id},#{nombre},#{precio},#{fecha_fabricacion});")
	@SelectKey(statement = "select currval('sec_modelo') as id", keyProperty = "id", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "id", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaModelo(Modelo modelo);

	@Delete(" delete from modelo where id=#{id}; ")
	public Integer eliminaModelo(Modelo modelo);

}
