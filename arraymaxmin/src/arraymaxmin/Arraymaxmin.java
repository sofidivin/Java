package arraymaxmin;

import javax.swing.JOptionPane;

class Arraymaxmin {

	public static void main(String[] args) {
		double tot=0, max=-1, min=999999999;
		double[]s=new double[7];
		
		for (int i = 0; i <6; i++) {
			s[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese las ventas"));
			tot=tot+s[i];
			System.out.println("venta: " + s[i]);
			if (s[i]<min) {
				min=s[i];
			} else if (s[i]>max) {
				max=s[i];
			}
		}
		JOptionPane.showMessageDialog(null, "total ventas: " + tot + "\nventa máxima: " + max + "\nventa mínima " + min);

	}

}
