package parcialTres_1;

public abstract class naves {

	//protected hace que el campo sea visible en esta clase que es en la que se define y en sus subclases 
	// se definen los atributos de la clase en protected
	protected String nombre;
	protected String tipodenave;
	protected String tipocombustible;
	protected int actUltimoAño;
	protected int pesonave;

	public naves(String nombre, String tipodenave, String tipocombustible, int actUltimoAño, int pesonave ) {
		this.nombre = nombre;
		this.tipodenave = tipodenave;
		this.tipocombustible = tipocombustible;
		this.actUltimoAño = actUltimoAño;
		this.pesonave = pesonave;
	}
	
	
	public abstract String laNave();
	
	// constructor, getter y setter

	public String getNombre() {
		return nombre;
		
	}

	public String getTipodenave() {
		
		return tipodenave;
		
	}
	public String getcombustible() {
		
		return tipocombustible;
		
	}
	public int getactUltimoAño() {
		
		return actUltimoAño;
		
	}
	public int getPeso() {
		
		return pesonave;
		
	}
}
	

