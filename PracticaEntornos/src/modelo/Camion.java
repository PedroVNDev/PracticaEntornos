package modelo;

public class Camion extends Vehiculos {

	private float tara;
	private float galibo;

	public Camion(String marca, String modelo, String color, String tipocombustible, int cilindrada, int plazas,
			float tara, float galibo) {
		super(marca, modelo, color, tipocombustible, cilindrada, plazas);
		this.tara = tara;
		this.galibo = galibo;
	}

	/**
	 * Muestra la tara de un Camion
	 * @return
	 */
	public float getTara() {
		return tara;
	}

	/**
	 * Asigna la tara al Camion
	 * @param tara
	 */
	public void setTara(float tara) {
		this.tara = tara;
	}

	/**
	 * Muestra el galibo de un Camion
	 * @return
	 */
	public float getGalibo() {
		return galibo;
	}

	/**
	 * Asigna el galibo a un Camion
	 * 
	 * @param galibo
	 */
	public void setGalibo(float galibo) {
		this.galibo = galibo;
	}

}
