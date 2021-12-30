package medico;

import javax.swing.JOptionPane;

class Medico1 {

	public static void main(String[] args) {
		int d;
		double cp;
		String e;
		
		e=JOptionPane.showInputDialog("Ingrese el tipo de enfermedad del paciente: \nA \nB \nC \nD \nE \nF \nG");
		d=(Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de días de internación")));
		
		if (e.equalsIgnoreCase("A")||e.equalsIgnoreCase("D")&&(d>20)) {
			cp=250*d/0.5;
		} else if (e.equalsIgnoreCase("A")||e.equalsIgnoreCase("D")&&(d<=20)) {
			cp=250*d;
		} else if (e.equalsIgnoreCase("C")||e.equalsIgnoreCase("G")&&(d>15)) {
			cp=200*d/0.2;
		} else if (e.equalsIgnoreCase("C")||e.equalsIgnoreCase("G")&&(d<=15)) {
			cp=200*d;
		} else if (e.equalsIgnoreCase("B")||e.equalsIgnoreCase("E")) {
			cp=160*d;
		} else {
			cp=320*d;
		}
		
		JOptionPane.showMessageDialog(null, "de acuerdo al tipo de enfermedad " + e + " el costo total por paciente es: " + cp);

	}

}
