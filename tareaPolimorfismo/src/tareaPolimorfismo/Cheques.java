package tareaPolimorfismo;

public class Cheques extends Banco{
	double comisionChequera;
	double comisionSaldoInsuficiente;
	
	public Cheques () {
		super();
	}
	
	public Cheques(int numeroDeCuenta, double saldo, String nombreCliente, double comisionChequera, double comisionSaldoInsuficiente) {
		super(numeroDeCuenta, saldo, nombreCliente);
		this.comisionChequera = comisionChequera;
		this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
	}

	public double getComisionChequera() {
		return comisionChequera;
	}

	public void setComisionChequera(double comisionChequera) {
		this.comisionChequera = comisionChequera;
	}

	public double getComisionSaldoInsuficiente() {
		return comisionSaldoInsuficiente;
	}

	public void setComisionSaldoInsuficiente(double comisionSaldoInsuficiente) {
		this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
	}
	
	
	public void valorComisionSaldoInsuficiente() {
		//double valor=0;
		//valor=comisionSaldoInsuficiente-super.saldo();
		super.retirar(comisionSaldoInsuficiente);
		//return valor;
	}
	
	
}
