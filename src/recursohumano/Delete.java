/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursohumano;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
   Delete() throws SQLException {
   Scanner leer = new Scanner(System.in);
   ConexionCRUD utilerias = new ConexionCRUD();
   System.out.println("<< Eliminar Registros >>" );
   
   System.out.println("Ingresa id del registro");
   String idContactoEliminar = leer.next();
   
   String tabla = "tb_contacto";
   String campos = "*";
   String condicion =  "id_contacto = " + idContactoEliminar;
   utilerias.desplegarRegistros(tabla, campos, condicion);

   System.out.println("Presionar <<Y>> para confirmar: ");
   String confirmarBorrar = leer.next();
   
   if("Y".equals(confirmarBorrar)){
   
   String valoresCamposNuevos = "";
   utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
   System.out.println("Resgistro Borrado Satisfactoriamente!");
   }
   MenuPrincipal.desplegarMenu();
   } 
}
//christian morales 189519