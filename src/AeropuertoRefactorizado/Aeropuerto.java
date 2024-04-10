package Entornos;

public class Aeropuerto {
	/**
	 * Esta clase se ha extraido con variables de la clase avion para tener una más clara organización
	 */
	protected int puertaDeEmbarco;
	protected int numeroDeAngar;
	protected int pistaDeSalida;
	
	public Aeropuerto(int puertaDeEmbarco, int numeroDeAngar, int pistaDeSalida) {
		this.puertaDeEmbarco = puertaDeEmbarco;
		this.numeroDeAngar = numeroDeAngar;
		this.pistaDeSalida = pistaDeSalida;
	}
	
	public int obtenerPuertaDeEmbarco() {
		return this.puertaDeEmbarco;
	}
	public int obtenerNumeroDeAngar() {
		return this.numeroDeAngar;
	}
	public int obtenerPistaDeSalida() {
		return this.pistaDeSalida;
	}
	
	 public int getPuertaDeEmbarco() {
			return puertaDeEmbarco;
		}

		public void setPuertaDeEmbarco(int puertaDeEmbarco) {
			this.puertaDeEmbarco = puertaDeEmbarco;
		}

		public int getNumeroDeAngar() {
			return numeroDeAngar;
		}

		public void setNumeroDeAngar(int numeroDeAngar) {
			this.numeroDeAngar = numeroDeAngar;
		}

		public int getPistaDeSalida() {
			return pistaDeSalida;
		}

		public void setPistaDeSalida(int pistaDeSalida) {
			this.pistaDeSalida = pistaDeSalida;
		}

}
