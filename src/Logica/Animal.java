
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal implements Serializable{
    
    //Atributos 
    @Id //Mapeo
    private int num_Cliente;
    @Basic
    private String nombre_Perro;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_Especial;
    private String nombre_Duenio;
    private String celular_Dunio;
    private String observaciones;
    
    //Construtor vacio 

    public Animal() {
    }
    
    //Construtor con parametros

    public Animal(int num_Cliente, String nombre_Perro, String raza, String color, String alergico, String atencion_Especial, String nombre_Duenio, String celular_Dunio, String observaciones) {
        this.num_Cliente = num_Cliente;
        this.nombre_Perro = nombre_Perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_Especial = atencion_Especial;
        this.nombre_Duenio = nombre_Duenio;
        this.celular_Dunio = celular_Dunio;
        this.observaciones = observaciones;
    }
    
    //Getters y setters

    public int getNum_Cliente() {
        return num_Cliente;
    }

    public void setNum_Cliente(int num_Cliente) {
        this.num_Cliente = num_Cliente;
    }

    public String getNombre_Perro() {
        return nombre_Perro;
    }

    public void setNombre_Perro(String nombre_Perro) {
        this.nombre_Perro = nombre_Perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_Especial() {
        return atencion_Especial;
    }

    public void setAtencion_Especial(String atencion_Especial) {
        this.atencion_Especial = atencion_Especial;
    }

    public String getNombre_Duenio() {
        return nombre_Duenio;
    }

    public void setNombre_Duenio(String nombre_Duenio) {
        this.nombre_Duenio = nombre_Duenio;
    }

    public String getCelular_Dunio() {
        return celular_Dunio;
    }

    public void setCelular_Dunio(String celular_Dunio) {
        this.celular_Dunio = celular_Dunio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
     
    
}
