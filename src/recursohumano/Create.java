/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// christian morale 189519
package recursohumano;
import java.sql.SQLException;
import java.util.Scanner;
public class Create {
   
   Create() throws SQLException {
   Scanner leer = new Scanner (System.in);
   Persona person = new Persona();
   System.out.println("<< CREAR REGISTROS >>");
   System.out.println("Nombre: ");
   person.setNomPersona(leer.nextLine());
   
   System.out.println("Correo electronico: ");
   person.setEmailPersona(leer.nextLine());
   
   
    System.out.println("Telefono: ");
   person.setTelPersona(leer.nextLine());
  
   String tabla ="tb_contacto";
   String camposTabla = "nom_contacto, email_contacto, tel_contacto";
   String valoresCampos = "'" + person.getNombrePersona() + "','" + person.getEmailPersona()+"','" + person.getTelPersona() + "'";
   
   ConexionCRUD utilerias = new ConexionCRUD();
   
   utilerias.guardarRegistros(tabla, camposTabla, valoresCampos);
   
   MenuPrincipal.desplegarMenu();
   
   } 
    
    
}
