package telaAdm;

public class Senador extends Candidato {
	int numero = 0;
	
	public Senador(String nome, String partido, long numVotos) {
		super(nome, partido, numVotos);
		// TODO Auto-generated constructor stub
	}

	public Senador() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	static int limite = 666;
	
	public void setNumero(int numero) {
		if (numero >= 100 && numero<=999) {
			this.numero  = numero;
		} else {
				this.numero = limite;
				limite++;
		}
	}
	
	
}
