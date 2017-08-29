/**
 * Class for pessoa fisica.
 */
public class PessoaFisica extends Cliente{
	
	private String cpf;

	/**
	 * Constructs the object.
	 *
	 * @param      n     { nome }
	 * @param      e     { endereco }
	 * @param      t     { telefone }
	 * @param      c     { cpf }
	 */
	public PessoaFisica(String n, String e, String t, String c){
		super(n, e, t);
		cpf = c;
	}

	/**
	 * Gets the cpf.
	 *
	 * @return     The cpf.
	 */
	public String getCpf(){
		return cpf;
	}

	/**
	 * Imprime os dados do cliente pessoa fisica
	 */
	public void imprimirDados(){
		System.out.println("Dados do cliente: ");
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("CPF: " + cpf);
	}
}