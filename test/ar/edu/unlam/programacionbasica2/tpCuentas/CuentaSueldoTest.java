package ar.edu.unlam.programacionbasica2.tpCuentas;

import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {
	
	@Test
	public void testDeCuentaSaldo () {
		CuentaSueldo cuenta1 = new CuentaSueldo ();
		cuenta1.setSaldo(10.00);
		Boolean valorEsperado = true;
		Boolean valorObtenido = cuenta1.extraerSaldo(10.00);
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
}
