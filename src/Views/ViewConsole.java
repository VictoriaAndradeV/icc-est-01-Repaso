package Views;
import Models.Persona;

public class ViewConsole {

    public void printPersonsArray(Persona[] personas){
        if(personas == null || personas.length == 0){
            System.out.println("No existen personas registradas");
        }
        for(int i = 0; i < personas.length; i++){
            System.out.println("Persona " +(i + 1) + " --> " +personas[i]);
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
