package Modelo;

import Vista.JFrameLogin;
import javax.swing.JOptionPane;

public class Seguridad {
    
    JFrameLogin login = new JFrameLogin();
    String persona;
    
    public void validarUsuario(String usuarios[], String user, String pwd, int intentos, boolean verificarFrame)
    {
        boolean encontrado = false;
        
        for (int i = 0; i<usuarios.length; i++)
        {
            if((usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equals(pwd)))
            {
                persona = usuarios[i+2];
                encontrado = true;
                
                if("Estudiante".equals(persona))
                {
                    
                    verificarFrame = false;
                    login.setVerificarFrame(verificarFrame);
                     
                }else
                {
                    
                    verificarFrame = true;
                    login.setVerificarFrame(verificarFrame);
                    
                }
                
                intentos = 0;
                login.setIntentos(intentos);
                login.setEncontrado(encontrado);
                break; 
            }
        }
        
        if(encontrado == false)//Estado de la cuenta
        {
            JOptionPane.showMessageDialog(null, "Clave o usuario erronéo. Tienes " + intentos + " intentos fallidos.", "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
        if(intentos > 2)
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrará", "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
    }
    
}
