
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao con = new Conexao()) {
			con.leDados();
		}
		catch (IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		}
		
// ***** O codigo acima � um metodo mais simples do codigo abaixo *************
//
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o");
//
//		} finally {  // com ou sem erro, o finally sempre executa o que est� dentro dele 
//			System.out.println("Finally");
//			if(con != null) {
//				con.close();
//		}
	}

}
