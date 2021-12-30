package programa;

import javax.swing.JOptionPane;

class Programa {

	public static void main(String[] args) {
		int tot=0, c36=0, c50=0;
		int [] num = new int [8];
		
		for (int i = 0; i <=7; i++) {
			num[i]=(int)(Math.random()*100);
			System.out.println("numero " + i + num[i]);
		tot=tot + num[i];
		 if (num[i]==36) {
			c36++;
		} else if (num[i]>50) {
			c50++;

		} else {
			//no hay nada
		}
		JOptionPane.showMessageDialog(null,  "suma: "+tot+ "cant=36: "+c36+"cantidad > 50: "+c50);
		 
		 

	}

}
}
