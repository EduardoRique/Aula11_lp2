public class ContaBancaria{

	private String cliente;
	private int num_conta;
	private double saldo;

	public ContaBancaria(String cliente, int num_conta){
		this.cliente = cliente;
		this.num_conta = num_conta;
		saldo = 0.00;
	}

	/**
	 * Retira um valor da conta bancaria
	 *
	 * @param      valor  The valor
	 */
	public void sacar(double valor){
		if(valor > 0){
			saldo -= valor;
		}
		else{
			System.out.println("Valor de saque inválido");
		}

	}

	/**
	 * Acrescenta um valor na conta bancaria
	 *
	 * @param      valor  The valor
	 */
	public void depositar(double valor){
		if(valor > 0){
			saldo += valor;
		}
		else{
			System.out.println("Valor de deposito inválido");
		}

	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString(){
		return ("Nome: "  + cliente + " Número da conta: " + Integer.toString(num_conta) + "  Saldo: " + Double.toString(saldo));
	}
	
}