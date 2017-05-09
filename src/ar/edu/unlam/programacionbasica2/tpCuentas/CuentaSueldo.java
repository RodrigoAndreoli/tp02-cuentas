package ar.edu.unlam.programacionbasica2.tpCuentas;

public class CuentaSueldo {
	protected Double saldo;

	public CuentaSueldo (Double monto) {
		this.saldo = monto;
	}
	
	public CuentaSueldo () {
		this.saldo = 0.00;
	}
	
	public Double getSaldo () {
		return this.saldo;
	}
	
	public void setSaldo (Double monto) {
		this.saldo = monto;
	}
	
	public void extraerMonto (Double monto) {
		if (monto <= this.saldo) {
			this.saldo -= monto;
		}
	}
}