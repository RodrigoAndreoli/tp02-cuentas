package ar.edu.unlam.programacionbasica2.tpCuentas;

import org.junit.Assert;
import org.junit.Test;

public class CajaDeAhorroTest {
	
	@Test
	public void testDeCajaDeAhorro () {
		CajaDeAhorro miCaja = new CajaDeAhorro(500.00);
		miCaja.extraerMonto(10.00);
		miCaja.extraerMonto(10.00);
		miCaja.extraerMonto(10.00);
		miCaja.extraerMonto(10.00);
		miCaja.extraerMonto(10.00);
		Double valorEsperado = 444.00;
		Double valorObtenido = miCaja.getSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
