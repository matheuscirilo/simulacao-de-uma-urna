package telaAdm;

public class DeputadoFederal extends Candidato {
	int numero = 0;
	
	public DeputadoFederal(String nome, String partido, long numVotos) {
		super(nome, partido, numVotos);
		// TODO Auto-generated constructor stub
	}

	public DeputadoFederal() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	static int limite = 6666;
	
	public void setNumero(int numero) {
		if (numero >= 1000 && numero<=1744) {
			this.numero  = numero;
		} else {
				this.numero = limite;
				limite++;
		}
	}
	
	
	
}
