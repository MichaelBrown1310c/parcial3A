package parcialTres_1;

//La palabra reservada extends indica a la clase hija cual va a ser su clase padre
public class naveTripulada extends naves {

	//se definen los atributos de la clase 
	private boolean tripulada;
	private int pasajeros;
	private String lugarEEUU;
	private String lugarRusia;
	private String lugarInternacional;
	private String lugarChina;

	public naveTripulada(String nombre, String tipodenave, String tipocombustible, int actUltimoAño, int pesonave,
			boolean tripulada, int pasajeros, String EEUU, String Rusia, String Internacional, String China) {
		
		//Super para llamar al constructor de la clase
		
		super(nombre, tipodenave, tipocombustible, actUltimoAño, pesonave);
		this.tripulada = tripulada;
		this.pasajeros = pasajeros;

	}

	public String laNave() {
		return nombre + " es un tipo de nave " + tipodenave + ".";
	}
	
	public boolean getTripulada() {

		return tripulada;

	}

	public int getPasajeros() {

		return pasajeros;

	}

	public String getLugarEEUU(){
		
		return lugarEEUU;
		
	}
	public String getLugarRusia(){
		
		return lugarRusia;
		
	}
	public String getLugarInternacional(){
		
		return lugarInternacional;
		
	}
	public String getLugarChina(){
		
		return lugarChina;
		
	}

}
