package AeropuertoRefactorizado;

public class pruebaAvion {

    public static void main(String[] args) {
    	/**
    	 * Se crean dos objetos Avion y se imprimen sus datos
    	 * Se modifica la capacidad de pasajeros
    	 */
    	Aeropuerto aeropuerto = new Aeropuerto(10, 20, 30);
        // Crear un objeto Avion
        Avion avion1 = new Avion("Boeing 747", 400, 10000.0," no reparado","mitad", 2,4,3,"Iberia","Es privado");
        Avion avion2 = new Avion("Septiembre 11", 200, 5000.0,"reparado","mitad", 5,3,1,"Iberia","Es publico");

        // Imprimir información del avión
        System.out.println(avion1.toString());
        System.out.println(avion2.toString());

        // Modificar la capacidad de pasajeros
        avion1.setCapacidadPasajeros(500);
        avion2.setCapacidadPasajeros(300);
    }
}






