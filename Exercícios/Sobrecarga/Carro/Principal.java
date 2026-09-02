public class Principal{
	public static void main(String[] args){
		Carro carro1 = new Carro(100);
		Carro carro2 = new Carro();
	
		System.out.println("Autonomia Carro 1: " + carro1.autonomia());
		System.out.println("Autonomia Carro 1: " + carro1.autonomia("alcool"));
		System.out.println("Autonomia Carro 1: " + carro1.autonomia("alcool", 50));
		System.out.println("Autonomia Carro 1: " + carro1.autonomia("gasolina", false));
		System.out.println("Autonomia Carro 1: " + carro1.autonomia("gasolina", true)+"\n");
		
		System.out.println("Autonomia Carro 2: " + carro2.autonomia());
		System.out.println("Autonomia Carro 2: " + carro2.autonomia("alcool"));
		System.out.println("Autonomia Carro 2: " + carro2.autonomia("alcool", 50));
		System.out.println("Autonomia Carro 2: " + carro2.autonomia("gasolina", false));
		System.out.println("Autonomia Carro 2: " + carro2.autonomia("gasolina", true)+"\n");
	}
}
