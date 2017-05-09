package ar.edu.unlam.programacionbasica2.tpCuentas;

public class CajaDeAhorro extends CuentaSueldo {
	protected Integer cantExtracciones;
	final Double CARGO_EXTRACCION = 6.00;
	
	public CajaDeAhorro (Double monto) {
			super(monto);
			this.cantExtracciones = 0;
		}
	
	public void extraerMonto (Double monto) {
		this.cantExtracciones ++;
		if (this.cantExtracciones == 5) {
			monto += this.CARGO_EXTRACCION;
		}
		super.extraerMonto(monto);
	}
}