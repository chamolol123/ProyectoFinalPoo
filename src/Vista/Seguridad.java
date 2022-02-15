package Vista;

import javax.swing.JOptionPane;

public class Seguridad {
    
    frmLogin login = new frmLogin();
    String res;
    
    public void validarUsuario(String usuarios[], String user, String pwd, int intentos)
    {
        boolean encontrado = false;
        
        for (int i = 0; i<usuarios.length; i++)
        {
            if((usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equals(pwd)))
            {
                res = "Bienvenido " + user;
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                intentos = 0;
                login.setIntentos(intentos);
                break;
            }
        }
        
        if(encontrado == false)//Estado de la cuenta
        {
            res = "Clave o usuario erronéo. Tienes " + intentos + " intentos fallidos.";
            JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
        if(intentos > 2)
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrará", "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
    }
    
}
