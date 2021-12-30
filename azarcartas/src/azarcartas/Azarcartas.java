package azarcartas;

import javax.swing.JOptionPane;

class Azarcartas {

	public static void main(String[] args) {
		int c1n, c1p, c2n, c2p;
		
		JOptionPane.showMessageDialog(null, "generando cartas...");
		c1p=(int)(Math.random()*4);
		JOptionPane.showMessageDialog(null, "palo de carta 1: " + c1p);
		c1n=(int)(Math.random()*12+1);
		JOptionPane.showMessageDialog(null, "número de carta 1: " + c1n);
		c2p=(int)(Math.random()*4);
		JOptionPane.showMessageDialog(null, "palo de carta 2: " + c2p);
		c2n=(int)(Math.random()*12+1);
		JOptionPane.showMessageDialog(null, "número de carta 2: " + c2n);
		
		if (c1p==3&&c1n==1||c2p==3&&c2n==1) {
			JOptionPane.showMessageDialog(null, "ganaste 75 puntos");
		} else if (c1p==2&&c1n==7||c2p==2&&c2n==7) {
			JOptionPane.showMessageDialog(null, "ganaste 50 puntos");
		} else if (c1n==c2n) {
			JOptionPane.showMessageDialog(null, "ganaste 30 puntos");
		} else {
			JOptionPane.showMessageDialog(null, "no ganaste nada");
		}

	}

}
