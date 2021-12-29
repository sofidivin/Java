package tareaPolimorfismo;

public class Banco {

	private int numeroDeCuenta;
	private double saldo;
	private String nombreCliente;
	
	public Banco() {
		
	}
	
	public Banco(int numeroDeCuenta, double saldo, String nombreCliente) {
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
		this.nombreCliente = nombreCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
    //To string
	@Override
	public String toString() {
		return "Banco [numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + ", nombreCliente=" + nombreCliente
				+ "]";
	}
	
	public double saldo() { //consultar o enviar
		return saldo;
	}
	
	public void depositar (double deposito) {
		saldo=saldo+deposito; //acumulador
		
	}
	
	public void retirar (double cantidad) {
		if (saldo>cantidad) {
			System.out.println("retiro exitoso");
			saldo=saldo-cantidad;
		} else {
			System.out.println("saldo insuficiente");
		}
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		if (nombreCliente == null) {
			if (other.nombreCliente != null)
				return false;
		} else if (!nombreCliente.equals(other.nombreCliente))
			return false;
		if (numeroDeCuenta != other.numeroDeCuenta)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	
	
	
	
	
	
}
