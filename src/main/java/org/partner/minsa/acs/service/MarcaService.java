package org.partner.minsa.acs.service;

import java.util.List;

import org.partner.minsa.acs.domain.Marca;

public interface MarcaService {
	public List<Marca> retornaMarca();

	public Marca retornaObjMarca(Marca id);

	public Integer updateMarca(Marca id);

	public Integer insertaMarca(Marca id);

	public Integer eliminaMarca(Marca id);

}
