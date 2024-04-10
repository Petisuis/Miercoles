package Aeropuerto;


public class Avion {

    protected String modelo;
    protected int capacidadPasajeros;
    protected double alcance; // kilometers
    protected String mantenimiento;
    protected String combustible;
    protected boolean despegar;
    protected int puertaDeEmbarco;
    protected int numeroDeAngar;
    protected int pistaDeSalida;
    

    public Avion(String modelo, int capacidadPasajeros, double alcance,
    		String mantenimiento, String combustible, int puertaDeEmbarco, int numeroDeAngar, int pistaDeSalida) {
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.alcance = alcance;
        this.mantenimiento = mantenimiento;
        this.combustible = combustible;
        this.puertaDeEmbarco = puertaDeEmbarco;
        this.numeroDeAngar = numeroDeAngar;
        this.pistaDeSalida = pistaDeSalida;
    }
    
    // Getters and setters for properties
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getAlcance() {
        return alcance;
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

	public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public String getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(String mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public boolean isDespegar() {
		
		if(getMantenimiento().equalsIgnoreCase("reparado")){
			
			return true;
		}
		if(getCombustible().equalsIgnoreCase("lleno")) {
			
			return true;
		}else {
			
			return false;
		}
		
	}
	public void setDespegar(boolean despegar) {
		this.despegar = despegar;
	}
	
	@Override
    public String toString() {
        return "Modelo: " + modelo + ", Capacidad: " + capacidadPasajeros + ", Alcance: " + alcance + " km" + "\nmantenimiento: " + mantenimiento
        		+ " combuestible: " + combustible + " " + (isDespegar() ?"puede despegar" : "no puede despegar")
        				+ " \npuerta de embarco: " + puertaDeEmbarco + " numero de angar: " + numeroDeAngar + " pista de salida: " + pistaDeSalida;
    }

    // ... (métodos adicionales)
}



