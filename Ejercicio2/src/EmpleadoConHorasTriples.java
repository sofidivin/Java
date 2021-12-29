
public class EmpleadoConHorasTriples extends Empleado{

	int horasExtras;
	
	public EmpleadoConHorasTriples() {
		super();
	}

	public EmpleadoConHorasTriples(int horasTrabajadas, double sueldoPorHora, int horasExtras) {
		super(horasTrabajadas, sueldoPorHora);
		this.horasExtras = horasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	@Override
	public double calcularSalario() {
		return (super.sueldoPorHora*horasTrabajadas) + horasExtras*sueldoPorHora*3;
	}
	
}
