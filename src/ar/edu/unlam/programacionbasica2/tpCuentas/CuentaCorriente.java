package ar.edu.unlam.programacionbasica2.tpCuentas;

public class CuentaCorriente extends CajaDeAhorro{
	protected Double alDescubierto;
	final Double DESCUBIERTO = 150.00;
	final Double CARGO_DESCUBIERTO = 5.00;
	
	public CuentaCorriente (Double monto) {
		super(monto);
		alDescubierto = 0.00;
	}
	
	public void extraerMonto (Double monto) {
		super.extraerMonto(monto);
		if (monto > this.saldo) {
			alDescubierto = (monto - this.saldo);
			alDescubierto *= (100 + CARGO_DESCUBIERTO) / 100;
		}
		if (alDescubierto > this.DESCUBIERTO) {
			return;
		} else {
			this.saldo = - alDescubierto;
		}
	}
}