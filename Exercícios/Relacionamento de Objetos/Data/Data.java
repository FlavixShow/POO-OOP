public class Data{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(){
		dia = 1;
		mes = 1;
		ano = 2000;
	}
	
	public String retornaData(){
		return dia + "/" + mes + "/" + ano;
	}
	
	public String calculaTempo(Data data){
		return (ano - data.ano) + " Anos, " + (mes - data.mes) + " Meses, " + (dia - data.dia) + " Dias";
	}
	
	public int getDia(){
		return dia;
	}
	public int getMes(){
		return mes;
	}
	public int getAno(){
		return ano;
	}
}
