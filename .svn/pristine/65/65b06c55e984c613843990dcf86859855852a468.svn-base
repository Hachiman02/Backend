
package org.partner.minsa.acs.controller.rest;

import org.partner.minsa.acs.service.PaginaService;
import org.partner.minsa.acs.service.PerfilespaginasService;
import org.partner.minsa.acs.domain.Pagina;
import org.partner.minsa.acs.domain.Perfiles;
import org.partner.minsa.acs.domain.Perfilespaginas;
import java.util.List;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.partner.minsa.acs.domain.ResponseWrapper;
import org.partner.minsa.acs.utils.Constantes;
import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/perfilespaginas")
public class PerfilespaginasRestController {
	@Resource(name = "perfilespaginasService")
	PerfilespaginasService perfilespaginasService;
	@Resource(name = "paginaService")
	PaginaService paginaService;

	@RequestMapping(value = "/inserta", method = RequestMethod.POST)
	public ResponseWrapper insertaPerfilespaginas(@RequestBody @Validated Perfilespaginas perfilespaginas,
			HttpServletRequest request) throws Exception {

		ResponseWrapper response = new ResponseWrapper();
		try {
			Integer cat = 0;
			if (perfilespaginas.getAccion().equals(Constantes.accionDelet)) {
				if (perfilespaginas.getEstado().equals("1")) {
					perfilespaginas.setEstado("0");
				} else {
					perfilespaginas.setEstado("1");
				}
				cat = perfilespaginasService.eliminaPerfilespaginas(perfilespaginas);
			} else {
				if (perfilespaginas.getIdperfilespaginas() != null && perfilespaginas.getIdperfilespaginas() > 0) {
					cat = perfilespaginasService.updatePerfilespaginas(perfilespaginas);
				} else {
					cat = perfilespaginasService.insertaPerfilespaginas(perfilespaginas);
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

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ResponseWrapper listPerfilespaginasActivas(@RequestBody @Validated Perfilespaginas perfilespaginas,
			HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		List objtList = new ArrayList();
		ResponseWrapper obj = new ResponseWrapper();
		try {
			if (perfilespaginas.getAccion() != null) {
				try {

					perfilespaginas.setEstado(perfilespaginas.getAccion());
					objtList = perfilespaginasService.retornaPerfilespaginasPorEstado(perfilespaginas);
					if (objtList != null && objtList.size() > 0) {
						obj.setMsg(Constantes.msgTransaccionOk);
						obj.setEstado(Constantes.valTransaccionOk);
						obj.setCantidad(((Perfilespaginas) objtList.get(0)).getCantidad());
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

	@RequestMapping(value = "/finid", method = RequestMethod.POST)
	public ResponseWrapper retornaPerfilespaginasPorId(@RequestBody @Validated Perfilespaginas perfilespaginas,
			HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		ResponseWrapper obj = new ResponseWrapper();
		Perfilespaginas c = new Perfilespaginas();
		try {
			c = perfilespaginasService.retornaObjPerfilespaginas(perfilespaginas);
			if (c != null) {
				obj.setDefaultObj(c);
				obj.setEstado(Constantes.valTransaccionOk);
				obj.setMsg(Constantes.msgTransaccionOk);
			} else {
				obj.setEstado(Constantes.valTransaccionNoEncontro);
				obj.setMsg(Constantes.msgTransaccionNoEncontrada);
			}
		} catch (Exception e) {
			obj.setEstado(Constantes.valTransaccionError);
			obj.setMsg(Constantes.msgTransaccionError);
		} finally {
			return obj;
		}

	}

	@RequestMapping(value = "/insertaretorna", method = RequestMethod.POST)
	public List<Pagina> insertaPerfilespaginasREtorna(@RequestBody @Validated Perfilespaginas perfilespaginas,
			HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		List objtList = new ArrayList();
		try {

			Integer cat = 0;
			if (perfilespaginas.getEstado().equals("D")) {
				cat = perfilespaginasService.eliminaPerfilespaginas(perfilespaginas);
			} else {

				Perfilespaginas ppf = new Perfilespaginas();
				ppf = perfilespaginasService.retornaObjPerfilespaginasPorIdPerIdPagina(perfilespaginas);
				if (ppf != null) {
					cat = perfilespaginasService.eliminaPerfilespaginas(ppf);
				} else {
					cat = perfilespaginasService.insertaPerfilespaginas(perfilespaginas);
				}
			}
			if (cat != null && cat > 0) {
				perfilespaginas.setEstado("1");
				Perfiles p = new Perfiles();
				p.setIdperfiles(perfilespaginas.getIdperfil());
				objtList = paginaService.retornaPaginasMapPorPerfil(p);

			} else {
				perfilespaginas.setEstado("0");
			}

		} catch (Exception e) {
			perfilespaginas.setEstado("1");
		} finally {
			return objtList;
		}
	}

	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String listPaginaPorPerfilChek(@RequestBody @Validated Perfilespaginas perfilespaginas, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		List<Pagina> objtList = new ArrayList();
		Perfiles c = new Perfiles();
		StringBuilder d = new StringBuilder();
	
			c.setIdperfiles(perfilespaginas.getIdperfil());
			objtList = paginaService.retornaPaginasMapPorPerfil(c);
			d.append("{\"checked\":false,\"items\":{");
			for (int i = 0; i < objtList.size(); i++) {
				Pagina object = objtList.get(i);
				boolean f = true;
				if (object.getSiperfil() == 1) {
					f = true;
				} else {
					f = false;
				}
				d.append("\"" + object.getIdpagina() + "\":" + f + ",");
			}
			if (d.length() > 1) {
				d.deleteCharAt(d.length() - 1);
			}
			d.append("}}");
		
		return d.toString();
	}
}