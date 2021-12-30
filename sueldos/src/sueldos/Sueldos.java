package sueldos;

import javax.swing.JOptionPane;

class Sueldos {

	public static void main(String[] args) {
		double [] sueldos= new double[10];
		double tot=0;
		
		for (int i = 0; i <=9; i++) {
			sueldos[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese sueldo"));
			tot=tot+sueldos[i];
			System.out.println("sueldo " + sueldos[i]);
		}
		JOptionPane.showMessageDialog(null,"total sueldos pagados " + tot);

	}

}
