package PilaresPOO.Pilares;

//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
	// Abstração
	public abstract void enviarMensagem();
	public abstract void receberMensagem();

	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}