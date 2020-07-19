/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherencia;

/**
 *
 * @author hecto
 */
public class Alumnos extends Personas{
    
    private String NumeroAlumno;
    private Integer Nota1,Nota2,Nota3;
    private double Promedio;

    public Alumnos(String NumeroAlumno, Integer Nota1, Integer Nota2, Integer Nota3, double Promedio, String Nombre, String Apellido, String Identidad, String Fecha_Nac) {
        super(Nombre, Apellido,Identidad,Fecha_Nac);
        this.NumeroAlumno = NumeroAlumno;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.Promedio = Promedio;
    }
    
    public void mostrardatos(){
        System.out.println("Alumno:"+getNombre()+" Apellido: "+getApellido()+"\n Nota1: "+Nota1+"\n Nota2: "+Nota2+"\n Nota3: "+Nota3+"\nPromedio: "+ Promedio);
    }
    
    
    
}
