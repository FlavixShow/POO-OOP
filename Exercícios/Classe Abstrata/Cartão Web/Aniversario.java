public class Aniversario extends CartaoWeb{
	
	public Aniversario(String destinatario){
		super(destinatario);
	}
	
	@Override
	public String showMessage(){
		return "ANIVERSÁRIO - Destinatário: " + getDestinatario();
	}
}
