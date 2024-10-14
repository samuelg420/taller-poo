
package taller2;


public class Taller2 {

    
    public static void main(String[] args) {
        Maestro maestro1 = new Maestro("Juan Perez", "Matematicas", 5, "Licenciatura en Matematicas", "juanperez@escuela.edu");
        Maestro maestro2 = new Maestro("Maria Garcia", "Lengua", 10, "Licenciatura en Lengua y Literatura", "mariagarcia@escuela.edu");

       
        maestro1.mostrarDetalles();
        maestro1.darClase();
        maestro1.calificar();

        maestro2.mostrarDetalles();
        maestro2.darClase();
        maestro2.calificar();
    
    }
    
}
