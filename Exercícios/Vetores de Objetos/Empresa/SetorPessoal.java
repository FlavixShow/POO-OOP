public class SetorPessoal{
	Funcionario[] funcionarios;
	
	public SetorPessoal(int tamanho){
		funcionarios = new Funcionario[tamanho];
	}
	
	public boolean adicionarFuncionario(Funcionario funcionario){
		for(Funcionario func : funcionarios){
			if(func != null){
				if(func.getNome().equalsIgnoreCase(funcionario.getNome()) || func.getMatricula() == funcionario.getMatricula()){
					return false;
				}
			}
		}
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == null){
				funcionarios[i] = funcionario;
				return true;
			}
		}
		return false;
	}
	
	public boolean removerFuncionario(Funcionario funcionario){
		if(funcionario == null){
			return false;
		}
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == funcionario){
				funcionarios[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Funcionario buscarFuncionario(int matricula){
		for(Funcionario funcionario : funcionarios){
			if(funcionario != null && funcionario.getMatricula() == matricula){
				return funcionario;
			}
		}
		return null;
	}
	
	public Funcionario buscarFuncionario(String nome){
		for(Funcionario funcionario : funcionarios){
			if(funcionario != null && funcionario.getNome().equalsIgnoreCase(nome)){
				return funcionario;
			}
		}
		return null;
	}
	
	public Funcionario[] listarFuncionarios(int departamento){
		Funcionario[] temp = new Funcionario[funcionarios.length];
		int cont = 0;
		for(Funcionario funcionario : funcionarios){
			if(funcionario != null && funcionario.getDepartamento() == departamento){
				temp[cont] = funcionario;
				cont++;
			}
		}
		if(cont == 0){
			return null;
		}
		return temp;
	}
	
	public Funcionario[] listarFuncionarios(String funcao){
		Funcionario[] temp = new Funcionario[funcionarios.length];
		int cont = 0;
		for(Funcionario funcionario : funcionarios){
			if(funcionario != null && funcionario.getFuncao().equalsIgnoreCase(funcao)){
				temp[cont] = funcionario;
				cont++;
			}
		}
		if(cont == 0){
			return null;
		}
		return temp;
	}
	
	public Funcionario[] listarFuncionarios(){
		return funcionarios;
	}
}
