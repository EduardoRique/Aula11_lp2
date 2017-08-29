public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private String nomeFantasia;

	/**
	 * Constructs the object.
	 *
	 * @param      n     { nome }
	 * @param      e     { endereco }
	 * @param      t     { telefone }
	 * @param      c     { cnpj }
	 * @param      nf     { nome fantasia }
	 */
	public PessoaJuridica(String n, String e, String t, String c, String nf){
		super(n, e, t);
		cnpj = c;
		nomeFantasia = nf;
	}

	public String getCnpj(){
		return cnpj;
	}

	public String getNomeFantasia(){
		return nomeFantasia;
	}

	public void setNomeFantasia(String n){
		nomeFantasia = n;
	}

	/**
	 * Imprime os dados do cliente pessoa juridica
	 */
	public void imprimirDados(){
		System.out.println("Dados do cliente: ");
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Nome fantasia: " + nomeFantasia);
	}




}