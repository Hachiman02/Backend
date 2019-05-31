
package org.partner.minsa.acs.mapper;
import org.partner.minsa.acs.domain.Periodo;import org.partner.minsa.acs.domain.Pagination;
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
@Repository("periodoMapper")
public interface	PeriodoMapper	{
@Select( "select idperiodo,descripcion,estado from periodo ;")
public List<Periodo>	retornaPeriodo(); @Select( "select idperiodo,descripcion,estado from periodo where estado='1';")
public List<Periodo>	retornaPeriodoTodas(); 
Pagination	retornaCantidadList( @Param("periodo")Periodo idperiodo);
public List<Periodo>	retornaPeriodoPorEstado( @Param("periodo")Periodo idperiodo);
public List<Periodo>	retornaPeriodoLikePorNombre( @Param("periodo")Periodo idperiodo);
@Select( "select idperiodo,descripcion,estado from periodo where idperiodo =#{idperiodo}")
public Periodo	retornaObjPeriodo(Periodo idperiodo);
@Update("update periodo set  descripcion=#{descripcion}, estado=#{estado} where idperiodo =#{idperiodo};")
public Integer 	updatePeriodo(Periodo idperiodo);
@Insert(" insert into periodo(descripcion,estado)values(#{descripcion},#{estado});" )
@SelectKey(statement = "select currval('sec_periodo') as idperiodo", keyProperty = "idperiodo", before = false, resultType = int.class)
    @Options(useGeneratedKeys = true, keyProperty = "idperiodo", flushCache =  FlushCachePolicy.TRUE)
public Integer 	insertaPeriodo(Periodo idperiodo);
@Delete(" delete from  periodo where idperiodo=#{idperiodo}; " )
public Integer 	eliminaPeriodo(Periodo idperiodo);
}