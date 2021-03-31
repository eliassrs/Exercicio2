package java2;

public class Main {

	public static void main(String[] args) {
		Main java2 = new Main();
		java2.iniciar();

	}

	private void iniciar() {
		double valor = 22.22222;

		System.out.println("o valor do produto é " + valor + "");
		System.out.format("o valor do produto é %.2f", valor);
		System.out.println();
		int intValue = (int) valor;
		System.out.println("o valor do produto é " + intValue);
		
		int num = 10;
		System.out.println("novo " + num +"");
		double d = num;
		System.out.println("convertido " + d + "");
		int intvalue = (int) num;
		System.out.println("novo valor " + num + "");
		
		
	}

}
