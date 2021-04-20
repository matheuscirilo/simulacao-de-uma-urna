package telaAdm;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaResultado extends JFrame{
	JLabel resultado;
	String nome = "vencedor";
	
	public TelaResultado() {
		Container tela = getContentPane();
		
		resultado = new JLabel();
		resultado.setText(nome);
		resultado.setBounds(200, 200, 200, 50);
		tela.add(resultado);
		
		tela.setLayout(null);
		setBounds(200,200, 500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		TelaResultado janela = new TelaResultado();
	}
}
