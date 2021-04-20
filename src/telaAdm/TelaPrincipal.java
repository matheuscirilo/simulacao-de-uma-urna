package telaAdm;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import telaCadastrar.TelaCadastrarDepEstadual;
import telaCadastrar.TelaCadastrarDepFederal;
import telaCadastrar.TelaCadastrarGovernador;
import telaCadastrar.TelaCadastrarPresidente;
import telaCadastrar.TelaCadastrarSenador;
import telaVota�ao.TelaVota�aoDE;
import telaVota�ao.TelaVota�aoDF;
import telaVota�ao.TelaVota�aoGov;
import telaVota�ao.TelaVota�aoPres;
import telaVota�ao.TelaVota�aoSen;

public class TelaPrincipal extends JFrame{
	
	JButton cadastrarDE;
	JButton cadastrarDF;
	JButton cadastrarGov;
	JButton cadastrarSen;
	JButton cadastrarPre;
	JButton votar;
	JButton encerrarVota�ao;
	
	JLabel info;
	
	public static List<Candidato> listaCandidatos = new ArrayList<Candidato>();
	
	public List getListaCandidatos() {
		return listaCandidatos;
	}
	
	public TelaPrincipal() {
		
		Container tela = getContentPane();
		tela.setLayout(null);
		
		Manipulador objetolistener = new Manipulador();
		
		cadastrarDE = new JButton();
		cadastrarDE.setText("DEPUTADO ESTADUAL");
		cadastrarDE.setBounds(50, 50, 200, 50);
		tela.add(cadastrarDE);
		cadastrarDE.addActionListener(objetolistener);
		
		cadastrarDF = new JButton();
		cadastrarDF.setText("DEPUTADO FEDERAL");
		cadastrarDF.setBounds(50, 100, 200, 50);
		tela.add(cadastrarDF);
		cadastrarDF.addActionListener(objetolistener);
		
		cadastrarGov = new JButton();
		cadastrarGov.setText("GOVERNADOR");
		cadastrarGov.setBounds(50, 150, 200, 50);
		tela.add(cadastrarGov);
		cadastrarGov.addActionListener(objetolistener);
		
		cadastrarSen = new JButton();
		cadastrarSen.setText("SENADOR");
		cadastrarSen.setBounds(50, 200, 200, 50);
		tela.add(cadastrarSen);
		cadastrarSen.addActionListener(objetolistener);
		
		cadastrarPre = new JButton();
		cadastrarPre.setText("PRESIDENTE");
		cadastrarPre.setBounds(50, 250, 200, 50);
		tela.add(cadastrarPre);
		cadastrarPre.addActionListener(objetolistener);
		
		votar = new JButton();
		votar.setText("VOTAR");
		votar.setBounds(300, 50, 200, 100);
		tela.add(votar);
		votar.addActionListener(objetolistener);
		
		encerrarVota�ao = new JButton();
		encerrarVota�ao.setText("ENCERRAR VOTA��O");
		encerrarVota�ao.setBounds(300, 150, 200, 100);
		tela.add(encerrarVota�ao);
		encerrarVota�ao.addActionListener(objetolistener);
		
		info = new JLabel();
		info.setText("Clique para cadastrar: ");
		info.setBounds(50, 10, 200, 50);
		tela.add(info);
		
		setBounds(200,200, 550,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TelaPrincipal janela = new TelaPrincipal();
	}
	
	public class Manipulador implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == cadastrarDE ) 
			{
				TelaCadastrarDepEstadual frame = new TelaCadastrarDepEstadual();
				frame.setVisible(true);
				dispose();
			}
			if (event.getSource() == cadastrarDF ) 
			{
				TelaCadastrarDepFederal frame = new TelaCadastrarDepFederal();
				frame.setVisible(true);
				dispose();
			}
			if (event.getSource() == cadastrarGov ) 
			{
				TelaCadastrarGovernador frame = new TelaCadastrarGovernador();
				frame.setVisible(true);
				
			}
			if (event.getSource() == cadastrarPre ) 
			{
				TelaCadastrarPresidente frame = new TelaCadastrarPresidente();
				frame.setVisible(true);
				dispose();
				
			}
			if (event.getSource() == cadastrarSen ) 
			{
				TelaCadastrarSenador frame = new TelaCadastrarSenador();
				frame.setVisible(true);
				dispose();
				
			}
			if (event.getSource() == votar ) {
				TelaVota�aoPres frame = new TelaVota�aoPres();
				frame.setVisible(true);
				dispose();
				
			}
			if (event.getSource() == encerrarVota�ao ) {
				TelaResultado frame = new TelaResultado();
				frame.setVisible(true);
				dispose();
				
			}
			
		}
	}
}
