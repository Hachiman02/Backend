
package org.partner.minsa.acs.mapper;

import org.partner.minsa.acs.domain.Ubigeo;
import org.partner.minsa.acs.domain.Red;
import org.partner.minsa.acs.domain.Eess;
import org.partner.minsa.acs.domain.Microred;

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

@Repository("ubigeoMapper")
public interface UbigeoMapper {
	@Select("select idubigeo,departamento,provincia,distrito,estado from ubigeo ;")
	public List<Ubigeo> retornaUbigeo();

	@Select("select idubigeo,departamento,provincia,distrito,estado from ubigeo where estado='1';")
	public List<Ubigeo> retornaUbigeoTodas();

	Pagination retornaCantidadList(@Param("ubigeo") Ubigeo idubigeo);

	public List<Ubigeo> retornaUbigeoPorEstado(@Param("ubigeo") Ubigeo idubigeo);
	
    @Select("select distinc(departamento)  from ubigeo   group by departamento order by departamento asc;")
	public List<Ubigeo> retornaUbigeoPorDepartamento(@Param("ubigeo") Ubigeo idubigeo);
	public List<Ubigeo> retornaUbigeoPorProvincia(@Param("ubigeo") Ubigeo idubigeo);
	public List<Ubigeo> retornaUbigeoPorDistrito(@Param("ubigeo") Ubigeo idubigeo);

	 @Select("select idred,descripcion from red  where departamento=#{departamento} group by descripcion,idred order by descripcion asc;")
	    public List<Red> retornaObjRed(Ubigeo idubigeo);
	  @Select("select descripcion, idmicrored from microred  where idred=#{idred} group by descripcion,idmicrored order by descripcion asc;")
	    public List<Microred> retornaObjUbigeoDistrito(Red r);
	  
	    @Select("select descripcion from eess  where idmicrored=#{idmicrored} group by descripcion order by descripcion asc;")
	    public List<Eess> retornaObjEstable(Microred mr);
	 
	public List<Ubigeo> retornaUbigeoLikePorNombre(@Param("ubigeo") Ubigeo idubigeo);

	@Select("select idubigeo,departamento,provincia,distrito,estado from ubigeo where idubigeo =#{idubigeo}")
	public Ubigeo retornaObjUbigeo(Ubigeo idubigeo);

	@Update("update ubigeo set  departamento=#{departamento}, provincia=#{provincia}, distrito=#{distrito}, estado=#{estado} where idubigeo =#{idubigeo};")
	public Integer updateUbigeo(Ubigeo idubigeo);

	@Insert(" insert into ubigeo(departamento,provincia,distrito,estado)values(#{departamento},#{provincia},#{distrito},#{estado});")
	@SelectKey(statement = "select currval('sec_ubigeo') as idubigeo", keyProperty = "idubigeo", before = false, resultType = int.class)
	@Options(useGeneratedKeys = true, keyProperty = "idubigeo", flushCache = FlushCachePolicy.TRUE)
	public Integer insertaUbigeo(Ubigeo idubigeo);

	@Delete(" delete from  ubigeo where idubigeo=#{idubigeo}; ")
	public Integer eliminaUbigeo(Ubigeo idubigeo);
    @Select("select departamento from red group by departamento order by departamento asc;")
    public List<Red> retornaObjDepartamento();

    @Select("select departamento,provincia from ubigeo  where departamento=#{departamento} group by departamento, provincia order by provincia asc;")
    public List<Ubigeo> retornaObjProvincia(Ubigeo idubigeo);

  

}