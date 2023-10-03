package projeto01_medidor_de_pressão;

import java.util.Scanner;

public class AppMedidorDePressaoPaIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean continuar = true;
		
		// Inicio do loop

		while (continuar) {
			
			// Entrada de dados
			
			System.out.println("\nMedidor de pressão\n");
			
			System.out.print("Digite o ID do paciente...: ");
			int idPaciente = scan.nextInt();
			
			System.out.print("Digite seu nome...........: ");
			String nomePaciente = scan.next();
			
			System.out.print("Digite sua idade..........: ");
			int idade = scan.nextInt();
			
			System.out.print("Informe seu sexo..........: ");
			String sexo = scan.next();
			
			// Instância

			MedidorDePressao medidorDePaIdade = new MedidorDePressao(idPaciente, nomePaciente, idade, sexo);
			
			// Saída de dados / Resultado

			System.out.println("\nResultados do Exame:\n");
			
			System.out.println("ID............................: " + medidorDePaIdade.getIdPaciente());
			System.out.println("Nome do paciente..............: " + medidorDePaIdade.getNomePaciente());
			System.out.println("Idade do paciente.............: " + medidorDePaIdade.getIdade());
			System.out.println("Sexo..........................: " + medidorDePaIdade.getSexo());
<<<<<<< HEAD
			
=======

>>>>>>> 3ecde5ecf2731dfad5aaedf586bcc5175ce782da
			String situacaoPaIdade = MedidorDePressao.definirPaIdade(sexo, idade);
			System.out.println("\nClassificação da pressão arterial em mmhg (ilímetro de mercúrio)..............: " + situacaoPaIdade);
			
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
