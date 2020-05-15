/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursohumano;
import java.sql.*;
/**
 *
 * @author Josue Morales 189519
 */
public class ConexionCRUD {
    private final String servidor = "jdbc:mysql://127.0.0.1:3306/bd_recurso_humano";
    private final String usuario = "root";
    private final String clave = "";
    private final String driverConector = "com.mysql.jdbc.Driver";
    private static Connection conexion;
    
    
    public ConexionCRUD(){
        try{
            Class.forName(driverConector);
            
            conexion=DriverManager.getConnection(servidor, usuario, clave);
              }catch(ClassNotFoundException | SQLException e){
        System.out.println("Conexion Fallida! Error!:"+ e.getMessage());
                }  
    }
    
    public Connection getConnection(){
    return conexion;
    }
    
    public void guardarRegistros(String tabla, String camposTabla, String valoresCampos){
    ConexionCRUD conectar = new ConexionCRUD();
    Connection cone = conectar.getConnection();
    try{
        String sqlQueryStmt = "INSERT INTO " + tabla + " ( "  + camposTabla + " ) VALUES(" + valoresCampos + ");";  
        
        Statement stmt;
        stmt =  cone.createStatement();
        stmt.executeUpdate(sqlQueryStmt);
        stmt.close();
        cone.close();
        System.out.println("Registro guardado correctamente!");
    
        
    }catch(Exception e){
    System.out.println(e.getMessage());
    }
    }
    
    
    public void actualizarEliminarRegistro(String tabla, String valorcamponuevo , String condicion){
        // Cargar conexion
        ConexionCRUD conectar = new ConexionCRUD();
        Connection cone = conectar.getConnection();
        try {
            Statement statement;
            String sqlQueryStatement;
            // Varificar valorcamponuevo
            if(valorcamponuevo.isEmpty()){
                
                sqlQueryStatement = "DELETE FROM " + tabla + " WHERE " + condicion + ";";
            }else{
                
                sqlQueryStatement = "UPDATE " + tabla + " SET " + valorcamponuevo + " WHERE " + condicion + ";";
            }
            statement = cone.createStatement();
            statement.executeUpdate(sqlQueryStatement);
            statement.close();
            cone.close();
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido el siguiente error; " + ex.getMessage());
        }
    }
    
    public void desplegarRegistros(String tablaBuscar, String camposBuscar, String condicionBuscar) throws SQLException{
    ConexionCRUD conectar = new ConexionCRUD();
    Connection cone = conectar.getConnection();
    try{
        Statement stmt;
        String sqlQueryStmt;
       if(condicionBuscar.equals("")){
       sqlQueryStmt = "SELECT "  +  camposBuscar  +  " FROM "  +   tablaBuscar  +  ";";
       }else{
       sqlQueryStmt = "SELECT "  +  camposBuscar  +  " FROM "  +   tablaBuscar  +  " WHERE "  +  condicionBuscar;
       }  
        stmt = cone.createStatement();
        stmt.executeQuery(sqlQueryStmt);
        try(ResultSet miResultSet = stmt.executeQuery(sqlQueryStmt)){
            if(miResultSet.next()) {
                ResultSetMetaData metaData = miResultSet.getMetaData();
                int numColumnas = metaData.getColumnCount();
                System.out.println("<< REGIRSTROS ALMACENADOS >>");
                System.out.println();
                for (int i = 1; i <= numColumnas; i++){
                    System.out.printf("%-20s\t", metaData.getColumnName(i));
                }
             System.out.println();
             do{
                 for(int i = 1; i <= numColumnas; i++){
                 System.out.printf("%-20s\t", miResultSet.getObject(i));
                  }
                 System.out.println();
             
                 
                 
             }while(miResultSet.next());
             System.out.println();
             }else{
            System.out.println("No se han encontrado registos");
            }
         miResultSet.close();
        }finally{
        stmt.close();
        cone.close();
        }
    
    }catch(SQLException ex){
        System.out.println("Ha ocurrido el siguiente error:" + ex.getMessage());
    }
}
    
}
