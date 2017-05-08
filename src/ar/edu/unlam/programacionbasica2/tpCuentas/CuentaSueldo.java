package ar.edu.unlam.programacionbasica2.tpCuentas;

public class CuentaSueldo {
	protected Double saldo;

	public CuentaSueldo(Double saldo)
	{
		this.saldo = saldo;
	}
	
	public CuentaSueldo() {
		this.saldo = 0.00;
	}
	
	public Double getSaldo()
	{
		return this.saldo;
	}
	
	public void setSaldo(Double saldo)
	{
		this.saldo = saldo;
	}
	
	public Boolean extraerSaldo(Double saldo)
	{
		if (saldo > this.saldo) {
			return false;
		}
		this.saldo-=saldo;
		return true;
	}
}