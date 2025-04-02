package br.dev.gustavo.tabuada;

import javax.swing.JFrame;

import model.Tabuada;

public class Ironmain {

	public static void main(String[] args) {
		
		JFrame tela = new JFrame();
		tela.setTitle("DS1MA");
		tela.setSize(500, 600);
		tela.setVisible(true);
		
		System.out.println(tela.getSize().height);
		System.out.println(tela.getTitle());
		
	}

	
	
}
