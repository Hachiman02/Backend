
package org.partner.minsa.acs.controller.rest;
import org.partner.minsa.acs.service.PaginaService;
import org.partner.minsa.acs.domain.Pagina;
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
@RequestMapping(value = "/api/pagina")
public class	PaginaRestController{
 @Resource(name = "paginaService")
    PaginaService paginaService;
 @RequestMapping(value = "/inserta", method = RequestMethod.POST)
    public ResponseWrapper insertaPagina(@RequestBody @Validated Pagina pagina, HttpServletRequest request) throws Exception {
        
        ResponseWrapper response = new ResponseWrapper();
        try {
                Integer cat = 0;
                if (pagina.getAccion().equals(Constantes.accionDelet)) {
                    if (pagina.getEstado() == 1) {
                        pagina.setEstado(0);
                    } else {
                        pagina.setEstado(1);
                    }
                    cat = paginaService.eliminaPagina(pagina);
                } else {
                    if (pagina.getIdpagina() != null && pagina.getIdpagina() > 0) {
                        cat = paginaService.updatePagina(pagina);
                    } else {
                        cat = paginaService.insertaPagina(pagina);
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
    public ResponseWrapper listPaginaActivas(@RequestBody @Validated Pagina pagina, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        try {
                if (pagina.getAccion() != null) {
                    try {
                        int val = Integer.parseInt(pagina.getAccion());
                        pagina.setEstado(val);
                        objtList = paginaService.retornaPaginaPorEstado(pagina);
                        if (objtList != null && objtList.size() > 0) {
                            obj.setMsg(Constantes.msgTransaccionOk);
                            obj.setEstado(Constantes.valTransaccionOk);
                             obj.setCantidad(((Pagina)objtList.get(0)).getCantidad());
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

    @RequestMapping(value = "/like", method = RequestMethod.POST)
    public ResponseWrapper listPaginaPorLikeNombre(@RequestBody @Validated Pagina pagina, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        try {
                if (pagina.getAccion() != null) {
                    try {                        
                        pagina.setDescripcion(pagina.getAccion());
                        objtList = paginaService.retornaPaginaLikePorNombre(pagina);
                        if (objtList != null && objtList.size() > 0) {
                            obj.setMsg(Constantes.msgTransaccionOk);
                            obj.setEstado(Constantes.valTransaccionOk);
                             obj.setCantidad(((Pagina)objtList.get(0)).getCantidad());
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

    } @RequestMapping(value = "/finid", method = RequestMethod.POST)
    public ResponseWrapper retornaPaginaPorId(@RequestBody @Validated Pagina pagina, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        ResponseWrapper obj = new ResponseWrapper();
        Pagina c = new Pagina();
        try {
                c = paginaService.retornaObjPagina(pagina);
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
}