package projeto03_desgaste_de_pneu;

public class AplicacaoPneu {

	public static void main(String[] args) {
		
		//Objeto instanciado
		Pneu pneu = new Pneu(1, "Pirelli", 110, 'U', 20);
		
		//Mostrar o objeto criado.
		mostrarInformacoesPneu(pneu);
		
		//Desgaste com uso das 4 às 14 horas
		boolean desgaste1 = pneu.desgastar(4, 14);
		mostrarResultadoDesgaste(desgaste1, pneu);
		
		//Desgaste com uso das 15 às 20 horas
		boolean desgaste2 = pneu.desgastar(15, 20);
		mostrarResultadoDesgaste(desgaste2, pneu);
		
		//Desgaste com uso das 21 às 23 horas
		boolean desgaste3 = pneu.desgastar(21, 23);
		mostrarResultadoDesgaste(desgaste3, pneu);
		}
		
		//Método para mostrar informações do pneu
		public static void mostrarInformacoesPneu(Pneu pneu) {
			System.out.println("Informacoes do pneu: ");
	        System.out.println("ID do Pneu...............: " + pneu.getIdPneu());
	        System.out.println("Modelo...................: " + pneu.getModelo());
	        System.out.println("Índice de Vida...........: " + pneu.getIndiceDeVida());
	        System.out.println("Estado...................: " + pneu.getEstado());
	        System.out.println("Horas de Uso:............: " + pneu.getHorasDeUso());
	        System.out.println();
		}
		
		public static void mostrarResultadoDesgaste(boolean desgaste, Pneu pneu) {
	        if (desgaste) {
		       System.out.println("Desgaste registrado com sucesso!\n");
		       System.out.println("Índice de Vida: " + pneu.getIndiceDeVida());
		       System.out.println("Horas de Uso: " + pneu.getHorasDeUso());
		       System.out.println("Estado: " + pneu.getEstado());
		    } 
	        else {
		       System.out.println("Pneu fora de uso.");
		       }
		       
	        System.out.println();		
		 }

}
