package parcialTres_1;

//La palabra reservada extends indica a la clase hija cual va a ser su clase padre
public class naveNoTripulada extends naves {

	
	
	private boolean tripulada;
	private String planetasestudiados;
	private String lugarEEUU;
	private String lugarRusia;
	private String lugarEuropa;

	public naveNoTripulada(String nombre, String tipodenave, String tipocombustible, int actUltimoAño, int pesonave, boolean tripulada, String planetasestudiados) {
		
		//Super para llamar al constructor de la clase
		
		super(nombre, tipodenave, tipocombustible, actUltimoAño, pesonave);
		this.tripulada = tripulada;
		this.planetasestudiados = planetasestudiados;
	}
	
	public String laNave() {
		return nombre + " es un tipo de nave " + tipodenave + ".";
	}

	public boolean getTripulada() {

		return tripulada;

	}

	public String getPlanetasEstudiados() {

		return planetasestudiados;

	}
public String getLugarRusia(){
		
		return lugarRusia;
		
	}
public String getLugarEEUU(){
	
	return lugarEEUU;
	
}
public String getLugarEuropa(){
	
	return lugarEuropa;
	
}

}
