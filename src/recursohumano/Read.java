/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//189519
package recursohumano;
import java.sql.SQLException;


public class Read {
    public Read() throws SQLException{
    System.out.println("<< CONSULTA DE REGISTROS >>");
    mostrarResultados();
    }
    
    private void mostrarResultados() throws SQLException{
    try{
        ConexionCRUD utilerias = new ConexionCRUD();
        String tabla ="tb_contacto";
        String camposTabla= "*";
        String condicionBusqueda= "";
        
        utilerias.desplegarRegistros(tabla, camposTabla, condicionBusqueda);
    } catch(SQLException ex){
    
    System.out.println("Ha ocurrido el siguiente errror; "  + ex.getMessage());
    
    }finally{
    
    MenuPrincipal.desplegarMenu();
    }
    
    }
}
