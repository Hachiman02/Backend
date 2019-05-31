
package org.partner.minsa.acs.service.impl;

import org.partner.minsa.acs.service.Alumno_programaService;
import org.partner.minsa.acs.mapper.Alumno_programaMapper;
import org.springframework.stereotype.Service;
import org.partner.minsa.acs.domain.Alumno_programa;
import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

@Service("alumno_programaService")
public class Alumno_programaServiceImpl implements Alumno_programaService {
	@Resource(name = "alumno_programaMapper")
	Alumno_programaMapper alumno_programaMapper;

	@Override
	public List<Alumno_programa> retornalsalumno_programa() {
		List<Alumno_programa> lsCelular = new ArrayList<Alumno_programa>();
		lsCelular = alumno_programaMapper.retornalsalumno_programa();
		return lsCelular;
	}
 
}