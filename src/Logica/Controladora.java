
package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    //Creamos un objecto 
    
    ControladoraPersistencia controlPer = new ControladoraPersistencia();
    
   //Metodo altaAnimal
    
   public void altaAnimal(int num_Cliente, String nombre_Perro, String raza, String color, String alergico, String atencion_Especial, String nombre_Duenio, String celular_Dunio, String observaciones){
       
       Animal masc = new Animal();
       
       masc.setAlergico(alergico);
       masc.setAtencion_Especial(atencion_Especial);
       masc.setCelular_Dunio(celular_Dunio);
       masc.setColor(color);
       masc.setNombre_Duenio(nombre_Duenio);
       masc.setNombre_Perro(nombre_Perro);
       masc.setNum_Cliente(num_Cliente);
       masc.setObservaciones(observaciones);
       masc.setRaza(raza);
       
       //Ingresamos a la controladora 
       
       controlPer.altaAnimal(masc);
       
   }
}
