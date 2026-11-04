public class Biblioteca{
	private Funcionario[] funcionarios;
	
	public Biblioteca(){
		this.funcionarios = new Funcionario[10];
	}
	
	public boolean adicionaFuncionario(Bibliotecario bibliotecario){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == null){
				funcionarios[i] = bibliotecario;
				return true;
			}
		}
		return false;
	}
	
	public boolean adicionaFuncionario(Auxiliar auxiliar){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == null){
				funcionarios[i] = auxiliar;
				return true;
			}
		}
		return false;
	}
	
	public boolean adicionaFuncionario(Atendente atendente){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == null){
				funcionarios[i] = atendente;
				return true;
			}
		}
		return false;
	}
	
	public boolean excluiFuncionario(String nome){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] != null && funcionarios[i].getNome().equals(nome)){
				funcionarios[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Funcionario buscaFuncionario(String nome){
		for(Funcionario func : funcionarios){
			if(func != null && func.getNome().equals(nome)){
				return func;
			}
		}
		return null;
	}
	
	public Double mostraSalario(String nome){
		for(Funcionario func : funcionarios){
			if(func != null && func.getNome().equals(nome)){
				if(func instanceof Bibliotecario){
					Bibliotecario bibliotecario = (Bibliotecario) func;
					return bibliotecario.calculaSalario();
				}
				if(func instanceof Auxiliar){
					Auxiliar auxiliar = (Auxiliar) func;
					return auxiliar.calculaSalario();
				}
				if(func instanceof Atendente){
					Atendente atendente = (Atendente) func;
					return atendente.calculaSalario();
				}

			}
		}
		return 0.0;
	}
	
	public String executaTarefa(Funcionario funcionario, String info){
		if(funcionario instanceof Bibliotecario){
			Bibliotecario bibliotecario = (Bibliotecario) funcionario;
			return bibliotecario.processaEmprestimo(info);
		}else if(funcionario instanceof Auxiliar){
			Auxiliar auxiliar = (Auxiliar) funcionario;
			return auxiliar.organizaLivros(info);
		}else if(funcionario instanceof Atendente){
			Atendente atendente = (Atendente) funcionario;
			return atendente.atenderUsuario(info);
		}
		return "";
	}
	
	public Funcionario[] getFuncionarios(){
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios){
		if(funcionarios.length <= 10){
			this.funcionarios = funcionarios;
		}
	}
}
