
package org.partner.minsa.acs.controller.rest;
import org.partner.minsa.acs.service.ModuloService;
import org.partner.minsa.acs.domain.Modulo;
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
@RequestMapping(value = "/api/modulo")
public class	ModuloRestController{
 @Resource(name = "moduloService")
    ModuloService moduloService;
 /*
 @RequestMapping(value = "/inserta", method = RequestMethod.POST)
    public ResponseWrapper insertaModulo(@RequestBody @Validated Modulo modulo, HttpServletRequest request) throws Exception {
        
        ResponseWrapper response = new ResponseWrapper();
        try {
                Integer cat = 0;
                if (modulo.getAccion().equals(Constantes.accionDelet)) {
                    if (modulo.getEstado() == 1) {
                        modulo.setEstado(0);
                    } else {
                        modulo.setEstado(1);
                    }
                    cat = moduloService.eliminaModulo(modulo);
                } else {
                    if (modulo.getIdmodulo() != null && modulo.getIdmodulo() > 0) {
                        cat = moduloService.updateModulo(modulo);
                    } else {
                        cat = moduloService.insertaModulo(modulo);
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
    public ResponseWrapper listModuloActivas(@RequestBody @Validated Modulo modulo, HttpServletRequest request) throws Exception {

        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        try {
                if (modulo.getAccion() != null) {
                    try {
                        int val = Integer.parseInt(modulo.getAccion());
                        modulo.setEstado(val);
                        objtList = moduloService.retornaModuloPorEstado(modulo);
                        if (objtList != null && objtList.size() > 0) {
                            obj.setMsg(Constantes.msgTransaccionOk);
                            obj.setEstado(Constantes.valTransaccionOk);
                             obj.setCantidad(((Modulo)objtList.get(0)).getCantidad());
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
    public ResponseWrapper listModuloPorLikeNombre(@RequestBody @Validated Modulo modulo, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        try {
                if (modulo.getAccion() != null) {
                    try {                        
                        modulo.setDescripcion(modulo.getAccion());
                        objtList = moduloService.retornaModuloLikePorNombre(modulo);
                        if (objtList != null && objtList.size() > 0) {
                            obj.setMsg(Constantes.msgTransaccionOk);
                            obj.setEstado(Constantes.valTransaccionOk);
                             obj.setCantidad(((Modulo)objtList.get(0)).getCantidad());
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
    public ResponseWrapper retornaModuloPorId(@RequestBody @Validated Modulo modulo, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        ResponseWrapper obj = new ResponseWrapper();
        Modulo c = new Modulo();
        try {
                c = moduloService.retornaObjModulo(modulo);
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

    }*/
}