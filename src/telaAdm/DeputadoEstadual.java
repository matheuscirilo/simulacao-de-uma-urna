package telaAdm;

public class DeputadoEstadual extends Candidato{
	int numero = 0;
	
	public DeputadoEstadual(String nome, String partido, long numVotos) {
		super(nome, partido, numVotos);
		this.numero = numero;
	}
	
	public DeputadoEstadual() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}
	static int limite = 66666;
	
	public void setNumero(int i) {
		if (numero >= 10000 && numero<=17440) {
			this.numero  = numero;
		} else {
				this.numero = limite;
				limite++;
		}
	}
	
}
