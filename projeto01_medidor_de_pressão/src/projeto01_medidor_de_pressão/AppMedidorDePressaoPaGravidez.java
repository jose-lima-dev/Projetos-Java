package projeto01_medidor_de_pressão;

<<<<<<< HEAD
public class AppMedidorDePressaoPaGravidez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
=======
import java.util.Scanner;

public class AppMedidorDePressaoPaGravidez{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        boolean continuar = true;

        // Inicio do loop

        while (continuar) {

            // Entrada de dados
            
            System.out.println("\nMedidor de pressão\n");

            System.out.print("Informe o ID da paciente.........: ");
            int idPaciente = scan.nextInt();

            System.out.print("Informe seu nome.................: ");
            String nomePaciente = scan.next();

            System.out.print("Informe sua idade gestacional....: ");
            int idadeGestacional = scan.nextInt();

            // Instância

            MedidorDePressao medidorDePaGravidez = new MedidorDePressao(idPaciente, nomePaciente, idadeGestacional);

            // Saída de dados / Resultado

            System.out.print("\nResulados do exame:\n");

            System.out.println("ID............................: " + medidorDePaGravidez.getIdPaciente());
			System.out.println("Nome da paciente..............: " + medidorDePaGravidez.getNomePaciente());
			System.out.println("Idade gestacional.............: " + medidorDePaGravidez.getIdadeGestacional());

            String situacaoPaGravidez = MedidorDePressao.definirPaGravidez(idadeGestacional);
            System.out.println("\nClassificação da pressão arterial em mmhg (milímetro de mercúrio)..............: " + situacaoPaGravidez);
            
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
>>>>>>> 3ecde5ecf2731dfad5aaedf586bcc5175ce782da
