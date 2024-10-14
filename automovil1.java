
package ejercicio;


public class automovil1 {  
    
    String marca;
    String modelo;
    int año;

    
    public automovil1(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

   
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }

    public void arrancar() {
        System.out.println(marca + " " + modelo + " ha arrancado.");
    }


    public void acelerar(int velocidad) {
        System.out.println(marca + " esta acelerando a " + velocidad + " km/h.");
    }
    
}
