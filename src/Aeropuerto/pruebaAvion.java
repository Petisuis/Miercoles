package Aeropuerto;

public class pruebaAvion {


	    public static void main(String[] args) {
	        // Crear un objeto Avion
	    	AvionIberia avion1 = new AvionIberia("Boeing 747", 400, 10000.0," no reparado","mitad",3,5,2,"Iberia",true);
	    	AvionIberia avion2 = new AvionIberia("Septiembre 11", 200, 5000.0,"reparado","mitad",1,4,3,"PepeVolando",false);

	        // Imprimir información del avión
	        System.out.println(avion1.toString());
	        System.out.println(avion2.toString());

	        // Modificar la capacidad de pasajeros
	        avion1.setCapacidadPasajeros(500);
	        avion2.setCapacidadPasajeros(300);
	    }
	}



