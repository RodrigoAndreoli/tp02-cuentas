package ar.edu.unlam.programacionbasica2.tpCuentas;

public class CajaDeAhorro extends CuentaSueldo {
	protected Integer cantExtracciones;
	final Double CARGO_POR_EXTRACCION = 6.00;
	
	public CajaDeAhorro(Double saldo)
		{
			super(saldo);
			this.cantExtracciones = 0;
		}
		
		@Override
		public Boolean extraerSaldo(Double saldo)
		{
			cantExtracciones ++;
			if (cantExtracciones == 5)
			{
				if (saldo > (this.saldo-CARGO_POR_EXTRACCION)) 
				{
					return false;
				} else 
				{
					this.saldo -= saldo + CARGO_POR_EXTRACCION;
					cantExtracciones = 0;
					return true;
				}
			} else 
			{
				if (saldo > this.saldo) 
				{
					return false;
				} else 
				{
					this.saldo -= saldo;
					return true;
				}
			}
		}
}