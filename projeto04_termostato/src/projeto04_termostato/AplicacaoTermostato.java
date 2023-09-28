package projeto04_termostato;

public class AplicacaoTermostato {

	public static void main(String[] args) {
		
		Termostato termostato = new Termostato();

        // Ligue o objeto e ajuste a temperatura
        termostato.ligar();
        termostato.aumentarTemp();
        termostato.aumentarTemp();
        termostato.aumentarTemp();
        termostato.diminuirTemp();
        termostato.diminuirTemp();
        termostato.diminuirTemp();
        
        int temperaturaAtual = termostato.getTemperaturaAtual();
        System.out.println("Temperatura atual: " + temperaturaAtual + " graus Celsius");

        // Incremente 2 graus
        termostato.aumentarTemp();
        termostato.aumentarTemp();
        
        temperaturaAtual = termostato.getTemperaturaAtual();
        System.out.println("Temperatura atual: " + temperaturaAtual + " graus Celsius");

        // Ligue o objeto, incremente 8 graus, decremente 2 graus, desligue o instrumento
        termostato.ligar();
        for (int i = 0; i < 8; i++) {
            termostato.aumentarTemp();
        }
        for (int i = 0; i < 2; i++) {
            termostato.diminuirTemp();
        }
        termostato.desligar();

        temperaturaAtual = termostato.getTemperaturaAtual();
        System.out.println("Temperatura atual: " + temperaturaAtual + " graus Celsius");
    }

	}

}
