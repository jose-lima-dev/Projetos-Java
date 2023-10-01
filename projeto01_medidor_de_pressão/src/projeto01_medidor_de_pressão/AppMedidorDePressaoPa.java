package projeto01_medidor_de_pressão;

import java.util.Scanner;

public class AppMedidorDePressaoPa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Aplicação para exibir se a siutação de pressaão arterial (normal) do paciente.
		
		boolean continuar = true;
		
		// Inicio do loop
		
		while (continuar) {
			
			// Entrada de dados
			
			System.out.println("\nMedidor de pressão\n");
			
			System.out.print("Digite o ID do paciente: ");
			int idPaciente = scan.nextInt();
			
			System.out.print("Digite o nome do paciente (somente primeiro nome): ");
			String nomePaciente = scan.next();
			
			System.out.println("\nAgora digite os valores de PAD e PAS do paciente:");
			
			System.out.print("\nDigite o valor do PAD (Pressão Arterial Diastólica) do paciente: ");
			double valorPad = scan.nextDouble();
			
			System.out.print("Digite o valor do PAS (Pressão Arterial Sistólica) do paciente: ");
			double valorPas = scan.nextDouble();
			
			// Construtor
			
			MedidorDePressao medidorDePressaoArterial = new MedidorDePressao(idPaciente, nomePaciente, valorPas, valorPad);
			
			// Saída de dados / Resultado
			
			System.out.println("\nResultados do Exame:\n");
			
			System.out.println("ID............................: " + medidorDePressaoArterial.getIdPaciente());
			System.out.println("Nome do paciente..............: " + medidorDePressaoArterial.getNomePaciente());
			System.out.println("Valor PAD.....................: " + medidorDePressaoArterial.getPad());
			System.out.println("Valor PAS.....................: " + medidorDePressaoArterial.getPas());
		
			String situacaoPa = MedidorDePressao.definirPaNormal(valorPad, valorPas);
			System.out.println("\nSituação do PA..............: " + situacaoPa);
			
			// Resposta para decidir se continua ou sai do loop
			
			System.out.print("\nDeseja medir a pressão de outro paciente ou usuário? (S/N): ");
			String resposta	= scan.next();
			
			if (resposta.equalsIgnoreCase("N")){
				continuar = false; // Fim do loop
				System.out.print("\nFim da aplicação. Agradeço pelo uso!");
			}
		}
		
		scan.close();
	}

}
