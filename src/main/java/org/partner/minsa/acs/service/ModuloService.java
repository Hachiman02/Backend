
package org.partner.minsa.acs.service;

import org.partner.minsa.acs.domain.Modulo;
import java.util.List;

public interface ModuloService {
	public List<Modulo> retornaModulo();

	public List<Modulo> retornaModuloTodas();

	public List<Modulo> retornaModuloPorEstado(Modulo idmodulo);

	public List<Modulo> retornaModuloLikePorNombre(Modulo idmodulo);

	public Modulo retornaObjModulo(Modulo idmodulo);

	public Integer updateModulo(Modulo idmodulo);

	public Integer insertaModulo(Modulo idmodulo);

	public Integer eliminaModulo(Modulo idmodulo);
}