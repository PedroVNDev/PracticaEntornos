package modelo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testJUnit() {

		System.out.print("Introduce una marca: ");
		Scanner teclado = new Scanner(System.in);
		Camion c = new Camion(null, null, null, null, 0, 0, 0, 0);

		c.setMarca(teclado.nextLine());
		String esperado = "Toyota";

		assertEquals(esperado, c.getMarca());
	}

}
