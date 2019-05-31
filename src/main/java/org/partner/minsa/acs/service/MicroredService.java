
package org.partner.minsa.acs.service;

import org.partner.minsa.acs.domain.Microred;
import java.util.List;

public interface MicroredService {
	public List<Microred> retornaMicrored();

	public List<Microred> retornaMicroredTodas();

	public List<Microred> retornaMicroredPorEstado(Microred idmicrored);

	public List<Microred> retornaMicroredLikePorNombre(Microred idmicrored);

	public Microred retornaObjMicrored(Microred idmicrored);

	public Integer updateMicrored(Microred idmicrored);

	public Integer insertaMicrored(Microred idmicrored);

	public Integer eliminaMicrored(Microred idmicrored);
}