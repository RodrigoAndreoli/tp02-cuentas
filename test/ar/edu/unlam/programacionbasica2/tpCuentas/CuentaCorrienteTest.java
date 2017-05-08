package ar.edu.unlam.programacionbasica2.tpCuentas;

import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void testCrearCuentaCorriente () {
		CuentaCorriente miCuenta = new CuentaCorriente (5000.00);
		Double valorObtenido = miCuenta.getSaldo();
		Double valorEsperado = 5000.00;
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testAlDescubierto () {
		CuentaCorriente miCuenta = new CuentaCorriente (5000.00);
		miCuenta.extraerSaldo(5020.00);
		Double valorObtenido = miCuenta.getSaldo();
		Double valorEsperado = -21.00;
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
