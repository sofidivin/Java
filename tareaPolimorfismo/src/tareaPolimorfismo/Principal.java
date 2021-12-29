package tareaPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Ahorros ca = new Ahorros(95, 500.25, "jaime", "25/11/2021", 2);
		
		System.out.println("total en la cuetna " + ca.saldo());
		
		ca.depositar(200);
		System.out.println("total en la cuetna " + ca.saldo());
		
		ca.depositar("2");
		
		ca.depositar("1");
		System.out.println("total en la cuetna " + ca.saldo());
		
		ca.retirar(250, "25/11/2021");
		System.out.println("total en la cuetna " + ca.saldo() + ca.toString());
		
		
		Cheques cc = new Cheques(1111, 955, "leandro", 2.0, 10.0);
		cc.valorComisionSaldoInsuficiente();
		
		System.out.println("total en la cuenta cheques " + cc.saldo() + cc.toString());

	}

}
