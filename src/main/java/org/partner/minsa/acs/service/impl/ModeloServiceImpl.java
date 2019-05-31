package org.partner.minsa.acs.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.partner.minsa.acs.domain.Marca;
import org.partner.minsa.acs.domain.Modelo;
import org.partner.minsa.acs.mapper.MarcaMapper;
import org.partner.minsa.acs.mapper.ModeloMapper;
import org.partner.minsa.acs.service.ModeloService;
import org.springframework.stereotype.Service;

@Service("modeloService")
public class ModeloServiceImpl implements ModeloService {

	@Resource(name = "modeloMapper")
	ModeloMapper modeloMapper;
	@Resource(name = "marcaMapper")
	MarcaMapper marcaMapper;

	@Override
	public List<Modelo> buscarMarca(Modelo modelo) {
		List<Modelo> lsModelo = new ArrayList<Modelo>();
		lsModelo = modeloMapper.buscarMarca(modelo);
		return lsModelo;
	}

	@Override
	public List<Modelo> retornaModelo() {
		List<Modelo> lsModelo = new ArrayList<Modelo>();
		lsModelo = modeloMapper.retornaMarca();
		return lsModelo;
	}

	@Override
	public Modelo retornaObjModelo(Modelo modelo) {
		Modelo mod = new Modelo();
		try {
			mod = modeloMapper.retornaObjModelo(modelo);

		} catch (Exception e) {
			e.getMessage();
		} finally {
			return mod;
		}
	}

	@Override
	public Integer updateModelo(Modelo modelo) {
		List<Modelo> lsModelo = new ArrayList<Modelo>();
		lsModelo = modeloMapper.buscarMarca(modelo);
		Marca marc = new Marca();
		marc = marcaMapper.retornaObjMarca(modelo.getMarca());

		double j = 0;
		double precio = 0;
		int ho = 0;

		if (lsModelo.size() == 0) {
			for (int i = 0; i < lsModelo.size(); i++) {
				if (modelo.getMarca().getId() == lsModelo.get(i).getMarca().getId()) {
					if (modelo.getId() != lsModelo.get(i).getId()) {
						j = j + lsModelo.get(i).getPrecio();

					}
				}
			}
		} else {
			if (modelo.getPrecio() + j <= marc.getLimite_compra()) {

				ho = modeloMapper.updateModelo(modelo);

			} else {

				ho = 0;
			}
		}
		return ho;
	}

	@Override
	public Integer insertaModelo(Modelo modelo) {
		List<Modelo> lsModelo = new ArrayList<Modelo>();
		lsModelo = modeloMapper.buscarMarca(modelo);
		Marca marc = new Marca();
		marc = marcaMapper.retornaObjMarca(modelo.getMarca());

		double j = 0;
		double precio = 0;
		int ho = 0;

		if (lsModelo.size() != 0) {

			for (int i = 0; i < lsModelo.size(); i++) {

				if (modelo.getMarca().getId() == lsModelo.get(i).getMarca().getId()) {
					j = j + lsModelo.get(i).getPrecio();

				}
			}
		} else {
			if (modelo.getPrecio() + j <= marc.getLimite_compra()) {

				ho = modeloMapper.insertaModelo(modelo);

			} else {

				ho = 0;

			}
		}
		return ho;
	}

	@Override
	public Integer eliminaModelo(Modelo modelo) {
		return modeloMapper.eliminaModelo(modelo);
	}

}
