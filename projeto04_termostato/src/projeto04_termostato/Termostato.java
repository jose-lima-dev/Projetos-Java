package projeto04_termostato;

public class Termostato {
	
	private boolean ligado;
	private int temperatura;
	private int temperaturaMin;
	private int temperaturaMax;
	
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
	
	public Termostato() {
		this.ligado = false;
		this.temperatura = 0;
		this.temperaturaMin = 80;
		this.temperaturaMax = 85;
	}
	
	public void desligar() {
        if (ligado) {
            ligado = false;
            temperatura = 0;
        }
    }

    public void aumentarTemp() {
        if (ligado && temperatura < temperaturaMax) {
            temperatura++;
        }
    }

    public void diminuirTemp() {
        if (ligado && temperatura > temperaturaMin) {
            temperatura--;
        }
    }

    public int getTemperaturaAtual() {
        return temperatura;
    }
	
	
}
