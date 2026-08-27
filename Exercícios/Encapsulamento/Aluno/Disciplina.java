public class Disciplina{
	public static void main(String[] args){
		Aluno aluno = new Aluno("Alizée", 1111, 6);
		
		System.out.println(aluno.resultadoFinal()+"\n");
		
		System.out.println(aluno.getNome()+"\n");
		aluno.setNome("Alizée Novo");
		System.out.println(aluno.getNome()+"\n");
		
		System.out.println(aluno.getMatricula()+"\n");
		aluno.setMatricula(1212);
		System.out.println(aluno.getMatricula()+"\n");
		
		System.out.println(aluno.getMedia()+"\n");
		aluno.setMedia(5.9);
		System.out.println(aluno.getMedia()+"\n");

		System.out.println(aluno.resultadoFinal()+"\n");
		
		// o método verificaSituacao() é testado no construtor e no setMedia()
	}
}
