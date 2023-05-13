package parcialTres_1;

//La palabra reservada extends indica a la clase hija cual va a ser su clase padre
public class vehiculosLanzadera extends naves {

	private int toneladasTransporte;
	private String lugarEEUU;
	private String lugarRusiaUcrania;
	private String lugarEuropa;
	private String lugarJapon;
	private String lugarChina;

	public vehiculosLanzadera(String nombre, String tipodenave, String tipocombustible, int actUltimoAño, int pesonave,
			int toneladasTransporte) {

		// Super para llamar al constructor de la clase

		super(nombre, tipodenave, tipocombustible, actUltimoAño, pesonave);
		this.toneladasTransporte = toneladasTransporte;
	}

	//metodo abstract
	public String laNave() {
		return nombre + " es un tipo de nave " + tipodenave + ".";
	}

	//metodos getter 
	
	public int getToneladasTransporte() {

		return toneladasTransporte;
	}

	public String getLugarEEUU() {

		return lugarEEUU;

	}

	public String getLugarRusiaUcrania() {

		return lugarRusiaUcrania;

	}

	public String getLugarJapon() {

		return lugarJapon;

	}

	public String getLugarChina() {

		return lugarChina;

	}

	public String getLugarEuropa() {

		return lugarEuropa;

	}

}
