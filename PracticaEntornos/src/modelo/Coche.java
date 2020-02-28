package modelo;

public class Coche extends Vehiculos {

	private int puertas;

	public Coche(String marca, String modelo, String color, String tipocombustible, int cilindrada, int plazas,
			int puertas) {
		super(marca, modelo, color, tipocombustible, cilindrada, plazas);

		this.puertas = puertas;
	}

	/**
	 * Muestra el numero de puertas de el Coche
	 * 
	 * @return puertas
	 */
	public int getPuertas() {
		return puertas;
	}

	/**
	 * Asigna un numero de puertas al Coche
	 * 
	 * @param puertas
	 */
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	/**
	 * Enumerador que asigna a un Coche si es descapotable o no
	 * 
	 * @author pedro
	 *
	 */
	public enum descapotable {
		Si, No;
	}

}