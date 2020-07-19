/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class PracticaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String Nombre,Apellido,Fecha_Nac,Identidad,NumeroAlumno;
        int Nota1,Nota2,Nota3;
        
        NumeroAlumno=JOptionPane.showInputDialog("Ingrese el codigo del Alumno: ");
        Identidad=JOptionPane.showInputDialog("Ingrese la Identidad del Alumno: ");
        Nombre= JOptionPane.showInputDialog("Ingrese el Nombre del Alumno: ");
        Apellido= JOptionPane.showInputDialog("Ingrese el Apellido del Alumno: ");
        Fecha_Nac= JOptionPane.showInputDialog("Ingrese la Fecha de Nacimiento del Alumno: ");
        Nota1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primer Nota del Alumno: "));
        Nota2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la segunda Nota del Alumno: "));
        Nota3= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tercera Nota del Alumno: "));
        
        Metodos promedio = new Metodos();
        
        Alumnos acceso = new Alumnos(NumeroAlumno,Nota1,Nota2,Nota3,promedio.calc_promedio(Nota1, Nota2, Nota3),Nombre,Apellido,Identidad,Fecha_Nac);
    //    public Alumnos(String NumeroAlumno, Integer Nota1, Integer Nota2, Integer Nota3, double Promedio, String Nombre, String Apellido, String Identidad, String Fecha_Nac) {
        acceso.mostrardatos();
       
    }
    
}
