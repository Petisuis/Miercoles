package Aeropuerto;

public class AvionIberia extends Avion{
	
	private String marca;
	private boolean tipo;
	
	
	public AvionIberia(String modelo, int capacidadPasajeros, double alcance,
    		String mantenimiento, String combustible, int puertaDeEmbarco, int numeroDeAngar, int pistaDeSalida,String marca,boolean tipo) {
		super(modelo,capacidadPasajeros,alcance,mantenimiento,combustible,puertaDeEmbarco,numeroDeAngar,pistaDeSalida);		
		this.marca=marca;
		this.tipo=tipo;
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	public String toString() {
		
		return super.toString()+" de marca "+marca+(isTipo()?"Es privado":"Es publico");
	}
}
