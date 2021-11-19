public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		
		try {  // o bloco try/catch sinaliza que o que sert� executado � perigoso, que h� uma exce��o
			metodo1();
		}
		catch(Exception ex) { // O "Exception captura qualquer exce��o 
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		//throw new ArithmeticException("Deu erro");
		throw new MinhaExcecao("Deu erro");
		//System.out.println("Fim do metodo2");
	}
}