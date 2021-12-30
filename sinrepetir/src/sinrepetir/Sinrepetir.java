package sinrepetir;

class Sinrepetir {

	public static void main(String[] args) {
		int [] num= new int [10]; //array números
		int [] todos= new int [50]; //array todos los números
		boolean fueusado=false;
		int n, cant=0;
		
		for (int i = 0; i <=9; i++) { //completando el array
			fueusado=false;
			n=(int)(Math.random()*25+1); //genero los números al azar
			todos[cant]=n; //guardo el número, porque los 50 num toman se guardan en la cantidad que genera la variable n
			cant++;
		
		for (int j = 0; j <=i; j++) {
			if (num[i]==n) {
				fueusado=true; //ya está ese número
			}
		}
		
		if (fueusado==false) {
			num[i]=n; //guardo el num generado en la variable
		} else {
			i=i-1; //vuelvo a la misma posicion
		}
			
			
		}

	}

}
