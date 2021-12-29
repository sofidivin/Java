
public abstract class Empleado {

	 int horasTrabajadas;
	 double sueldoPorHora;
	
	public Empleado() {
		
	}
	
	public Empleado(int horasTrabajadas, double sueldoPorHora) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoPorHora = sueldoPorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}
	
	public double calcularSalario() {
		return sueldoPorHora*horasTrabajadas;
	}
	
}
