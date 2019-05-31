
package org.partner.minsa.acs.controller.rest;
import org.partner.minsa.acs.service.PerfilesService;
import org.partner.minsa.acs.domain.Pagina;
import org.partner.minsa.acs.domain.Perfiles;
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
@RequestMapping(value = "/api/perfiles")
public class	PerfilesRestController{
 @Resource(name = "perfilesService")
    PerfilesService perfilesService;
 @RequestMapping(value = "/inserta", method = RequestMethod.POST)
    public ResponseWrapper insertaPerfiles(@RequestBody @Validated Perfiles perfiles, HttpServletRequest request) throws Exception {
        
        ResponseWrapper response = new ResponseWrapper();
        try {
                Integer cat = 0;
                if (perfiles.getAccion().equals(Constantes.accionDelet)) {
                    if (perfiles.getEstado() == 1) {
                        perfiles.setEstado(0);
                    } else {
                        perfiles.setEstado(1);
                    }
                    cat = perfilesService.eliminaPerfiles(perfiles);
                } else {
                    if (perfiles.getIdperfiles() != null && perfiles.getIdperfiles() > 0) {
                        cat = perfilesService.updatePerfiles(perfiles);
                    } else {
                        cat = perfilesService.insertaPerfiles(perfiles);
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
    public ResponseWrapper listPerfilesActivas(@RequestBody @Validated Perfiles perfiles, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        try {
                if (perfiles.getAccion() != null) {
                    try {
                        int val = Integer.parseInt(perfiles.getAccion());
                        perfiles.setEstado(val);
                        objtList = perfilesService.retornaPerfilesPorEstado(perfiles);
                        if (objtList != null && objtList.size() > 0) {
                            obj.setMsg(Constantes.msgTransaccionOk);
                            obj.setEstado(Constantes.valTransaccionOk);
                             obj.setCantidad(((Perfiles)objtList.get(0)).getCantidad());
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
    public ResponseWrapper listPerfilesPorLikeNombre(@RequestBody @Validated Perfiles perfiles, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        try {
                if (perfiles.getAccion() != null) {
                    try {                        
                        perfiles.setNombres(perfiles.getAccion());
                        objtList = perfilesService.retornaPerfilesLikePorNombre(perfiles);
                        if (objtList != null && objtList.size() > 0) {
                            obj.setMsg(Constantes.msgTransaccionOk);
                            obj.setEstado(Constantes.valTransaccionOk);
                             obj.setCantidad(((Perfiles)objtList.get(0)).getCantidad());
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
    public ResponseWrapper retornaPerfilesPorId(@RequestBody @Validated Perfiles perfiles, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        ResponseWrapper obj = new ResponseWrapper();
        Perfiles c = new Perfiles();
        try {
                c = perfilesService.retornaObjPerfiles(perfiles);
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
    
    @RequestMapping(value = "/paginaporperfil", method = RequestMethod.POST)
    public List<Pagina> listPaginaPorPerfil(@RequestBody @Validated Perfiles perfiles, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        Perfiles c = new Perfiles();
            c.setIdperfiles(perfiles.getIdperfiles());
            return perfilesService.retornaPaginasMapPorPerfil(c);
      
    }
}