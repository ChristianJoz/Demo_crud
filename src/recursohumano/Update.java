/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//christian Morales 189519
package recursohumano;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    
    Update() throws SQLException{
    Scanner leer = new Scanner(System.in);
    Persona person = new Persona();
    ConexionCRUD utilerias = new ConexionCRUD();
    System.out.println("<< ACTUALIZAR REGISTROS >>");
    
    System.out.println("Ingresa el id del registro a modificar");
    person.setIdPersona(leer.nextInt());
    
    
    String tablaBuscar = "tb_contacto";
    String campoBuscar = "id_contacto, nom_contacto, email_contacto, tel_contacto";
    String condicionBuscar = " id_contacto = " + person.getIdPersona();
    utilerias.desplegarRegistros(tablaBuscar, campoBuscar, condicionBuscar);
  
    System.out.println("Nombre: ");
    person.setNomPersona(leer.next());
    
    
    System.out.println("Correo electronico: ");
    person.setEmailPersona(leer.next());
    
    
    System.out.println("Telefono: ");
    person.setTelPersona(leer.next());
    
    String tabla = "tb_contacto";
   String camposValoresNuevos= "nom_contacto = '" + person.getNombrePersona() + "' , email_contacto = '" + person.getEmailPersona() + "' , tel_contacto = '" + person.getTelPersona() + "'";
    
    utilerias.actualizarEliminarRegistro(tabla, camposValoresNuevos, condicionBuscar);
    System.out.println("Modificado correctamente!");
    
    MenuPrincipal.desplegarMenu();
    
    
    }
}
