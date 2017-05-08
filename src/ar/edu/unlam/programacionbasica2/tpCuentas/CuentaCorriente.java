package com.edu.unlam.programacionbasica2.tpcuentas;

public class CuentaCorriente extends CajaDeAhorro{
	private Integer cantExtracciones;
	final Double CARGO_POR_EXTRACCION = 0.00;
	public CuentaCorriente()
	{
		super();
		this.cantExtracciones = 1;
	}
	
	@Override
	public Boolean extraerSaldo(Double saldo)
	{
		if (cantExtracciones == 5){
			if (saldo > (this.saldo-CARGO_POR_EXTRACCION))
				return false;
		} else{
			this.saldo -= CARGO_POR_EXTRACCION;
			this.saldo -= saldo;
			cantExtracciones = 0;
			return true;
		}
		
		if (saldo > this.saldo)
			return false;
		else{
			this.saldo -= saldo;
			cantExtracciones++;
			return true;
			}
	}
}
