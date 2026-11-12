public class DiaDosNamorados extends CartaoWeb{
	
	public DiaDosNamorados(String destinatario){
		super(destinatario);
	}
	
	@Override
	public String showMessage(){
		return "DIA DOS NAMORADOS - Destinatário: " + getDestinatario();
	}
}
