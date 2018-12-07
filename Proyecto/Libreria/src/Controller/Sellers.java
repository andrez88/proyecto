
package Controller;

/**
 * @author Miguel Bogota
 * @since 30/11/2018
 * @version 1.1
 */

public class Sellers {
    
    //Variables del usuario
    private static String[] name = new String[20];
    private static String[] user = new String[20];
    private static String[] pass = new String[20];
    
    //Asignar el admin en constructor
    public Sellers() {
        name[0] = "Miguel Bogota";
        user[0] = "Miguel";
        pass[0] = "Admin";
        name[1] = "Manuel Pulido";
        user[1] = "Manuel";
        pass[1] = "Admin";
    }
    
    //Asignar el valor a usuario y clave
    public void setInfo(int i, String user, String pass) {
        this.user[i] = user;
        this.pass[i] = pass;
    }
    
    //Asignar el valor del nombre
    public void setName(int i, String name) {
        this.name[i] = name;
    }
    
    //Metodo de autenticación
    public boolean Authenticate(String userName, String password) {
        
        boolean res = false;
        
        for (int i = 0; i < user.length; i++) {
            
            if (userName.equals(user[i]) && password.equals(pass[i])) {
                res = true;
            }
            
        }
        
        return res;
    }
    
    //Metodo para validar si el usuario existe
    public boolean checkName(String userName) {
        
        boolean res = false;
        
        for (int i = 0; i < user.length; i++) {
            
            if (userName.equalsIgnoreCase(user[i])) {
                res = true;
            }
            
        }
        
        return res;
        
    }
    
    //Obtener los datos de clave
    public String getName(int i) {
        return name[i];
    }
    
    //Obtener los datos de usuario
    public String getUser(int i) {
        return user[i];
    }
    
    //Obtener los datos de clave
    public String getPass(int i) {
        return pass[i];
    }
    
}
