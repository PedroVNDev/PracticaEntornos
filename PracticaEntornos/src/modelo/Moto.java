package modelo;

public class Moto extends Vehiculos {

	private int numeroruedas;

	public Moto(String marca, String modelo, String color, String tipocombustible, int cilindrada, int plazas,
			int numeroruedas) {
		super(marca, modelo, color, tipocombustible, cilindrada, plazas);
		this.numeroruedas = numeroruedas;
	}

	/**
	 * Muestra el numero de ruedas de la Moto
	 * 
	 * @return
	 */
	public int getNumeroruedas() {
		return numeroruedas;
	}

	/**
	 * Asigna un numero de ruedas a la Moto
	 * 
	 * @param numeroruedas
	 */
	public void setNumeroruedas(int numeroruedas) {
		this.numeroruedas = numeroruedas;
	}

	/**
	 * Enumerador que asigna el tipo de la Moto a una Moto
	 * 
	 * @author pedro
	 *
	 */
	public enum tipomoto {
		Custom, Deportiva, Quad;
	}
}
