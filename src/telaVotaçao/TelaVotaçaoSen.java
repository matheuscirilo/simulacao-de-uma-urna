package telaVotaçao;

import java.awt.Container;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import telaAdm.Candidato;


public class TelaVotaçaoSen extends JFrame{
	JButton zero;
	JButton um;
	JButton dois;
	JButton tres;
	JButton quatro;
	JButton cinco;
	JButton seis;
	JButton sete;
	JButton oito;
	JButton nove;
	JButton confirmar;
	JButton branco;
	JButton corrigir;
	
	JLabel dE;
	
	JTextField visor;
	
	String numero = "";
	int numero2 = 0;
	
	java.util.List<Candidato> listaCandidatos = new ArrayList<Candidato>();
	
	public TelaVotaçaoSen() {
		Container tela = getContentPane();
		tela.setLayout(null);
		
		Manipulador objetolistener = new Manipulador();
		
		confirmar = new JButton();
		confirmar.setText("CONFIRMAR");
		confirmar.setBounds(20, 350, 110, 50);
		tela.add(confirmar);
		confirmar.addActionListener(objetolistener);
		
		corrigir = new JButton();
		corrigir.setText("CORRIGIR");
		corrigir.setBounds(130, 350, 100, 50);
		tela.add(corrigir);
		corrigir.addActionListener(objetolistener);
		
		branco = new JButton();
		branco.setText("BRANCO");
		branco.setBounds(230, 350, 100, 50);
		tela.add(branco);
		branco.addActionListener(objetolistener);
		
		zero = new JButton();
		zero.setText("0");
		zero.setBounds(150, 300, 50, 50);
		tela.add(zero);
		zero.addActionListener(objetolistener);
		
		um = new JButton();
		um.setText("1");
		um.setBounds(100, 150, 50, 50);
		tela.add(um);
		um.addActionListener(objetolistener);
		
		dois = new JButton();
		dois.setText("2");
		dois.setBounds(150, 150, 50, 50);
		tela.add(dois);
		dois.addActionListener(objetolistener);
		
		tres = new JButton();
		tres.setText("3");
		tres.setBounds(200, 150, 50, 50);
		tela.add(tres);
		tres.addActionListener(objetolistener);
		
		quatro = new JButton();
		quatro.setText("4");
		quatro.setBounds(100, 200, 50, 50);
		tela.add(quatro);
		quatro.addActionListener(objetolistener);
		
		cinco = new JButton();
		cinco.setText("5");
		cinco.setBounds(150, 200, 50, 50);
		tela.add(cinco);
		cinco.addActionListener(objetolistener);
		
		seis = new JButton();
		seis.setText("6");
		seis.setBounds(200, 200, 50, 50);
		tela.add(seis);
		seis.addActionListener(objetolistener);
		
		sete = new JButton();
		sete.setText("7");
		sete.setBounds(100, 250, 50, 50);
		tela.add(sete);
		sete.addActionListener(objetolistener);
		
		oito = new JButton();
		oito.setText("8");
		oito.setBounds(150, 250, 50, 50);
		tela.add(oito);
		oito.addActionListener(objetolistener);
		
		nove = new JButton();
		nove.setText("9");
		nove.setBounds(200, 250, 50, 50);
		tela.add(nove);
		nove.addActionListener(objetolistener);
		
		
		visor = new JTextField(5);
		visor.setText("");
		visor.setBounds(150, 100, 50, 50);
		tela.add(visor);
		
		dE = new JLabel();
		dE.setText("SENADOR");
		dE.setBounds(140, 50, 150, 50);
		tela.add(dE);
		
		setBounds(100,100, 370,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		TelaVotaçaoSen janela = new TelaVotaçaoSen();
	}
	
	public class Manipulador implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == confirmar) 
			{
				for (Candidato candidato : listaCandidatos) {
					if(numero2 == candidato.getNumero()) {
						candidato.incrementaVoto();
					}
				}
				TelaVotaçaoDF frame = new TelaVotaçaoDF();
				frame.setVisible(true);
				dispose();
			}
			if (event.getSource() == corrigir) 
			{
				visor.setText("");
				numero = "";
			}
			if (event.getSource() == branco) 
			{
				visor.setText(null);
				TelaVotaçaoDF frame = new TelaVotaçaoDF();
				frame.setVisible(true);
				dispose();
			}
			if (event.getSource() == zero ) 
			{
				numero2 += 0;
				visor.setText(numero += "0");
			}
			if (event.getSource() == um ) 
			{
				numero2 += 1;
				visor.setText(numero += "1");
			}
			if (event.getSource() == dois) 
			{
				numero2 += 2;
				visor.setText(numero += "2");
			}
			if (event.getSource() == tres ) 
			{
				numero2 += 3;
				visor.setText(numero += "3");
			}
			if (event.getSource() == quatro ) 
			{
				numero2 += 4;
				visor.setText(numero += "4");
			}
			if (event.getSource() == cinco ) 
			{
				numero2 += 5;
				visor.setText(numero += "5");
			}
			if (event.getSource() == seis ) 
			{
				numero2 += 6;
				visor.setText(numero += "6");
			}
			if (event.getSource() == sete ) 
			{
				numero2 += 7;
				visor.setText(numero += "7");
			}
			if (event.getSource() == oito ) 
			{
				numero2 += 8;
				visor.setText(numero += "8");
			}
			if (event.getSource() == nove ) 
			{
				numero2 += 9;
				visor.setText(numero += "9");
			}
		}
			
	}
}
