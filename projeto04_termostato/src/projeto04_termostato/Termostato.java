package projeto04_termostato;

public class Termostato {
	
	// Atributos
	private boolean ligado; // Indica se o termostato está ligado (true) ou desligado (false).
	private int temperatura; // Armazena a temperatura atual controlada pelo termostato.	
	private int temperaturaMin; // Temperatura mínima que o termostato pode atingir.
	private int temperaturaMax; // Temperatura máxima que o termostato pode atingir.
	
	// Métodos Getters e Setters para os atributos
	
	public boolean getLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public int getTemperaturaMin() {
		return temperaturaMin;
	}
	
	public void setTemperaturaMin(int temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	
	public int getTemperaturaMax() {
		return temperaturaMax;
	}
	
	public void setTemperaturaMax(int temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	
	// Construtor da classe
	public Termostato() {
		this.ligado = false; // Inicialmente, o termostato está desligado.
		this.temperatura = 0; // A temperatura começa em 0 graus Celsius.	
		this.temperaturaMin = 80; // Define a temperatura mínima como 80 graus Celsius.
		this.temperaturaMax = 85; // Define a temperatura máxima como 85 graus Celsius.
	}
	
	// Métodos para controle do termostato
	
	// Desliga o termostato, zerando a temperatura.
	public void desligar() {
        if (ligado) {
            ligado = false;
            temperatura = 0;
        }
    }

	// Aumenta a temperatura em 1 grau, se o termostato estiver ligado e abaixo da temperatura máxima.
    public void aumentarTemp() {
        if (ligado && temperatura < temperaturaMax) {
            temperatura++;
        }
    }

    // Diminui a temperatura em 1 grau, se o termostato estiver ligado.
    public void diminuirTemp() {
    	 if (ligado) {
    	        temperatura--;
    	 }
    }
    
    // Mostra a temperatura atual (em graus Celsius).
    public int getTemperaturaAtual() {
        return temperatura;
    }
	
	
}
