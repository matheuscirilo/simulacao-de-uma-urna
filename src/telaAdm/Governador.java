package telaAdm;

public class Governador extends Candidato{
	int numero = 0;
	
	public Governador(String nome, String partido, long numVotos) {
		super(nome, partido, numVotos);
		// TODO Auto-generated constructor stub
	}

	public Governador() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	static int limite = 66;
	
	public void setNumero(int numero) {
		if (numero >= 10 && numero<=99) {
			this.numero  = numero;
		} else {
				this.numero = limite;
				limite++;
		}
	}
	
}
