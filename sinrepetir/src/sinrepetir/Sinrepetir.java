package sinrepetir;

class Sinrepetir {

	public static void main(String[] args) {
		int [] num= new int [10]; //array n�meros
		int [] todos= new int [50]; //array todos los n�meros
		boolean fueusado=false;
		int n, cant=0;
		
		for (int i = 0; i <=9; i++) { //completando el array
			fueusado=false;
			n=(int)(Math.random()*25+1); //genero los n�meros al azar
			todos[cant]=n; //guardo el n�mero, porque los 50 num toman se guardan en la cantidad que genera la variable n
			cant++;
		
		for (int j = 0; j <=i; j++) {
			if (num[i]==n) {
				fueusado=true; //ya est� ese n�mero
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
