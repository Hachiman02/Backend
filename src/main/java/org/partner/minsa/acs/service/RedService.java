
package org.partner.minsa.acs.service;

import org.partner.minsa.acs.domain.Red;
import java.util.List;

public interface RedService {
	public List<Red> retornaRed();

	public List<Red> retornaRedTodas();

	public List<Red> retornaRedPorEstado(Red idred);
	public List<Red> retornaRedPorDiresa(Red idred);
	public List<Red> retornaRedLikePorNombre(Red idred);
	public List<Red> listaDepa(Red red);

	public Red retornaObjRed(Red idred);

	public Integer updateRed(Red idred);

	public Integer insertaRed(Red idred);

	public Integer eliminaRed(Red idred);
}