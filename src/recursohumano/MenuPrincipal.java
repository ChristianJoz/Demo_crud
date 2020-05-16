/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursohumano;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author Josue Morales 189519
 */
public class MenuPrincipal {
    public static void main (String[]args) throws SQLException{
        desplegarMenu();
    }
    
    public static void desplegarMenu() throws SQLException{
        Scanner opcionSeleccionada= new Scanner (System.in);
        String opcionMenu;
        //Menu desplegar
        System.out.println("---------------------------------------");
        System.out.println("         CRUD  DE JAVA MODIFICADO CARLOS     ");
        System.out.println("-----------------------------------------");
        System.out.println(" Opciones Disponibles:");
        System.out.println("            1.Crear un Registro           ");
        System.out.println("            2.Consultar Los Registros       ");
        System.out.println("            3.Editar un Registros       ");
        System.out.println("            4.Eliminar Registros        ");
        System.out.println("            5.Exit");
        System.out.println("-----------------------------------------");
        System.out.println("Seleccionar Opcion");
        opcionMenu = opcionSeleccionada.next();
        
        switch (opcionMenu){
        case "1":
        Create create = new Create();
            break;
        case "2":
            Read read = new Read();
            break;
        case "3":
            Update update = new Update();
            break;
        case "4":
            Delete delete= new Delete();
            break;
        case "5":
            System.exit(0);
            break;
        default:
            System.out.println("Seleccion NO VALIDA!");
            break;
    }
  }
}


    //Editado por Carlos Daniel Privado