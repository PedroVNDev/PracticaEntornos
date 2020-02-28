package modelo;

public class Autobus extends Vehiculos {

	public Autobus(String marca, String modelo, String color, String tipocombustible, int cilindrada, int plazas) {
		super(marca, modelo, color, tipocombustible, cilindrada, plazas);

	}

	/**
	 * Enumerador que asigna a un Autobus si es Publico o Privado
	 * 
	 * @author pedro
	 *
	 */
	public enum publicoprivado {
		Publico, Privado;
	}

	/**
	 * Enumerador que asigna a un Autobus si es Articulado o no Articulado
	 * 
	 * @author pedro
	 *
	 */
	public enum articuladonoarticulado {
		Articulado, Noarticulado;
	}

	/**
	 * Enumerador que asigna a un Autobus si es Urbano o Interurbano
	 * 
	 * @author pedro
	 *
	 */
	public enum urbanointerurbano {
		Urbano, Interurbano;
	}

}