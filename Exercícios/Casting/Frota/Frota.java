public class Frota{
	public static void main(String[] args){
		Carro[] carros = new Carro[10];
		
		for(int i = 0; i < 10; i++){
			if(i%2 == 0){
				carros[i] = new Hatch(i, i*25, 15.0, true, i*7);
			}else{
				carros[i] = new Pickup(i, i*25, 15.0, false, i*70, i*70);
			}
		}
		
		for(int i = 0; i < 10; i++){
			if(carros[i] instanceof Hatch){
				Hatch hatch = (Hatch) carros[i];
				System.out.println("Passageiros: " + hatch.getPassageiros() + " | Combustível" + hatch.getCombustivel() + " | Rendimento: " + hatch.getRendimento() + " | Cambio Automárico: " + hatch.isCambioAutomatico() + " | Bagageiro: " + hatch.getBagageiro());
			}
			if(carros[i] instanceof Pickup){
				Pickup pickup = (Pickup) carros[i];
				System.out.println("Passageiros: " + pickup.getPassageiros() + " | Combustível" + pickup.getCombustivel() + " | Rendimento: " + pickup.getRendimento() + " | Cambio Automárico: " + pickup.isCambioAutomatico() + " | Capacidade de Carga: " + pickup.getCapacidadeCarga() + " | Peso da Carga:" + pickup.getPesoCarga());
			}
		}
	}
}
