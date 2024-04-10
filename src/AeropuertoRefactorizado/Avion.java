package AeropuertoRefactorizado;

public class Avion {
	private String modelo;
    private int capacidadPasajeros;
    private double alcance; // kilometers
    private String mantenimiento;
    private String combustible;
    private boolean despegar;
    private Aeropuerto aeropuerto;
    private String marca;
	private String tipo;

    public Avion(String modelo, int capacidadPasajeros, double alcance,
    		String mantenimiento, String combustible,int puertaDeEmbarco, int numeroDeAngar, int pistaDeSalida,String marca,String tipo) {
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.alcance = alcance;
        this.mantenimiento = mantenimiento;
        this.combustible = combustible;
        this.aeropuerto = new Aeropuerto(puertaDeEmbarco, numeroDeAngar, pistaDeSalida); 	
        this.marca=marca;
        this.tipo=tipo;
        
        /**
    	 * Para obtener las variables de la clase aeropuerto 
    	 */
    }

    public String getTipo() {
		return tipo;
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
	
	/**
	 * Método para determinar si un avión puede despegar o no en función de si está lleno de combustible y si ha sido reparado
	 * @return Si puede despegar devolvera verdadero, si no, falso
	 */
	public boolean isDespegar() {
		
		if(getMantenimiento().equalsIgnoreCase("reparado") || getCombustible().equalsIgnoreCase("lleno")){
			
			return true;

		}else {
			
			return false;
		}
		
		
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private boolean isTipo() {
		
		if(getTipo().equalsIgnoreCase("reparado") || getCombustible().equalsIgnoreCase("lleno")){
			
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
        return "Modelo: " + modelo + ", Capacidad: " + capacidadPasajeros + ", Alcance: " + alcance + " km" + " mantenimiento: " + mantenimiento
        		+ " combuestible: " + combustible + "\n Se encuentra en la puerta de embarco " + aeropuerto.getPuertaDeEmbarco() +", está en el angar " +  aeropuerto.getNumeroDeAngar() + " y saldrá por la pista " + aeropuerto.getPistaDeSalida() + "." + (isDespegar() ?"\npuede despegar" : "\nno puede despegar")+ " de marca "+marca+(isTipo()?"Es privado":"Es publico") ;
    }

	
    // ... (métodos adicionales)
}

