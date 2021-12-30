package num;

import javax.swing.JOptionPane;

class Num {

	public static void main(String[] args) {
		int c1,c2,c3;
		c1=(int)(Math.random()*12+1);
		c2=(int)(Math.random()*12+1);
		c3=(int)(Math.random()*12+1);
		
		JOptionPane.showMessageDialog(null, "carta1: "+c1+"\ncarta2: "+c2+"\ncarta3: "+c3);
		
		if (c1>=10 && c2>=10 && c3>=10) {
			JOptionPane.showMessageDialog(null, "las 3 cartas son 10 o mas");
			if (c1==c2 || c1==c3 || c2==c3) {
				JOptionPane.showMessageDialog(null, "hay dos cartas iguales");
			} else {
				JOptionPane.showMessageDialog(null, "No hay cartas iguales ni mayores o iguales a 10");
			}
		} else if (c1==c2 || c1==c3 || c2==c3) {
			JOptionPane.showMessageDialog(null, "hay dos cartas iguales");
			if (c1 == 1 || c2 == 1 || c3 == 1) {
				JOptionPane.showMessageDialog(null, "hay un as");
			} else {
				JOptionPane.showMessageDialog(null, "No hay un as");
			}
		} else if (c1 == 1 || c2 == 1 || c3 == 1) {
			JOptionPane.showMessageDialog(null, "hay un as");
		} else {
			JOptionPane.showMessageDialog(null, "No se cumplen ninguna de las condiciones");
		}
		

	}

}
