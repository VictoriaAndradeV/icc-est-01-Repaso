package Controllers;
import Models.Persona;


/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {   
    
    private Persona[] personas;

    public void ordenarPorEdad(Persona[] personas) {
        for(int i = 1; i < personas.length; i++){
            Persona pasajero = personas[i];
            int j = i - 1;

            while (j <= 0 && (personas[j].getEdad() > pasajero.getEdad())) { 
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = pasajero;
        }  
    }

    public Persona buscarPorEdad(Persona[] persons, int edad) {
        int bajo = 0;
        int alto = (persons.length - 1);

        while(bajo <= alto){

            int central = (bajo + alto)/2;

            if(persons[central].getEdad() == edad){ // caso en el que el numero buscado coincide con el central calculado
                return persons[central];
            }

            if(persons[central].getEdad() < edad){ //nos vamos a la derecha, se actualiza el bajo
                bajo = central + 1;
            }else {
                alto = central - 1;
            }
        }
        return null;

    }
  
}
