
package org.partner.minsa.acs.service.impl;
import org.apache.commons.net.telnet.TelnetClient;
import org.partner.minsa.acs.domain.Alumno_programa;
import org.partner.minsa.acs.service.ValidarCorreService;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 import javax.swing.JOptionPane;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;


 @Service("validarCorreoService")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)

public class	ValidarCorreoServiceImpl	implements ValidarCorreService	{
	TelnetClient telnet= new TelnetClient();
    InputStream in;
    PrintStream out;
    BufferedReader reader;
    Component contentPane ;
	String cadena;
	MimeMessageHelper tfComprobar  ;
 	 
 
@Override
public List 	validarCorreo(List<Alumno_programa> lsalumno){
	Boolean rpta=false;
	
   String serverName = "aspmx.l.google.com";
  // String serverName = "smtp.live.com";

   
   Pattern p;
    Matcher m;
    
   
    try
    {
    	
        //Abro la conexión al Telnet por el puerto 25
        telnet.connect(serverName, 25);
        //telnet.connect(serverName, 587);
 
        //Ahora necesito una forma de leer las respuestas que
        //me envía el telnet, para esto obtenemos un InputStream
        //del objeto telnet
        in = telnet.getInputStream();

        //Ahora necesito una forma de enviarle los comandos al telnet
        //para esto obtengo un OutputStream desde el objeto telnet
        out = new PrintStream(telnet.getOutputStream());
 
 
        //Ahora envuelvo el InputStream dentro de un BufferedReader
        //para que la lectura de las respuestas del telnet sean mucho
        //mas sencillas y mejor gestionadas
        reader = new BufferedReader(new InputStreamReader(in));
        
        //procedemos a ingresar el primer comando
        //a través del método write, el cual escribe en la consola
        write("HELO hola");
         
        //Leemos por consola hasta la que encuentra la palabra service
        readUntil("service");
 
        for(int i=0;i<lsalumno.size();i++){
			 
        	if(lsalumno.get(i).getCheck()==null){
        	}
        	else{
        	if(lsalumno.get(i).getCorreo().length()>1){
	
        //Aquí se pone el correo personal(correo_Personal) 
        write("mail from:<luisteven94@gmail.com>");//IMPORTANTE: Es necesario poner una
        readUntil("gsmtp");                //cuenta de correo que exista para que funcione
 
        write("RCPT TO:<"+lsalumno.get(i).getCorreo()+">");//La variable correo es el correo a consultar
        readUntil("gsmtp");                
         
        //Aquí esta el "truco" para saber
        //si existe el correo, con esto comprobamos
         //Si es un 250 existe sino no
        p = Pattern.compile("250");
      
        //La variable cadena debe de ser un atributo
        //de la clase y es de tipo String.
        System.out.println("cadena final "+cadena);
        m = p.matcher(cadena);
        if (!m.find())
	      {//rpta=" No existe este correo.";
         rpta=false;
        }
        else{
         // rpta=" Existe este correo.";
        rpta=true;
         }
        System.out.println("Respuesta  "+rpta);
        	}
        lsalumno.get(i).setEstado_correo(rpta);
        
        	}
        
    	}
        
     } 
    catch (Exception e)
    {
        e.printStackTrace();
    } finally
    {
        try
        {
         //Liberamos recursos
         out.close();
         reader.close();
         in.close();
         return lsalumno;
        // telnet.disconnect();
      //   return lsalumno;
        } catch (IOException ex) 
        {
            Logger.getLogger(TelnetClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

return lsalumno;
}


public void write(String value) 
{
 try {
     out.println(value);
      out.flush();
     System.out.println("value "+value);
 } catch (Exception e) {
     e.printStackTrace();
 }
}

public String readUntil(String pattern) 
 {
     StringBuffer sb = new StringBuffer();
 
     try {
         char lastChar = pattern.charAt(pattern.length() - 1);
 
         boolean found = false;
 
         int check = in.read();
         char ch = (char) check;
         while (check != -1) {
             //System.out.print(ch);
             sb.append(ch);
             if (ch == lastChar) {
                 if (sb.toString().endsWith(pattern)) 
                 {
                     //Hay que declarar la variable cadena
                     //como un atributo de la clase y de 
                     //tipo String
                     cadena=sb.toString();
                     System.out.println("cadena "+cadena);
                  return sb.toString();
                 }
             }
             check = in.read();
             ch = (char) check;
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 
     return sb.toString();
 }
}