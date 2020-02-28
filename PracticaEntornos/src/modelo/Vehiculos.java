package modelo;

public abstract class Vehiculos {

	protected String marca;
	protected String modelo;
	protected String color;
	protected String tipocombustible;
	protected int cilindrada;
	protected int plazas;

	/**
	 * Muestra la marca del Vehiculo
	 * 
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Asigna la marca al Vehiculo
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Muestra el modelo del Vehiculo
	 * 
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Asigna el modelo al Vehiculo
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Muestra el color del Vehiculo
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Asigna el color al Vehiculo
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Muestra el tipo de combustible del Vehiculo
	 * 
	 * @return tipocombustible
	 */
	public String getTipocombustible() {
		return tipocombustible;
	}

	/**
	 * Asigna el tipo de combustible al Vehiculo
	 * 
	 * @param tipocombustible
	 */
	public void setTipocombustible(String tipocombustible) {
		this.tipocombustible = tipocombustible;
	}

	/**
	 * Muestra la cilindrada del Vehiculo
	 * 
	 * @return cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Asigna la cilindrada al Vehiculo
	 * 
	 * @param cilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * Muestra las plazas del Vehiculo
	 * 
	 * @return plazas
	 */
	public int getPlazas() {
		return plazas;
	}

	/**
	 * Asigna las plazas del Vehiculo
	 * 
	 * @param plazas
	 */
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	/**
	 * Variables que van a heredar las clases hijas de Vehiculos
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param tipocombustible
	 * @param cilindrada
	 * @param plazas
	 */
	public Vehiculos(String marca, String modelo, String color, String tipocombustible, int cilindrada, int plazas) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipocombustible = tipocombustible;
		this.cilindrada = cilindrada;
		this.plazas = plazas;
	}

	/**
	 * Enumerador que asigna un tipo de contaminacion ambiental al Vehiculo
	 * 
	 * @author pedro
	 *
	 */

	public enum ambiental {
		A, B, C, Eco, Zero;
	}
}
