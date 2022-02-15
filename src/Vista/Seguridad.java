package Vista;

import javax.swing.JOptionPane;

public class Seguridad {
    
    frmLogin login = new frmLogin();
    String res;
    
    public void validarUsuario(String estudiante[],String profesor[], String user, String pwd, int intentos)
    {
        boolean encontrado = false;
        
        for (int i = 0; i<profesor.length; i++)
        {
            if((profesor[i].equalsIgnoreCase(user) && profesor[i+1].equals(pwd)))
            {
                res = "Bienvenido profesor " + user;
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                intentos = 0;
                login.setIntentos(intentos);
                break; 
            }
            /*if((estudiante[i].equalsIgnoreCase(user) && estudiante[i+1].equals(pwd)))
            {
                res = "Bienvenido estudiante" + user;
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                intentos = 0;
                login.setIntentos(intentos);
                break;
            }*/
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
