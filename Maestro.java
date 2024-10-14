
package taller2;

public class Maestro {
    
    String nombre;
    String asignatura;
    int añosDeExperiencia;
    String tituloUniversitario;
    String correoElectronico;

    // Constructor
    public Maestro(String nombre, String asignatura, int añosDeExperiencia, String tituloUniversitario, String correoElectronico) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.añosDeExperiencia = añosDeExperiencia;
        this.tituloUniversitario = tituloUniversitario;
        this.correoElectronico = correoElectronico;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Asignatura: " + asignatura + ", Años de experiencia: " + añosDeExperiencia + ", Titulo universitario: " + tituloUniversitario + ", Correo electronico: " + correoElectronico);
    }

    public void darClase() {
        System.out.println(nombre + " esta dando clase de " + asignatura + ".");
    }

    public void calificar() {
        System.out.println(nombre + " esta calificando tareas.");
    }
}
