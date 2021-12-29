
public class EmpleadoSinHorasExtras extends Empleado{

	public EmpleadoSinHorasExtras() {
		super();
	}
	
	public EmpleadoSinHorasExtras(int horasTrabajadas, double sueldoPorHora) {
		super(horasTrabajadas, sueldoPorHora);
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario();
	}
}
