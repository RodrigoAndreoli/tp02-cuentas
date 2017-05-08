package com.edu.unlam.programacionbasica2.tpcuentas;

public class CuentaSueldo {
	protected Double saldo;

	public CuentaSueldo()
	{
		this.saldo = 0.0;
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
		if (saldo > this.saldo)
			return false;
		
		this.saldo-=saldo;
		return true;
	}
}