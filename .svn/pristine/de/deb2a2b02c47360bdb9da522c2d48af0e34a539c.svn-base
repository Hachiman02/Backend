
package org.partner.minsa.acs.controller.rest;
import org.partner.minsa.acs.service.PeriodoService;
import org.partner.minsa.acs.domain.Periodo;
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
@RequestMapping(value = "/api/periodo")
public class	PeriodoRestController{
 @Resource(name = "periodoService")
    PeriodoService periodoService;
 @RequestMapping(value = "/inserta", method = RequestMethod.POST)
    public ResponseWrapper insertaPeriodo(@RequestBody @Validated Periodo periodo, HttpServletRequest request) throws Exception {
        
        ResponseWrapper response = new ResponseWrapper();
        try {
                Integer cat = 0;
                if (periodo.getAccion().equals(Constantes.accionDelet)) {
                    if (periodo.getEstado() == 1) {
                        periodo.setEstado(0);
                    } else {
                        periodo.setEstado(1);
                    }
                    cat = periodoService.eliminaPeriodo(periodo);
                } else {
                    if (periodo.getIdperiodo() != null && periodo.getIdperiodo() > 0) {
                        cat = periodoService.updatePeriodo(periodo);
                    } else {
                        cat = periodoService.insertaPeriodo(periodo);
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
    public ResponseWrapper listPeriodoActivas(@RequestBody @Validated Periodo periodo, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        try {
                if (periodo.getAccion() != null) {
                    try {
                        int val = Integer.parseInt(periodo.getAccion());
                        periodo.setEstado(val);
                        objtList = periodoService.retornaPeriodoPorEstado(periodo);
                        if (objtList != null && objtList.size() > 0) {
                            obj.setMsg(Constantes.msgTransaccionOk);
                            obj.setEstado(Constantes.valTransaccionOk);
                             obj.setCantidad(((Periodo)objtList.get(0)).getCantidad());
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
    public ResponseWrapper listPeriodoPorLikeNombre(@RequestBody @Validated Periodo periodo, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        List objtList = new ArrayList();
        ResponseWrapper obj = new ResponseWrapper();
        try {
                if (periodo.getAccion() != null) {
                    try {                        
                        periodo.setDescripcion(periodo.getAccion());
                        objtList = periodoService.retornaPeriodoLikePorNombre(periodo);
                        if (objtList != null && objtList.size() > 0) {
                            obj.setMsg(Constantes.msgTransaccionOk);
                            obj.setEstado(Constantes.valTransaccionOk);
                             obj.setCantidad(((Periodo)objtList.get(0)).getCantidad());
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
    public ResponseWrapper retornaPeriodoPorId(@RequestBody @Validated Periodo periodo, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        ResponseWrapper obj = new ResponseWrapper();
        Periodo c = new Periodo();
        try {
                c = periodoService.retornaObjPeriodo(periodo);
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