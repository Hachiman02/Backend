package org.partner.minsa.acs.controller.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.partner.minsa.acs.domain.Alumno_programa;
import org.partner.minsa.acs.domain.Marca;
import org.partner.minsa.acs.domain.ResponseWrapper;
import org.partner.minsa.acs.service.Alumno_programaService;
import org.partner.minsa.acs.service.MarcaService;
import org.partner.minsa.acs.service.ValidarCorreService;
import org.partner.minsa.acs.utils.Constantes;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "pub/zigap")
public class ZigapRestController {
	
	 @Resource(name = "marcaService")
	    MarcaService marcaService;
	 @Resource(name = "validarCorreoService")
		ValidarCorreService validarCorreoService;
		
		@Resource(name = "alumno_programaService")
		Alumno_programaService alumno_programaService;
		
		 
	@RequestMapping(value = "/validarcorreo", method = RequestMethod.POST)
		//public ResponseWrapper validarcorreo(@RequestBody @Validated ResponseWrapper wrapper, HttpServletRequest request) throws Exception {
	 	public ResponseWrapper validarcorreo(@RequestBody @Validated ResponseWrapper wrapper) throws Exception {
	        //HttpSession session = request.getSession();
	        List objtList = new ArrayList();
		  
	        ResponseWrapper obj = new ResponseWrapper();
	         try {
				
		     	objtList=validarCorreoService.validarCorreo(wrapper.getLsAlumno_programa());
	        	 int i=0;
	        	i=9;

	        	obj.setAaData(objtList);	        	/* correo = new CorreoValidar();
	        	correo.setCorreo_por_validar(wrapper.getCorreo());
	            correo.start(); 
	              */       

	 
	        } catch (Exception e) {
	             

	        } finally {
	            return obj;
	        }

	    }

	@RequestMapping(value = "/lsalumnoprograma", method = RequestMethod.POST)
	public ResponseWrapper lsAlumno_programa(@RequestBody @Validated Alumno_programa alumno_programa, HttpServletRequest request)
			throws Exception {
		HttpSession session = request.getSession();
		List objtList = new ArrayList();
		List objtListsize = new ArrayList();
		ResponseWrapper obj = new ResponseWrapper();
	 
		try {
			 
				try {
					 
					String url = "jdbc:postgresql://67.205.143.180:5432/tcs2";
					String user="modulo4";
					String password="modulo4";
					Integer limite_inferior=1, limite_superior=20;
					Connection con =DriverManager.getConnection(url,user,password);
					Statement st = (Statement) con.createStatement();
				try{
					 ResultSet rs;
					 ResultSet rssize;
					 if(alumno_programa.getId_programa()==null){
					 
					 rs = st.executeQuery("select alu.cod_alumno, alu.ape_paterno, alu.ape_materno,alu.nom_alumno,alu.correo,"
								+ "alu.correo_personal,pro.nom_programa "
								+ "from alumno_programa alu "
								+ "inner join programa pro on pro.id_programa=alu.id_programa "
								+ "order by  alu.correo asc	offset "+alumno_programa.getOffset()+ " limit " +alumno_programa.getLimit());
						objtList=resultSetToArrayList(rs);
				   		
	 				
					 rssize = st.executeQuery("select count(alu.*) "
	 							+"from alumno_programa alu "
	 							+"inner join programa pro on pro.id_programa=alu.id_programa ");
					 objtListsize=resultSetToArrayList(rssize);
					 }else{
						 rs = st.executeQuery("select alu.cod_alumno, alu.ape_paterno, alu.ape_materno,alu.nom_alumno,alu.correo,"
									+ "alu.correo_personal,pro.nom_programa "
									+ "from alumno_programa alu "
									+ "inner join programa pro on pro.id_programa=alu.id_programa "
									+ "where pro.id_programa="+alumno_programa.getId_programa()
									+" order by  alu.correo asc	offset "+alumno_programa.getOffset()
									+ " limit " +alumno_programa.getLimit());
						 objtList=resultSetToArrayList(rs);
						 rssize = st.executeQuery("select count(alu.*) "
		 							+"from alumno_programa alu "
		 							+"inner join programa pro on pro.id_programa=alu.id_programa "
		 							+ "where pro.id_programa="+alumno_programa.getId_programa() );
						 objtListsize=resultSetToArrayList(rssize);
				 	 }
					 
				}catch(Exception e ){
					System.out.println("Excepcion "+ e.getMessage());	
					}
					
					
			//	objtList = alumno_programaService.retornalsalumno_programa();
					if (objtList != null && objtList.size() > 0) {
						obj.setMsg(Constantes.msgTransaccionOk);
						obj.setEstado(Constantes.valTransaccionOk);
						obj.setAaData(objtList);
						obj.setDefaultObj(objtListsize.get(0));
					} else {
						obj.setMsg(Constantes.msgTransaccionFiltroNoEncontrada);
						obj.setEstado(Constantes.valTransaccionNoEncontro);
						obj.setAaData(objtList);
					}
				} catch (Exception e) {
					 
					obj.setEstado(Constantes.valTransaccionErrornull);
					obj.setAaData(objtList);
				}

			 

		} catch (Exception e) {
			obj.setMsg(Constantes.msgTransaccionErrorNull);
			obj.setEstado(Constantes.valTransaccionErrornull);
			obj.setAaData(objtList);

		} finally {
			return obj;
		}

	}
	
