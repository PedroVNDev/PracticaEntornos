package vista;

import java.util.Scanner;
import modelo.Autobus;
import modelo.Autobus.articuladonoarticulado;
import modelo.Autobus.publicoprivado;
import modelo.Autobus.urbanointerurbano;
import modelo.Camion;
import modelo.Coche;
import modelo.Coche.descapotable;
import modelo.Moto;
import modelo.Moto.tipomoto;
import modelo.Vehiculos.ambiental;

public class Formulario {

	/**
	 * Pide datos de 1 Camion al usuario y devuelve todos los datos introducidos por
	 * este
	 * 
	 * @return
	 */
	public Camion camiones() {

		Scanner teclado = new Scanner(System.in);

		Camion c = new Camion(null, null, null, null, 0, 0, 0, 0);

		System.out.print("Marca del camion: ");
		c.setMarca(teclado.nextLine());
		System.out.print("Modelo del camion: ");
		c.setModelo(teclado.nextLine());
		System.out.print("Color del camion: ");
		c.setColor(teclado.nextLine());
		System.out.print("Combustible del camion: ");
		c.setTipocombustible(teclado.nextLine());
		System.out.print("Cilindrada del camion: ");
		c.setCilindrada(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Plazas del camion: ");
		c.setPlazas(teclado.nextInt());
		teclado.nextLine();

		System.out.println("1. C");
		System.out.println("2. B");
		System.out.println("3. A");
		System.out.println("4. Eco");
		System.out.println("5. Zero");
		System.out.print("Categoria Ambiental: ");

		int opcion = 0;
		opcion = teclado.nextInt();

		switch (opcion) {

		case 1:
			ambiental C = ambiental.C;
		case 2:
			ambiental B = ambiental.B;
		case 3:
			ambiental A = ambiental.A;
		case 4:
			ambiental Eco = ambiental.Eco;
		case 5:
			ambiental Zero = ambiental.Zero;
		}

		System.out.print("Tara del camion: ");
		c.setTara(teclado.nextFloat());
		teclado.nextLine();
		System.out.print("Galibo del camion: ");
		c.setGalibo(teclado.nextFloat());
		teclado.nextLine();

		System.out.println("\n");

		System.out.println("Marca del camion: " + c.getMarca());
		System.out.println("Modelo del camion: " + c.getModelo());
		System.out.println("Color del camion: " + c.getColor());
		System.out.println("Combustible del camion: " + c.getTipocombustible());
		System.out.println("Cilindrada del camion: " + c.getCilindrada());
		System.out.println("Plazas del camion: " + c.getPlazas());

		if (opcion == 1) {
			System.out.println("Categoria Ambiental: " + ambiental.C);
		} else if (opcion == 2) {
			System.out.println("Categoria Ambiental: " + ambiental.B);
		} else if (opcion == 3) {
			System.out.println("Categoria Ambiental: " + ambiental.A);
		} else if (opcion == 4) {
			System.out.println("Categoria Ambiental: " + ambiental.Eco);
		} else if (opcion == 5) {
			System.out.println("Categoria Ambiental: " + ambiental.Zero);
		}

		System.out.println("Categoria Ambiental: ");
		System.out.println("Tara del camion: " + c.getTara());
		System.out.println("Galibo del camion: " + c.getGalibo());

		return c;
	}

	/**
	 * Pide datos de una Moto al usuario y devuelve todos los datos introducidos por
	 * este
	 * 
	 * @return
	 */
	public Moto motos() {

		Moto m = new Moto(null, null, null, null, 0, 0, 0);

		Scanner teclado = new Scanner(System.in);

		System.out.print("Marca de la moto: ");
		m.setMarca(teclado.nextLine());
		System.out.print("Modelo de la moto: ");
		m.setModelo(teclado.nextLine());
		System.out.print("Color de la moto: ");
		m.setColor(teclado.nextLine());
		System.out.print("Combustible de la moto: ");
		m.setTipocombustible(teclado.nextLine());
		System.out.print("Cilindrada de la moto: ");
		m.setCilindrada(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Plazas de la moto: ");
		m.setPlazas(teclado.nextInt());
		teclado.nextLine();

		System.out.println("1. C");
		System.out.println("2. B");
		System.out.println("3. A");
		System.out.println("4. Eco");
		System.out.println("5. Zero");
		System.out.print("Categoria Ambiental: ");

		int opcion = 0;
		opcion = teclado.nextInt();

		switch (opcion) {

		case 1:
			ambiental C = ambiental.C;
		case 2:
			ambiental B = ambiental.B;
		case 3:
			ambiental A = ambiental.A;
		case 4:
			ambiental Eco = ambiental.Eco;
		case 5:
			ambiental Zero = ambiental.Zero;
		}

		System.out.println("1. Custom");
		System.out.println("2. Deportiva");
		System.out.println("3. Quad");
		System.out.print("Tipo de moto: ");

		int opcion2 = 2;
		opcion2 = teclado.nextInt();

		switch (opcion2) {

		case 1:
			tipomoto Custom = tipomoto.Custom;
		case 2:
			tipomoto Deportiva = tipomoto.Deportiva;
		case 3:
			tipomoto Quad = tipomoto.Quad;
		}

		teclado.nextLine();
		System.out.print("Ruedas de la moto: ");
		m.setNumeroruedas(teclado.nextInt());
		teclado.nextLine();

		System.out.println("\n");

		System.out.println("Marca de la moto: " + m.getMarca());
		System.out.println("Modelo de la moto: " + m.getModelo());
		System.out.println("Color de la moto: " + m.getColor());
		System.out.println("Combustible de la moto: " + m.getTipocombustible());
		System.out.println("Cilindrada de la moto: " + m.getCilindrada());
		System.out.println("Plazas de la moto: " + m.getPlazas());

		if (opcion == 1) {
			System.out.println("Categoria Ambiental: " + ambiental.C);
		} else if (opcion == 2) {
			System.out.println("Categoria Ambiental: " + ambiental.B);
		} else if (opcion == 3) {
			System.out.println("Categoria Ambiental: " + ambiental.A);
		} else if (opcion == 4) {
			System.out.println("Categoria Ambiental: " + ambiental.Eco);
		} else if (opcion == 5) {
			System.out.println("Categoria Ambiental: " + ambiental.Zero);
		}

		if (opcion2 == 1) {
			System.out.println("Tipo de la moto: " + tipomoto.Custom);
		} else if (opcion2 == 2) {
			System.out.println("Tipo de la moto: " + tipomoto.Deportiva);
		} else if (opcion2 == 3) {
			System.out.println("Tipo de la moto: " + tipomoto.Quad);
		}

		System.out.println("Ruedas de la moto: " + m.getNumeroruedas());

		return m;
	}

	/**
	 * Pide datos de un Autobus al usuario y devuelve todos los datos introducidos
	 * por este
	 * 
	 * @return
	 */
	public Autobus autobuses() {

		Scanner teclado = new Scanner(System.in);
		Autobus a = new Autobus(null, null, null, null, 0, 0);

		System.out.print("Marca del autobus: ");
		a.setMarca(teclado.nextLine());
		System.out.print("Modelo del autobus: ");
		a.setModelo(teclado.nextLine());
		System.out.print("Color del autobus: ");
		a.setColor(teclado.nextLine());
		System.out.print("Combustible del autobus: ");
		a.setTipocombustible(teclado.nextLine());
		System.out.print("Cilindrada del autobus: ");
		a.setCilindrada(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Plazas del autobus: ");
		a.setPlazas(teclado.nextInt());
		teclado.nextLine();

		System.out.println("1. C");
		System.out.println("2. B");
		System.out.println("3. A");
		System.out.println("4. Eco");
		System.out.println("5. Zero");
		System.out.print("Categoria Ambiental: ");

		int opcion = 0;
		opcion = teclado.nextInt();

		switch (opcion) {

		case 1:
			ambiental C = ambiental.C;
		case 2:
			ambiental B = ambiental.B;
		case 3:
			ambiental A = ambiental.A;
		case 4:
			ambiental Eco = ambiental.Eco;
		case 5:
			ambiental Zero = ambiental.Zero;
		}

		System.out.println("1. Publico");
		System.out.println("2. Privado");
		System.out.print("Publico o Privado: ");

		int opcion2 = 0;
		opcion2 = teclado.nextInt();

		switch (opcion2) {

		case 1:
			publicoprivado Publico = publicoprivado.Publico;
		case 2:
			publicoprivado Privado = publicoprivado.Privado;
		}

		System.out.println("1. Articulado");
		System.out.println("2. No Articulado");
		System.out.print("Articulado o No Articulado: ");

		int opcion3 = 0;
		opcion3 = teclado.nextInt();

		switch (opcion3) {

		case 1:
			articuladonoarticulado Articulado = articuladonoarticulado.Articulado;
		case 2:
			articuladonoarticulado Noarticulado = articuladonoarticulado.Noarticulado;
		}

		System.out.println("1. Urbano");
		System.out.println("2. InterUrbano");
		System.out.print("Urbano o InterUrbano: ");

		int opcion4 = 0;
		opcion4 = teclado.nextInt();

		switch (opcion4) {

		case 1:
			urbanointerurbano Urbano = urbanointerurbano.Urbano;
		case 2:
			urbanointerurbano Interurbano = urbanointerurbano.Interurbano;
		}

		System.out.println("\n");

		System.out.println("Marca de el autobus: " + a.getMarca());
		System.out.println("Modelo de el autobus: " + a.getModelo());
		System.out.println("Color de el autobus: " + a.getColor());
		System.out.println("Combustible de el autobus: " + a.getTipocombustible());
		System.out.println("Cilindrada de lel autobus: " + a.getCilindrada());
		System.out.println("Plazas de el autobus: " + a.getPlazas());

		if (opcion == 1) {
			System.out.println("Categoria Ambiental: " + ambiental.C);
		} else if (opcion == 2) {
			System.out.println("Categoria Ambiental: " + ambiental.B);
		} else if (opcion == 3) {
			System.out.println("Categoria Ambiental: " + ambiental.A);
		} else if (opcion == 4) {
			System.out.println("Categoria Ambiental: " + ambiental.Eco);
		} else if (opcion == 5) {
			System.out.println("Categoria Ambiental: " + ambiental.Zero);
		}

		if (opcion2 == 1) {
			System.out.println("Publico o Privado: " + publicoprivado.Publico);
		} else if (opcion2 == 2) {
			System.out.println("Publico o Privado: " + publicoprivado.Privado);
		}

		if (opcion3 == 1) {
			System.out.println("Articulado o no Articulado: " + articuladonoarticulado.Articulado);
		} else if (opcion2 == 2) {
			System.out.println("Articulado o no Articulado: " + articuladonoarticulado.Noarticulado);
		}

		if (opcion4 == 1) {
			System.out.println("Urbano o Interurbano: " + urbanointerurbano.Urbano);
		} else if (opcion2 == 2) {
			System.out.println("Urbano o Interurbano: " + urbanointerurbano.Interurbano);
		}

		return a;

	}

	/**
	 * Pide datos de un Coche al usuario y devuelve todos los datos introducidos por
	 * este
	 * 
	 * @return
	 */
	public Coche coches() {

		Scanner teclado = new Scanner(System.in);
		Coche car = new Coche(null, null, null, null, 0, 0, 0);

		System.out.print("Marca del coche: ");
		car.setMarca(teclado.nextLine());
		System.out.print("Modelo del coche: ");
		car.setModelo(teclado.nextLine());
		System.out.print("Color del coche: ");
		car.setColor(teclado.nextLine());
		System.out.print("Combustible del coche: ");
		car.setTipocombustible(teclado.nextLine());
		System.out.print("Cilindrada del coche: ");
		car.setCilindrada(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Plazas del coche: ");
		car.setPlazas(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Puertas del coche: ");
		car.setPuertas(teclado.nextInt());
		teclado.nextLine();

		System.out.println("1. C");
		System.out.println("2. B");
		System.out.println("3. A");
		System.out.println("4. Eco");
		System.out.println("5. Zero");
		System.out.print("Categoria Ambiental: ");

		int opcion = 0;
		opcion = teclado.nextInt();

		switch (opcion) {

		case 1:
			ambiental C = ambiental.C;
		case 2:
			ambiental B = ambiental.B;
		case 3:
			ambiental A = ambiental.A;
		case 4:
			ambiental Eco = ambiental.Eco;
		case 5:
			ambiental Zero = ambiental.Zero;
		}

		System.out.println("1. Si");
		System.out.println("2. No");
		System.out.print("¿Descapotable?: ");

		int opcion2 = 0;
		opcion2 = teclado.nextInt();

		switch (opcion) {

		case 1:
			descapotable Si = descapotable.Si;
		case 2:
			descapotable No = descapotable.No;
		}

		System.out.println("\n");

		System.out.println("Marca de el autobus: " + car.getMarca());
		System.out.println("Modelo de el autobus: " + car.getModelo());
		System.out.println("Color de el autobus: " + car.getColor());
		System.out.println("Combustible de el autobus: " + car.getTipocombustible());
		System.out.println("Cilindrada de lel autobus: " + car.getCilindrada());
		System.out.println("Plazas de el autobus: " + car.getPlazas());

		if (opcion == 1) {
			System.out.println("Categoria Ambiental: " + ambiental.C);
		} else if (opcion == 2) {
			System.out.println("Categoria Ambiental: " + ambiental.B);
		} else if (opcion == 3) {
			System.out.println("Categoria Ambiental: " + ambiental.A);
		} else if (opcion == 4) {
			System.out.println("Categoria Ambiental: " + ambiental.Eco);
		} else if (opcion == 5) {
			System.out.println("Categoria Ambiental: " + ambiental.Zero);
		}

		if (opcion2 == 1) {
			System.out.println("Descapotable: " + descapotable.Si);
		} else if (opcion2 == 2) {
			System.out.println("Publico o Privado: " + descapotable.No);
		}

		System.out.println("Puertas del coche: " + car.getPuertas());

		return car;
	}

}
