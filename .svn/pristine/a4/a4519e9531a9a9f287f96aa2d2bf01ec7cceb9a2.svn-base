package org.partner.minsa.acs.utils;

import java.security.Principal;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
public class Funciones {
	public String sacaid(HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		return principal.getName();
	}
	public Timestamp retornaCalendarFromString(String val) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = formatter.parse(val);
		Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		return timestamp;
	}	
}
