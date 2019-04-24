package ar.edu.unlam.pb2.DiscoTest;

import org.junit.Assert;
import org.junit.Test;
import ar.edu.unlam.pb2.Disco.Disco;

public class DiscoTest {
	@Test
	public void TestPerimetroInterior() {
		Double radioInterior = 2.0;
		Double radioExterior = 4.0;
		Disco miDisco = new Disco(radioInterior, radioExterior);
		Double valorEsperado = 12.56;

		Assert.assertEquals(valorEsperado, miDisco.calcularPerimetroInterior(), 0.01);
	}

	@Test
	public void TestPerimetroExterior() {
		Double radioInterior = 2.0;
		Double radioExterior = 4.0;
		Disco miDisco = new Disco(radioInterior, radioExterior);
		Double valorEsperado = 25.12;

		Assert.assertEquals(valorEsperado, miDisco.calcularPerimetroExterior(), 0.1);
	}

	@Test
	public void TestSuperficie() {
		Double radioInterior = 2.0;
		Double radioExterior = 4.0;
		Disco miDisco = new Disco(radioInterior, radioExterior);
		Double valorEsperado = 37.69;

		Assert.assertEquals(valorEsperado, miDisco.calcularSuperficie(), 0.01);
	}
}
