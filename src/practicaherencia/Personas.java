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
public class Personas {
    
    private String Nombre, Apellido,Identidad,Fecha_Nac,variable;

    public Personas(String Nombre, String Apellido, String Identidad, String Fecha_Nac) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Identidad = Identidad;
        this.Fecha_Nac=Fecha_Nac;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(String Identidad) {
        this.Identidad = Identidad;
    }

    public String getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(String Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
    
    
    
    
    
}
