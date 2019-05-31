
package org.partner.minsa.acs.mapper;

import org.partner.minsa.acs.domain.Alumno_programa;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Options.FlushCachePolicy;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import java.util.List;

@Repository("alumno_programaMapper")
public interface Alumno_programaMapper {
	@Select("select * from alumno_programa order by  cod_alumno")
	public List<Alumno_programa> retornalsalumno_programa();
	
	 
}