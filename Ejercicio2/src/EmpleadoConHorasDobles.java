
public class EmpleadoConHorasDobles extends Empleado{

	int horasExtras;
	
	public EmpleadoConHorasDobles() {
		super();
	}

	public EmpleadoConHorasDobles(int horasTrabajadas, double sueldoPorHora, int horasExtras) {
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
		return (super.sueldoPorHora*horasTrabajadas) + horasExtras*sueldoPorHora*2;
	}
}
