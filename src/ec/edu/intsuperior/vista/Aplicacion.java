package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aplicacion{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p2 = new Persona();
        
        
        p2.setCi(JOptionPane.showInputDialog("Ingresa numero de cedula"));
        p2.setNombre(JOptionPane.showInputDialog("Ingresa Nombre 1"));
        p2.setNombre2(JOptionPane.showInputDialog("Ingresa nombre 2 "));
        p2.setApellido1(JOptionPane.showInputDialog("Ingresa apellido 1  "));
        p2.setApellido2(JOptionPane.showInputDialog("Ingresa apellido 2"));
        p2.setCorreo(JOptionPane.showInputDialog("Ingresa correo  "));
        p2.setDireccion(JOptionPane.showInputDialog("Ingresa direccion "));
        p2.setTelefono(JOptionPane.showInputDialog("Ingresa telefono  "));
        p2.setFechadenacimiento(JOptionPane.showInputDialog("Ingresa edad  "));
        {
        JOptionPane.showMessageDialog(null, p2.toString());
        }       
        
        
        
        
        
        
    String nombre=JOptionPane.showInputDialog("Nombre del trabajadorRon");
    String profesion=JOptionPane.showInputDialog("Profesion de Ron");
int dt=Integer.parseInt(JOptionPane.showInputDialog("Dias trabajados de Ron"));
double pd=Double.parseDouble(JOptionPane.showInputDialog("Pago por dia de Ron"));
     
     double sb=0,aux;

 //Para conocer el salario bruto
        if(dt>30){
            double tn=25*pd;
           
            double sx=(pd*25);
            sb=sx+tn;
        }else{
            sb=dt*pd;
        }
     JOptionPane.showMessageDialog(null,"Trabajador: "+nombre+"\n"
             + "Profesion: "+profesion+"\n"
                     +"Dias trabajdos: "+dt+"\n"
             + "Sueldo bruto: "+sb+"\n");
        
    }
    }



