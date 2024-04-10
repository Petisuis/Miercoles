package Aeropuerto;

public class GestionAviones {

    private Avion[] aviones;
    private int numAvionesRegistrados;

    public GestionAviones(int capacidadAviones) {
        aviones = new Avion[capacidadAviones];
        numAvionesRegistrados = 0;
    }

    public void registrarAvion(Avion avion) {
        if (numAvionesRegistrados < aviones.length) {
            aviones[numAvionesRegistrados++] = avion;
        } else {
            System.out.println("Capacidad máxima de aviones alcanzada. No se pudo registrar el avión.");
        }
    }

    public void mostrarAviones() {
        for (int i = 0; i < numAvionesRegistrados; i++) {
            System.out.println(aviones[i].toString());
        }
    }

   
}
