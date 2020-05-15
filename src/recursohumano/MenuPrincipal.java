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
        System.out.println("****************************************");
        System.out.println("         CRUD  DE JAVA EN CONSOLA       ");
        System.out.println("****************************************");
        System.out.println(" Opciones:");
        System.out.println("            1.Crear Registros           ");
        System.out.println("            2.Consultar Registros       ");
        System.out.println("            3.Editar Registros       ");
        System.out.println("            4.Eliminar Registros        ");
        System.out.println("            5.Salir");
        System.out.println("****************************************");
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
            System.out.println("Seleccion Invalida!");
            break;
    }
  }
}


    