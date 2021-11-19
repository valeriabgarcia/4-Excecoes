
public abstract class Conta {

	protected double saldo; // todo objeto do tipo conta tem um atributo saldo
	private int agencia; // todo objeto do tipo conta tem um atributo agencia
	private int numero; // todo objeto do tipo conta tem um atributo numero
	private Cliente titular; // composi��o de classes (associamos as classes Conta e Cliente)
	private static int total; // usando o "static" o total vai pertencer a classe, e n�o ao objeto

	// constutor padr�o
	// public Conta() {
	// }

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criado a conta: " + this.numero);
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("n�o pode ter numero negativo");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("n�o pode agencia negativa");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
}