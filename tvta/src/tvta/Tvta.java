package tvta;

import javax.swing.JOptionPane;

class Tvta {

	public static void main(String[] args) {
		int tvta;
		double pv, t;
		
		tvta=(int)(Math.random()*4);
		JOptionPane.showMessageDialog(null, "tipo de venta: " + tvta + " \n0=contado \n1=tarjeta de crédito \n2=cheque de 7 días \n3=cheque de 15 días");
		pv=Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio de la venta"));
		
		if (tvta==0&&pv>100&&pv<500||tvta==1&&pv>100&&pv<500) {
			t=pv-(pv*10/100);
			JOptionPane.showMessageDialog(null, "tiene un descuento del 10%");
			JOptionPane.showMessageDialog(null, "total a abonar " + t);
		} else if (tvta==0&&pv>500||tvta==1&&pv>500) {
			t=pv-(pv*15/100);
			JOptionPane.showMessageDialog(null, "tiene un descuento del 15%");
			JOptionPane.showMessageDialog(null, "total a abonar " + t);
		} else if (tvta==2&&pv<100||tvta==3&&pv<100) {
			t=pv+(pv*5/100);
			JOptionPane.showMessageDialog(null, "tiene un recargo del 5%");
			JOptionPane.showMessageDialog(null, "total a abonar " + t);
		} else if (tvta==2&&pv>100&&pv<500||tvta==3&&pv>100&&pv<500) {
			t=pv+(pv*7/100);
			JOptionPane.showMessageDialog(null, "tiene un recargo del 7%");
			JOptionPane.showMessageDialog(null, "total a abonar " + t);
		} else {
			t=pv;
			JOptionPane.showMessageDialog(null, "no tiene ningún descuento ni recargo");
			JOptionPane.showMessageDialog(null, "total a abonar " + t);
		}

	}

}
