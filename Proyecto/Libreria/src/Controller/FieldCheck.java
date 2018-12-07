
package Controller;

import java.awt.*;
import javax.swing.*;

/**
 * @author Miguel Bogota
 * @since 30/11/2018
 * @version 1.1
 */

public class FieldCheck {
    
    //Cambiar color de selecionado o error
    private void colorChange(JLabel user, JSeparator border, Color text, Color line) {
        user.setForeground(text);
        border.setBackground(line);
        border.setForeground(line);
    }
    
    //Metodo para validar los campos
    public boolean checkLogin(String user, String pass, JLabel userLabel, JLabel passLabel, JSeparator userBorder, JSeparator passBorder, JTextField userLogin, JTextField passLogin, Color textError) {
        
        //variable del metodo
        boolean res = false;
        
        //Validar si los campos estan vacios
        if (user.isEmpty() && pass.isEmpty()) {
            
            //Si los dos campos esta vacio
            colorChange(userLabel, userBorder, textError, textError);
            colorChange(passLabel, passBorder, textError, textError);
            
            userLogin.requestFocus();
            
        } else if(user.isEmpty()) {
            
            //Si el campo usuario esta vacio
            colorChange(userLabel, userBorder, textError, textError);
            
            userLogin.requestFocus();
            
        } else if(pass.isEmpty()) {
            
            //Si el campo clave esta vacio
            colorChange(passLabel, passBorder, textError, textError);
            
            passLogin.requestFocus();
            
        } else {
            
            //Si los campos estan llenos asignar true
            res = true;
            
        }
        
        return res;
        
    }
    
    //Metodo para validar los campos
    public boolean checkSignup(String user, String pass, String passRepeat, JLabel userSignupLabel, JLabel passSignupLabel, JLabel passRepeatSignupLabel, JSeparator userSignupBorder, JSeparator passSignupBorder, JSeparator passRepeatSignupBorder, JTextField userSignup, JTextField passSignup, JTextField passRepeatSignup, Color textError) {
        
        //variable del metodo
        boolean res = false;
        
        //Validar si los campos estan vacios
        if (user.isEmpty() && pass.isEmpty() && passRepeat.isEmpty()) {
            
            //Si los tres campos esta vacio
            colorChange(userSignupLabel, userSignupBorder, textError, textError);
            colorChange(passSignupLabel, passSignupBorder, textError, textError);
            colorChange(passRepeatSignupLabel, passRepeatSignupBorder, textError, textError);
            
            userSignup.requestFocus();
            
        } else if (user.isEmpty() && pass.isEmpty()) {
            
            //Si el campo usuario y clave estan vacio
            colorChange(userSignupLabel, userSignupBorder, textError, textError);
            colorChange(passSignupLabel, passSignupBorder, textError, textError);
            
            userSignup.requestFocus();
            
        } else if (user.isEmpty() && passRepeat.isEmpty()) {
            
            //Si el campo usuario y repetir clave estan vacio
            colorChange(userSignupLabel, userSignupBorder, textError, textError);
            colorChange(passRepeatSignupLabel, passRepeatSignupBorder, textError, textError);
            
            userSignup.requestFocus();
            
        } else if (pass.isEmpty() && passRepeat.isEmpty()) {
            
            //Si el campo clave y repetir clave estan vacio
            colorChange(passSignupLabel, passSignupBorder, textError, textError);
            colorChange(passRepeatSignupLabel, passRepeatSignupBorder, textError, textError);
            
            passSignup.requestFocus();
            
        } else if (user.isEmpty()) {
            
            //Si el campo usuario esta vacio
            colorChange(userSignupLabel, userSignupBorder, textError, textError);
            
            userSignup.requestFocus();
            
        } else if (pass.isEmpty()) {
            
            //Si el campo clave esta vacio
            colorChange(passSignupLabel, passSignupBorder, textError, textError);
            
            passSignup.requestFocus();
            
        } else if (passRepeat.isEmpty()) {
            
            //Si el campo repetir clave esta vacio
            colorChange(passRepeatSignupLabel, passRepeatSignupBorder, textError, textError);
            
            passRepeatSignup.requestFocus();
            
        } else {
            
            //Si los campos estan llenos
            res = true;
            
        }
        
        return res;
        
    }
    
    //Validar usuario y contraseña tenga mas de 8 caracteres
    public boolean checkLenght(String data) {
        
        //variable del metodo
        boolean res = false;
        
        int dataLenght = data.length();
        
        //Validar el largo de la cadena de texto
        if (dataLenght >= 8) {
            
            res = true;
            
        }
        
        return res;
        
    }
    
}
