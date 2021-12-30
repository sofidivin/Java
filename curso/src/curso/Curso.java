package curso;

import javax.swing.JOptionPane;

class Curso {

	public static void main(String[] args) {
		int gan=0, segun = 0, per = 0;
		double [] c =new double [10];
		double t=0, m=0, min=9999, min1=9999, max=0;
		
		for (int i = 0; i <c.length; i++) {
			c[i]=(Math.random()*11);
			t=t+c[i];
			System.out.println("jugador: " + (i+1) + " tiempo: " + c[i]);
		}
		
		for (int i = 0; i <c.length; i++) {
			if (c[i]<min) {
				min=c[i];
				gan=i+1;
			}
			if (c[i]>max) {
				max=c[i];
				per=i+1;
			}
		}
		
		for (int i = 0; i <9; i++) {
			if (c[i]<min1&&c[i]!=min) {
				min1=c[i];
				segun=i+1;
			}
		}
		
		m=t/10;
		JOptionPane.showMessageDialog(null, "puesto 1 jugador: " + gan + " tiempo: " + min + "\npuesto 2 jugador: " + segun + " tiempo: " + min1 + "\núltimo puesto jugador: " + per + " tiempo: " + max + "\nmedia de tiempo en carrera: " + m);
	}
 
}
