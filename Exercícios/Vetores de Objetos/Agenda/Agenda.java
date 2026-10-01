public class Agenda{
	private String nomeDaAgenda;
	private Pessoa[] contatos;
	private int totalContatos;
	
	
	public Agenda(String nomeDaAgenda, int tamanho){
		this.nomeDaAgenda = nomeDaAgenda;
		contatos = new Pessoa[tamanho];
		totalContatos = 0;
	}
	
	public boolean adicionaPessoa(Pessoa pessoa){
		if(pessoa == null){
			return false;
		}
		
		contatos[totalContatos] = pessoa;
		totalContatos++;
		return true;
	}
	
	public boolean removePessoa(Pessoa pessoa){
		for(int i = 0; i < totalContatos; i++){
			if(pessoa != null && contatos[i].getNome().equals(pessoa.getNome())){
				contatos[i] = null;
				totalContatos--;
				tiraEspaco();
				return true;
			}
		}
		return false;
	}
	
	public boolean alteraInformacoes(Pessoa pessoa){
		if(pessoa == null){
			return false;
		}
		
		for(int i = 0; i < totalContatos; i++){
			if(contatos[i].getNome().equalsIgnoreCase(pessoa.getNome())){
				contatos[i].setDiaDeNascimento(pessoa.getDiaDeNascimento());
				contatos[i].setMesDeNascimento(pessoa.getMesDeNascimento());
				contatos[i].setTelefone(pessoa.getTelefone());
				return true;
			}
		}
		return false;
	}
	
	public Pessoa[] buscaPessoas(){
		if(totalContatos == 0){
			return null;
		}
		Pessoa[] temp = new Pessoa[totalContatos];
		for(int i = 0; i < totalContatos; i++){
			temp[i] = contatos[i];
		}
		return temp;
	}
	
	public Pessoa buscaContato(String nome){
		for(int i = 0; i < totalContatos; i++){
			if(contatos[i].getNome().equalsIgnoreCase(nome)){
				return contatos[i];
			}
		}
		return null;
	}
	
	public void tiraEspaco(){
		for(int i = 0; i < contatos.length - 1; i++){
			if(contatos[i] == null){
				contatos[i] = contatos[i+1];
				contatos[i+1] = null;
			}
		}
	}
	
	public String getNomeDaAgenda(){
		return nomeDaAgenda;
	}
	public void setNomeDaAgenda(String nomeDaAgenda){
		this.nomeDaAgenda = nomeDaAgenda;
	}

	public int getTotalContatos(){
		return totalContatos;
	}
}
