
package ejercicio;


public class main {
     public static void main(String[] args){
         automovil1 carro1 = new automovil1 ("batimovil", "batman3", 2070);
        automovil1 carro2 = new automovil1 ("papamovil", "chevrolet", 2001);

      
        carro1.mostrarDetalles();
        carro1.arrancar();
        carro1.acelerar(80);

        carro2.mostrarDetalles();
        carro2.arrancar();
        carro2.acelerar(100);
     }
    
}
