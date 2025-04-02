package model;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;

	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public void mostrarTabuada() {
		if (minimoMultiplicador > maximoMultiplicador) {

			double troca;
			troca = maximoMultiplicador;

			maximoMultiplicador = minimoMultiplicador;
			minimoMultiplicador = troca;
		}
		
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.println(multiplicando + "X" + minimoMultiplicador + "=" + produto);
			minimoMultiplicador++;

		}

		     System.out.println("-----------------------");
	}
	
	
}
