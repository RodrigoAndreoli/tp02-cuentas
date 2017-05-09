package ar.edu.unlam.programacionbasica2.tpCuentas;

import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {
	
	@Test
	public void testDeCuentaSaldo () {
		CuentaSueldo cuenta1 = new CuentaSueldo ();
		cuenta1.setSaldo(10.00);
		cuenta1.extraerMonto(10.00);
		Double valorEsperado = 0.00;
		Double valorObtenido = cuenta1.getSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
}