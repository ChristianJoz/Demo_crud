
package recursohumano;


public class Persona {
    private int idPersona;
    private String nomPersona;
    private String emailPersona;
    private String telPersona;
    //Clases necesarias
    // Encapsulamiento
    public int getIdPersona(){
        return idPersona;
    }
    //get para obtener informacion o datos
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    // set para colocar o mostrar datos
    public String getNombrePersona(){
        return nomPersona;
    }
    
    public void setNomPersona(String nomPersona){
        this.nomPersona = nomPersona;
    }
    
    public String getEmailPersona(){
        return emailPersona;
    }
    
    public void setEmailPersona(String emailPersona){
        this.emailPersona = emailPersona;
    }
    
    public String getTelPersona(){
        return telPersona;
    }
    
    public void setTelPersona(String telPersona){
        this.telPersona = telPersona;
    }
    
}

//Editado por Bertha marisol ortiz ramos