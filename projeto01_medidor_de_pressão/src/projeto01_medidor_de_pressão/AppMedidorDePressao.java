package projeto01_medidor_de_pressão;

import java.util.Scanner;

public class AppMedidorDePressao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Medidor de pressão\n");
		
		System.out.print("Digite o ID do paciente: ");
		int idPaciente = scan.nextInt();
		
		System.out.print("Digite o nome do paciente: ");
		String nomePaciente = scan.next();
		
		System.out.print("Digite o valor do PAD (Pressão Arterial Diastólica) do paciente: ");
		double valorPad = scan.nextDouble();
		
		System.out.print("Digite o valor do PAS (Pressão Arterial Sistólica) do paciente: ");
		double valorPas = scan.nextDouble();
		
		MedidorDePressao medidorDePressao = new MedidorDePressao(idPaciente, nomePaciente, nomePaciente, idPaciente, idPaciente, valorPas, valorPas);  
		
		System.out.println("\nID..........................: " + medidorDePressao.getIdPaciente());
		System.out.println("Nome do paciente..............: " + medidorDePressao.getNome());
		System.out.println("Valor PAD.....................: " + medidorDePressao.getPad());
		System.out.println("Valor PAS.....................: " + medidorDePressao.getPas());
	
		String situacaoPa = MedidorDePressao.definirPaNormal(valorPad, valorPas, nomePaciente);
		System.out.println("\nSituação do PA..............: " + situacaoPa);
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
