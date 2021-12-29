package tareaPolimorfismo;

public class Ahorros extends Banco{
	
	public String fechaDeVencimiento;
	public int porcentajeDeInteresMensual;
	
	public Ahorros () {
		super(); //heredo del constructor vacio de la clase padre
		
	}
	
	public Ahorros (int numeroDeCuenta, double saldo, String nombreCliente, String fechaDeVencimiento, int porcentajeDeInteresMensual) {
		super(numeroDeCuenta, saldo, nombreCliente); //heredo del constructor de la clase padre
		this.fechaDeVencimiento=fechaDeVencimiento;
		this.porcentajeDeInteresMensual=porcentajeDeInteresMensual;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public int getPorcentajeDeInteresMensual() {
		return porcentajeDeInteresMensual;
	}

	public void setPorcentajeDeInteresMensual(int porcentajeDeInteresMensual) {
		this.porcentajeDeInteresMensual = porcentajeDeInteresMensual;
	}
	
	//metodos
	//calculo valor del interes mensual
	//2%
	// valor interes mensual=(saldo*interes)/100
	
	public double calcularValorInteresMensual() {
		
		double valorInteresMensual;
		valorInteresMensual=(super.saldo()*porcentajeDeInteresMensual/12)/100;
		return valorInteresMensual;
	}
	
	public void retirar (double cantidad, String fechaRetiro) {
		if (fechaDeVencimiento==fechaRetiro) {
			System.out.println("retiro exitoso");
			super.retirar(cantidad);
		} else {
			System.out.println("no corresponde la fecha para el retiro");
		}
	}
	
	//metodo para insertar los intereses del primer dia de cada mes
	
	public void depositar(String dia) {
		if (dia == "1") {
			super.depositar(calcularValorInteresMensual()); //llamo al metodo de la clase padre y reutilizo el codigo
		} else {
			System.out.println("no corresponde la fecha del dia del 1er mes");
		}
	}
	
	

}
