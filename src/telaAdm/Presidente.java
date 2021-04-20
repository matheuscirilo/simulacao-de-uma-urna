package telaAdm;

public class Presidente extends Candidato{
	int numero = 0;
	
	public Presidente(String nome, String partido, long numVotos) {
		super(nome, partido, numVotos);
		// TODO Auto-generated constructor stub
	}

	public Presidente() {
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
