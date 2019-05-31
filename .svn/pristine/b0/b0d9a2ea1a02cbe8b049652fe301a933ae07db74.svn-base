package org.partner.minsa.acs.controller.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.partner.minsa.acs.domain.Modelo;
import org.partner.minsa.acs.domain.ResponseWrapper;
import org.partner.minsa.acs.service.ModeloService;
import org.partner.minsa.acs.utils.Constantes;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pub/modelo")
public class ModeloRestController {

	@Resource(name = "modeloService")
	ModeloService modeloService;
/*
	@RequestMapping(value = "/inserta", method = RequestMethod.POST)
	public ResponseWrapper inserta(@RequestBody @Validated Modelo modelo,HttpServletRequest request) throws Exception {

		ResponseWrapper response = new ResponseWrapper();
		try {
			Integer cat = 0;
			if (modelo.getAccion().equals(Constantes.accionDelet)) {
				cat = modeloService.eliminaModelo(modelo);
			} else {
				if (modelo.getId() != null && modelo.getId() > 0) {
					cat = modeloService.updateModelo(modelo);
				} else {
					cat = modeloService.insertaModelo(modelo);
				} 
			}
			if (cat != null && cat > 0) {
				response.setEstado(Constantes.valTransaccionOk);
				response.setMsg(Constantes.msgTransaccionOk);
			} else {
				response.setEstado(Constantes.valTransaccionErrornull);
				response.setMsg(Constantes.msgTransaccionError);
			}
		} catch (Exception e) {
			response.setEstado(Constantes.valTransaccionSinPermiso);
			response.setMsg(Constantes.msgTransaccionError);
		} finally {
			return response;
		}
	}

	@RequestMapping(value = "/listarmodelo", method = RequestMethod.POST)
	public ResponseWrapper listModelo(@RequestBody @Validated Modelo modelo, HttpServletRequest request)
			throws Exception {
		HttpSession session = request.getSession();
		List objtList = new ArrayList();
		ResponseWrapper obj = new ResponseWrapper();
		try {
			if (modelo.getAccion() != null) {
				try {
					objtList = modeloService.retornaModelo();
					if (objtList != null && objtList.size() > 0) {
						obj.setMsg(Constantes.msgTransaccionOk);
						obj.setEstado(Constantes.valTransaccionOk);
						// obj.setCantidad(((Perfiles)objtList.get(0)).getCantidad());
						obj.setAaData(objtList);
					} else {
						obj.setMsg(Constantes.msgTransaccionFiltroNoEncontrada);
						obj.setEstado(Constantes.valTransaccionNoEncontro);
						obj.setAaData(objtList);
					}
				} catch (Exception e) {
					obj.setMsg(Constantes.msgTransaccionErrorNull + "Convirtiendo a numero");
					obj.setEstado(Constantes.valTransaccionErrornull);
					obj.setAaData(objtList);
				}

			} else {
			}

		} catch (Exception e) {
			obj.setMsg(Constantes.msgTransaccionErrorNull);
			obj.setEstado(Constantes.valTransaccionErrornull);
			obj.setAaData(objtList);

		} finally {
			return obj;
		}

	}

	@RequestMapping(value = "/insertamodelo", method = RequestMethod.POST)
	public ResponseWrapper insertaModelo(@RequestBody @Validated Modelo modelo, HttpServletRequest request)
			throws Exception {

		ResponseWrapper response = new ResponseWrapper();
		try {
			Integer cat = 0;

			if (modelo.getAccion() != null) {

				cat = modeloService.insertaModelo(modelo);
			}
			if (cat != null && cat > 0) {
				response.setEstado(Constantes.valTransaccionOk);
				response.setMsg(Constantes.msgTransaccionOk);
			} else {
				response.setEstado(Constantes.valTransaccionErrornull);
				response.setMsg(Constantes.msgTransaccionError);
			}
		} catch (Exception e) {
			response.setEstado(Constantes.valTransaccionSinPermiso);
			response.setMsg(Constantes.msgTransaccionError);
		} finally {
			return response;
		}
	}

	@RequestMapping(value = "/updatemodelo", method = RequestMethod.POST)
	public ResponseWrapper updateModelo(@RequestBody @Validated Modelo modelo, HttpServletRequest request)
			throws Exception {

		ResponseWrapper response = new ResponseWrapper();
		try {
			Integer cat = 0;

			if (modelo.getId() != null) {

				cat = modeloService.updateModelo(modelo);
			}
			if (cat != null && cat > 0) {
				response.setEstado(Constantes.valTransaccionOk);
				response.setMsg(Constantes.msgTransaccionOk);
			} else {
				response.setEstado(Constantes.valTransaccionErrornull);
				response.setMsg(Constantes.msgTransaccionError);
			}
		} catch (Exception e) {
			response.setEstado(Constantes.valTransaccionSinPermiso);
			response.setMsg(Constantes.msgTransaccionError);
		} finally {
			return response;
		}
	}

	@RequestMapping(value = "/eliminaModelo", method = RequestMethod.POST)
	public ResponseWrapper eliminaModelo(@RequestBody @Validated Modelo modelo, HttpServletRequest request)
			throws Exception {

		ResponseWrapper response = new ResponseWrapper();
		try {
			Integer cat = 0;

			if (modelo.getAccion() != null) {

				cat = modeloService.eliminaModelo(modelo);
			}
			if (cat != null && cat > 0) {
				response.setEstado(Constantes.valTransaccionOk);
				response.setMsg(Constantes.msgTransaccionOk);
			} else {
				response.setEstado(Constantes.valTransaccionErrornull);
				response.setMsg(Constantes.msgTransaccionError);
			}
		} catch (Exception e) {
			response.setEstado(Constantes.valTransaccionSinPermiso);
			response.setMsg(Constantes.msgTransaccionError);
		} finally {
			return response;
		}
	}

	@RequestMapping(value = "/retornaModelo", method = RequestMethod.POST)
	public ResponseWrapper retornaModelo(@RequestBody @Validated Modelo modelo, HttpServletRequest request)
			throws Exception {

		ResponseWrapper response = new ResponseWrapper();
		try {
			Modelo mode = new Modelo();
			if (modelo.getId() != null) {

				mode = modeloService.retornaObjModelo(modelo);
			}
			if (mode != null) {
				response.setEstado(Constantes.valTransaccionOk);
				response.setMsg(Constantes.msgTransaccionOk);
				response.setDefaultObj(mode);
			} else {
				response.setEstado(Constantes.valTransaccionErrornull);
				response.setMsg(Constantes.msgTransaccionError);
			}
		} catch (Exception e) {
			response.setEstado(Constantes.valTransaccionSinPermiso);
			response.setMsg(Constantes.msgTransaccionError);
		} finally {
			return response;
		}
	}
	
	@RequestMapping(value = "/retornamarca", method = RequestMethod.POST)
	public ResponseWrapper RetornaMarca(@RequestBody @Validated Modelo modelo, HttpServletRequest request)
			throws Exception {

		ResponseWrapper response = new ResponseWrapper();
		try {
			Integer cat = 0;

			if (modelo.getAccion() != null) {

				cat = modeloService.insertaModelo(modelo);
			}
			if (cat != null && cat > 0) {
				response.setEstado(Constantes.valTransaccionOk);
				response.setMsg(Constantes.msgTransaccionOk);
			} else {
				response.setEstado(Constantes.valTransaccionErrornull);
				response.setMsg(Constantes.msgTransaccionError);
			}
		} catch (Exception e) {
			response.setEstado(Constantes.valTransaccionSinPermiso);
			response.setMsg(Constantes.msgTransaccionError);
		} finally {
			return response;
		}
	}
	
	
	@RequestMapping(value = "/buscarmarca", method = RequestMethod.POST)
	public ResponseWrapper buscarMarca(@RequestBody @Validated Modelo modelo, HttpServletRequest request)
			throws Exception {
		HttpSession session = request.getSession();
		List objtList = new ArrayList();
		ResponseWrapper obj = new ResponseWrapper();
		try {
			if (modelo.getMarca().getId() != null) {
				try {
					objtList = modeloService.buscarMarca(modelo);
					if (objtList != null && objtList.size() > 0) {
						obj.setMsg(Constantes.msgTransaccionOk);
						obj.setEstado(Constantes.valTransaccionOk);
						// obj.setCantidad(((Perfiles)objtList.get(0)).getCantidad());
						obj.setAaData(objtList);
					} else {
						obj.setMsg(Constantes.msgTransaccionFiltroNoEncontrada);
						obj.setEstado(Constantes.valTransaccionNoEncontro);
						obj.setAaData(objtList);
					}
				} catch (Exception e) {
					obj.setMsg(Constantes.msgTransaccionErrorNull + "Convirtiendo a numero");
					obj.setEstado(Constantes.valTransaccionErrornull);
					obj.setAaData(objtList);
				}

			} else {
			}

		} catch (Exception e) {
			obj.setMsg(Constantes.msgTransaccionErrorNull);
			obj.setEstado(Constantes.valTransaccionErrornull);
			obj.setAaData(objtList);

		} finally {
			return obj;
		}

	}
	*/}