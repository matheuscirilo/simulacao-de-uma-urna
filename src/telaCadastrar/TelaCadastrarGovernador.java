package telaCadastrar;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import telaAdm.Candidato;
import telaAdm.DeputadoFederal;
import telaAdm.Governador;
import telaAdm.TelaPrincipal;

public class TelaCadastrarGovernador extends JFrame{
	JButton cadastrar;
	
	JTextField nome;
	JTextField partido;
	JTextField numero;
	
	JLabel nomeLabel;
	JLabel partidoLabel;
	JLabel numeroLabel;
	
	Governador candidato = new Governador();
	List<Candidato> listaCandidato = new ArrayList<Candidato>();	
	public TelaCadastrarGovernador() {
		
		Container tela = getContentPane();
		
		Manipulador objetolistener = new Manipulador();
		
		cadastrar = new JButton();
		cadastrar.setText("Cadastrar");
		cadastrar.setBounds(100, 400, 200, 50);
		tela.add(cadastrar);
		cadastrar.addActionListener(objetolistener);
		
		nome = new JTextField();
		nome.setText("");
		nome.setBounds(100, 100, 200, 50);
		tela.add(nome);
		
		nomeLabel = new JLabel();
		nomeLabel.setText("Digite o nome do candidato");
		nomeLabel.setBounds(100, 60, 200, 50);
		tela.add(nomeLabel);
		
		partido = new JTextField();
		partido.setText("");
		partido.setBounds(100, 200, 200, 50);
		tela.add(partido);
		
		partidoLabel = new JLabel();
		partidoLabel.setText("Digite o nome do partido");
		partidoLabel.setBounds(100, 160, 200, 50);
		tela.add(partidoLabel);
		
		numero = new JTextField();
		numero.setText("");
		numero.setBounds(100, 300, 200, 50);
		tela.add(numero);
		
		numeroLabel = new JLabel();
		numeroLabel.setText("Digite o numero do candidato");
		numeroLabel.setBounds(100, 260, 200, 50);
		tela.add(numeroLabel);
	
		tela.setLayout(null);
		setBounds(200,200, 500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaCadastrarGovernador janela = new TelaCadastrarGovernador();
	}
	
	public class Manipulador implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == cadastrar) 
			{
				cadastrar();
				dispose();
				TelaPrincipal frame = new TelaPrincipal();
				frame.setVisible(true);
			}
		}
	}
	
	public void cadastrar() {
		candidato.setNome(nome.getText());
		candidato.setPartido(partido.getText());
		candidato.setNumero(Integer.parseInt(numero.getText()));
		listaCandidato.add(candidato);
	}
}
