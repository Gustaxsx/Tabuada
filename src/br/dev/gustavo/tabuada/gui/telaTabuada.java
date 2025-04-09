package br.dev.gustavo.tabuada.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class telaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinMultplicador;
	private JLabel labelMaxMultplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private JScrollPane scrollTabuada;
	private String tituloDaTela;

	public void criarTela(String tituloDaTela) {

		this.tituloDaTela = tituloDaTela;

		JFrame tela = new JFrame();
		tela.setTitle(this.tituloDaTela);
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);

		// Obtendo a referencia do painel de conteudo da tela
		Container conteiner = tela.getContentPane();

		// Criar o label multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 20, 200, 30);

		textMultiplicando = new JTextField();
		textMultiplicando.setAction(null);
		textMultiplicando.setBounds(180, 20, 50, 30);

		// Criar o label MinMultiplicador
		labelMinMultplicador = new JLabel();
		labelMinMultplicador.setText("Minimo multiplicador: ");
		labelMinMultplicador.setBounds(20, 60, 200, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setAction(null);
		textMinMultiplicador.setBounds(180, 60, 50, 30);
		
		// Criar o label MaxMultiplicador
		labelMaxMultplicador = new JLabel();
		labelMaxMultplicador.setText("Maximo Multiplicador: ");
		labelMaxMultplicador.setBounds(20, 100, 150, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setAction(null);
		textMaxMultiplicador.setBounds(180, 100, 50, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		// Adicionando os componentes no painel
		conteiner.add(labelMultiplicando);
		conteiner.add(labelMinMultplicador);
		conteiner.add(labelMaxMultplicador);
		conteiner.add(textMultiplicando);
		conteiner.add(textMinMultiplicador);
		conteiner.add(textMaxMultiplicador);
		conteiner.add(buttonCalcular);
		conteiner.add(buttonLimpar);

		// Tornar a tela visivel ultima instrução
		tela.setVisible(true);
	}

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}
}
