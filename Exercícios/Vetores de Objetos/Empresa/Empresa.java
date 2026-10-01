public class Empresa{
	public static void main(String[] args){
		SetorPessoal setor = new SetorPessoal(5);
		
		setor.adicionarFuncionario(new Funcionario(01, "Vino", 01, 2000.00, "Peão"));
		setor.adicionarFuncionario(new Funcionario(02, "Ino", 01, 3000.00, "Peão"));
		setor.adicionarFuncionario(new Funcionario(03, "Vol", 02, 4000.00, "mestre"));
		setor.adicionarFuncionario(new Funcionario(04, "Tano", 02, 5000.00, "mestre"));
		setor.adicionarFuncionario(new Funcionario(04, "excluso", 02, 5000.00, "não adicionado"));
		
		Funcionario[] listaFuncSetor1 = setor.listarFuncionarios(1);
		Funcionario[] listaFuncSetor2 = setor.listarFuncionarios(2);
		
		Funcionario[] listaFuncFuncaoPeao = setor.listarFuncionarios("Peão");
		Funcionario[] listaFuncFuncaoMestre = setor.listarFuncionarios("mestre");
		
		printarLista(listaFuncSetor1);
		printarLista(listaFuncSetor2);
		printarLista(listaFuncFuncaoPeao);
		printarLista(listaFuncFuncaoMestre);
		
		setor.removerFuncionario(setor.buscarFuncionario(2));
		setor.removerFuncionario(setor.buscarFuncionario("Vol"));
		
		Funcionario[] listaFuncionarios = setor.listarFuncionarios();
		
		printarLista(listaFuncionarios);
		
	}
	
	public static void printarLista(Funcionario[] funcionarios){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] != null){
				System.out.println(funcionarios[i].getMatricula());
				System.out.println(funcionarios[i].getNome());
				System.out.println(funcionarios[i].getDepartamento());
				System.out.println(funcionarios[i].getSalario());
				System.out.println(funcionarios[i].getFuncao());
				System.out.print("\n");
			}
		}
		System.out.println("\n");
	}
}
