public class Frota{
	public static void main(String[] args){
		Carro carro = new Carro(2);
	
		System.out.println("combustível inicial: " + carro.autonomia()); // combustível inicial
		System.out.println("quilometragem inicial" + carro.getQuilometragem()); // quilometragem inicial
		
		carro.percorrerDistancia(25); //distancia inválida
		
		System.out.println("combustível depois da viagem inválida: " + carro.autonomia()); // combustível depois da viagem inválida
		System.out.println("quilometragem depois da viagem inválida: " + carro.getQuilometragem()); // quilometragem depois da viagem inválida
		
		carro.percorrerDistancia(24); //distancia válida
		System.out.println("Viagem realizada");
		
		System.out.println("combustível depois da viagem válida: " + carro.autonomia()); // combustível depois da viagem válida
		System.out.println("quilometragem depois da viagem válida: " + carro.getQuilometragem()); // quilometragem depois da viagem válida
		
		
		// gets e sets
		carro.setCombustivel(50);
		System.out.println("combustível final: " + carro.getCombustivel());
		
		carro.setQuilometragem(1000);
		System.out.println("quilometragem final: " + carro.getQuilometragem());
	
	}
}
