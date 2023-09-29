package projeto04_termostato;

public class AplicacaoTermostato {

	public static void main(String[] args) {
		
		// Criação de uma instância do termostato
		Termostato 	termostato = new Termostato();
		System.out.println("Termostato\n");
		
		// Ligue o objeto, incremente 3 graus, decremente 5 graus e mostre a temperatura atual
		termostato.setLigado(true);
		
		// Aumentar a temperatura em 3 graus
		for (int i = 0; i < 3; i++) {
			termostato.aumentarTemp();
		}
		
		// Diminuir a temperatura em 5 graus
		for (int i = 0; i < 5; i++) {
			termostato.diminuirTemp();
		}
		
		// Obter a temperatura atual e exibi-la
		int temperaturaAtual = termostato.getTemperaturaAtual();
		System.out.println("Temperatura atual: " + temperaturaAtual + " graus Celsius.");
		
		// Incremente 2 graus e mostre a temperatura atual
		for (int i = 0; i < 2; i++) {
			termostato.aumentarTemp();
		}
		
		// Obter a temperatura atual novamente e exibi-la
		temperaturaAtual = termostato.getTemperaturaAtual();
		System.out.println("Temperatura atual: " + temperaturaAtual + " graus Celsius.");
		
		// Ligue o objeto, incremente 8 graus, decremente 2 graus, desligue o instrumento
		termostato.setLigado(true);
		
		// Aumentar a temperatura em 8 graus
		for (int i = 0; i < 8; i++) {
			termostato.aumentarTemp();
		}
		
		// Diminuir a temperatura em 2 graus
		for (int i = 0; i < 2; i++) {
			termostato.diminuirTemp();
		}
		
		// Obter a temperatura atual pela última vez
		temperaturaAtual = termostato.getTemperaturaAtual();
		System.out.println("Temperatura atual: " + temperaturaAtual + " graus Celsius.");
		
		// Desligar o termostato
		termostato.desligar();
		
		// Exibir a temperatura atual, que deve ser zero após o desligamento
		System.out.println("\nTemperatura atual após desligamento: " + temperaturaAtual + " graus Celsius.");
		
}
}