
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {

            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),

        };

        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();
        vC.printMessage("Personas");
        vC.printPersonsArray(personas);
        vC.printMessage("Personas ordenadas");
        pC.ordenarPorEdad(personas);
        vC.printMessage("Persona buscada con edad 40");
        pC.buscarPorEdad(personas, 40);
        

        /*
        0. instanciar las clases necesarias
        1. Imprimir el arreglo
        2. Ordenar
        3. Imprimir el arreglo ordenado
        4. Buscar edad 40
        5. imprimir resultado
        6. buscar edad 99
        7. imprimir arreglo

        */

    }
}
