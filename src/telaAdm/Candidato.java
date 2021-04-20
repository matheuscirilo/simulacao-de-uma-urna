package telaAdm;

public abstract class Candidato {
	String nome = "";
	String partido = "";
	long numVotos = 0;
	
	public Candidato(String nome, String partido, long numVotos) {
		this.nome = nome;
		this.partido = partido;
		this.numVotos = numVotos;
	}
	
	public Candidato() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public long getNumVotos() {
		return numVotos;
	}
	public void setNumVotos(long numVotos) {
		this.numVotos = numVotos;
	}
	
	public void incrementaVoto() {
		numVotos++;
	}
	
	public abstract void setNumero(int i);
	public abstract int getNumero();
	
}