	@RequestMapping(value = "/lsprograma", method = RequestMethod.POST)
	public ResponseWrapper lsprograma(@RequestBody @Validated Alumno_programa alumno_programa, HttpServletRequest request)
			throws Exception {
		HttpSession session = request.getSession();
		List objtList = new ArrayList();
		List objtListsize = new ArrayList();
		ResponseWrapper obj = new ResponseWrapper();
	 	try {
	 			try {
		 			String url = "jdbc:postgresql://67.205.143.180:5432/tcs2";
					String user="modulo4";
					String password="modulo4";
					Integer limite_inferior=1, limite_superior=20;
					Connection con =DriverManager.getConnection(url,user,password);
					Statement st = (Statement) con.createStatement();
				try{
					 ResultSet rs = st.executeQuery("select * from programa");
				 		objtList=resultSetToArrayList(rs);
			 	}catch(Exception e ){
					System.out.println("Excepcion "+ e.getMessage());	
					}
			  		if (objtList != null && objtList.size() > 0) {
						obj.setMsg(Constantes.msgTransaccionOk);
						obj.setEstado(Constantes.valTransaccionOk);
						obj.setAaData(objtList);
 					} else {
						obj.setMsg(Constantes.msgTransaccionFiltroNoEncontrada);
						obj.setEstado(Constantes.valTransaccionNoEncontro);
						obj.setAaData(objtList);
					}
				} catch (Exception e) {
					 
					obj.setEstado(Constantes.valTransaccionErrornull);
					obj.setAaData(objtList);
				}
	 	} catch (Exception e) {
			obj.setMsg(Constantes.msgTransaccionErrorNull);
			obj.setEstado(Constantes.valTransaccionErrornull);
			obj.setAaData(objtList);
 		} finally {
			return obj;
		}

	}
	
	public ArrayList resultSetToArrayList(ResultSet rs) throws SQLException{
	    ResultSetMetaData md = rs.getMetaData();
	    int columns = md.getColumnCount();
	    ArrayList results = new ArrayList();
	    List<Alumno_programa> lsalumno = new ArrayList();
	    while (rs.next()) {
	        HashMap row = new HashMap();
	        results.add(row);
	       

	        for(int i=1; i<=columns; i++){
	          row.put(md.getColumnName(i),rs.getObject(i));
	        }
	    }
	    return results;
	}
	
}
