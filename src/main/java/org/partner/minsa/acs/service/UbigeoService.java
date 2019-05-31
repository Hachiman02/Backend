
package org.partner.minsa.acs.service;
import org.partner.minsa.acs.domain.Red;
import org.partner.minsa.acs.domain.Microred;


import org.partner.minsa.acs.domain.Ubigeo;
import org.partner.minsa.acs.domain.Eess;

import java.util.List;

public interface UbigeoService {
	public List<Ubigeo> retornaUbigeo();

	public List<Ubigeo> retornaUbigeoTodas();

	public List<Ubigeo> retornaUbigeoPorEstado(Ubigeo idubigeo);
    public List<Eess> retornaObjEstable(Microred mr);

					     
	public List<Ubigeo> retornaUbigeoPorDepartamento(Ubigeo idubigeo);
	public List<Ubigeo> retornaUbigeoPorProvincia(Ubigeo idubigeo);

	public List<Ubigeo> retornaUbigeoPorDistrito(Ubigeo idubigeo);
    public List<Red> retornaObjRed(Ubigeo idubigeo);
    public List<Microred> retornaObjUbigeoDistrito(Red r);


	 public List<Ubigeo> retornaUbigeoLikePorNombre(Ubigeo idubigeo);

	public Ubigeo retornaObjUbigeo(Ubigeo idubigeo);

	public Integer updateUbigeo(Ubigeo idubigeo);

	public Integer insertaUbigeo(Ubigeo idubigeo);

	public Integer eliminaUbigeo(Ubigeo idubigeo);
    public List<Red> retornaObjDepartamento();

    public List<Ubigeo> retornaObjProvincia(Ubigeo idubigeo);

  //  public List<Ubigeo> retornaObjUbigeoDistrito(Ubigeo idubigeo);
}