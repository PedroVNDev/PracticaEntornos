package controlador;

import vista.Formulario;

public class PracticaEntornos {

	public static void main(String[] args) {

		Formulario f = new Formulario();
		/**
		 * Pide al usuario introducir datos de un Camion y los muestra
		 */
		f.camiones();

		System.out.println("\n");
		/**
		 * Pide al usuario introducir datos de una Moto y los muestra
		 */
		f.motos();

		System.out.println("\n");
		/**
		 * Pide al usuario introducir datos de un Autobus y los muestra
		 */
		f.autobuses();

		System.out.println("\n");
		/**
		 * Pide al usuario introducir datos de un Coche y los muestra
		 */
		f.coches();
	}
}
