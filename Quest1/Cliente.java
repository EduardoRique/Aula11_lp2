/**
 * Class for Cliente.
 */
public class Cliente{
	
	protected String nome;
	protected String endereco;
	protected String telefone;

	/**
	 * Constructs the object.
	 *
	 * @param      n     { nome }
	 * @param      e     { endereco }
	 * @param      t     { telefone }
	 */
	public Cliente(String n, String e, String t){
		nome = n;
		endereco = e;
		telefone = t;
	}

	/**
	 * Gets the nome.
	 *
	 * @return     The nome.
	 */
	public String getNome(){
		return nome;
	}

	/**
	 * Gets the endereco.
	 *
	 * @return     The endereco.
	 */
	public String getEndereco(){
		return endereco;
	}

	/**
	 * Gets the telefone.
	 *
	 * @return     The telefone.
	 */
	public String getTelefone(){
		return telefone;
	}

	/**
	 * Sets the endereco.
	 *
	 * @param      e     { endereco }
	 */
	public void setEndereco(String e){
		endereco = e;
	}

	/**
	 * Sets the telefone.
	 *
	 * @param      t     { telefone }
	 */
	public void setTelefone(String t){
		telefone = t;
	}



}