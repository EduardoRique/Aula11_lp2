import java.util.ArrayList;

public class Empresa{

	private ArrayList<Cliente> clientes;
	
	/**
	 * Constructs the object.
	 */
	public Empresa(){
		clientes = new ArrayList<Cliente>();
	}

	/**
	 * Gets the quantidade geral.
	 *
	 * @return     The quantidade geral.
	 */
	public int getQuantidadeGeral(){
		return clientes.size();

	}

	/**
	 * Gets the quantidade fisica.
	 *
	 * @return     The quantidade fisica.
	 */
	public int getQuantidadeFisica(){
		int cont = 0;
		for(Cliente cliente : clientes){
			if(cliente instanceof PessoaFisica){
				cont++;
			}
		}
		return cont;
		
	}

	/**
	 * Gets the quantidade juridica.
	 *
	 * @return     The quantidade juridica.
	 */
	public int getQuantidadeJuridica(){
		int cont = 0;
		for(Cliente cliente : clientes){
			if(cliente instanceof PessoaJuridica){
				cont++;
			}
		}
		return cont;
	}
}