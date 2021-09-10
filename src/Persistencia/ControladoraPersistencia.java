
package Persistencia;

import Logica.Animal;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladoraPersistencia {
    
    //Instaciamos a AnimalJpaController y llamamos al construtor 
    
    AnimalJpaController jpaAnimal = new AnimalJpaController();
    
    //Metodo que recibe un animal y creamos el animal con el metodo create, try catch 
    public void altaAnimal(Animal mascota){
        try {
            jpaAnimal.create(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
    

