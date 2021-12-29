
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Principal {

	public static void main(String[] args) throws IOException {
		
	
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i <3; i++) {
			
	 String horastr;
	 System.out.println("Introduzca la cantidad de horas");
	 horastr=bufferReader.readLine();
	 String sueldoPorHorastr;
	 System.out.println("Introduzca el sueldo por horas");
	 sueldoPorHorastr=bufferReader.readLine();
	
	
	 EmpleadoSinHorasExtras a = new EmpleadoSinHorasExtras();
	 EmpleadoConHorasDobles b = new  EmpleadoConHorasDobles();
	 EmpleadoConHorasTriples c = new EmpleadoConHorasTriples();
	 

	 int hora=Integer.parseInt(horastr);
	 double sueldoPorHora=Double.parseDouble(sueldoPorHorastr);
	 
	 if (hora<=40) {
		 a.setHorasTrabajadas(hora);
		 a.setSueldoPorHora(sueldoPorHora);
		System.out.println(a.calcularSalario());
	} else if (hora>40&&hora<=45) {
		b.setHorasTrabajadas(hora);
		 b.setSueldoPorHora(sueldoPorHora);
		 b.setHorasExtras(hora-40);
		System.out.println(b.calcularSalario());
	} else {
		c.setHorasTrabajadas(hora);
		 c.setSueldoPorHora(sueldoPorHora);
		 c.setHorasExtras(hora-40);
		System.out.println(c.calcularSalario());
	}
	
		}
	}

}
