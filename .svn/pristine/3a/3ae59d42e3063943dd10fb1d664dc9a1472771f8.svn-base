package org.partner.minsa.acs.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;


import org.partner.minsa.acs.domain.Marca;

import org.partner.minsa.acs.mapper.MarcaMapper;
import org.partner.minsa.acs.service.MarcaService;
import org.springframework.stereotype.Service;
@Service("marcaService")
public class MarcaServiceImpl implements MarcaService {
	@Resource(name = "marcaMapper")
	MarcaMapper marcaMapper;

	@Override
	public List<Marca> retornaMarca() {
		List<Marca> lsMarca = new ArrayList<Marca>();
		lsMarca = marcaMapper.retornaMarca();
		return lsMarca;
	}

	@Override
	public Marca retornaObjMarca(Marca marca) {
		Marca marc = new Marca();
		try {
			marc = marcaMapper.retornaObjMarca(marca);

		} catch (Exception e) {
			e.getMessage();
		} finally {
			return marc;
		}

	}

	@Override
	public Integer updateMarca(Marca marca) {
		return marcaMapper.updateMarca(marca);
	}

	@Override
	public Integer insertaMarca(Marca marca) {
		return marcaMapper.insertaMarca(marca);
	}

	@Override
	public Integer eliminaMarca(Marca marca) {
		
		
		return marcaMapper.eliminaMarca(marca);
		
		 
		  /*public boolean eliminar(Persona objPersona) throws Exception{
		boolean rpta = false;
		Connection con = null;
		PreparedStatement ps = null;
		try {
		if (objPersona != null) {
		con = DBManager.getConnection();
		String sql = "DELETE FROM Persona WHERE id=?;";
		ps = con.prepareStatement(sql);
		ps.setInt(1,objPersona.getId());
		rpta = ps.executeUpdate() == 1;
		}
		} catch (Exception e) {
		e.printStackTrace();
		} finally {
		try {
		ps.close();
		con.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		return rpta;
		} 

		   * */
	}

}
