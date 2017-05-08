package ar.edu.unlam.programacionbasica2.tpCuentas;

public class CuentaCorriente extends CajaDeAhorro{
	protected Double alDescubierto;
	final Double DESCUBIERTO = 150.00;
	final Double CARGO_POR_DESCUBIERTO = 5.00;
	
	public CuentaCorriente (Double saldo) {
		super(saldo);
		alDescubierto = 0.00;
	}
	
	@Override
	public Boolean extraerSaldo(Double saldo) {
		if (this.saldo > saldo + this.CARGO_POR_EXTRACCION) {
			if (cantExtracciones == 5) {
				this.saldo -= saldo + this.CARGO_POR_EXTRACCION;
				cantExtracciones = 0;
				return true;
			} else {
				this.saldo -= saldo;
				cantExtracciones ++;
				return true;
			}
		}
		if (this.saldo < saldo) {
			alDescubierto = saldo-this.saldo;
			if (alDescubierto + (alDescubierto*this.CARGO_POR_DESCUBIERTO/100) > this.DESCUBIERTO) {
				return false;
			} else {
				alDescubierto += (alDescubierto*this.CARGO_POR_DESCUBIERTO/100);
				this.saldo = -alDescubierto; 
				return true;
			}
		}
		return false;
	}
}