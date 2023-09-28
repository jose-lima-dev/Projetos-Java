package projeto03_desgaste_de_pneu;

public class Pneu {
	
	private int idPneu;
	private String modelo;
	private double indiceDeVida;
	private char estado;
	private int horasDeUso;
	
	public int getIdPneu() {
		return idPneu;
	}
	public void setIdPneu(int idPneu) {
		this.idPneu = idPneu;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getIndiceDeVida() {
		return indiceDeVida;
	}
	public void setIndiceDeVida(double indiceDeVida) {
		this.indiceDeVida = indiceDeVida;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	public int getHorasDeUso() {
		return horasDeUso;
	}
	public void setHorasDeUso(int horasDeUso) {
		this.horasDeUso = horasDeUso;
	}
	
	public Pneu(int idPneu, String modelo, double indiceDeVida, char estado, int horasDeUso) {
		this.idPneu = idPneu;
		this.modelo = modelo;
		this.indiceDeVida = indiceDeVida;
		this.estado = 'N';
		this.horasDeUso = 0;
	}
	
	public boolean desgastar(int horaInicial, int horaFinal) {
		if (estado == 'N' || estado == 'U') {
			if (estado == 'N') {
				estado = 'U';
			}
			
			int minutosDeUso = horaFinal - horaInicial;
			
			indiceDeVida -= 0.12345 * minutosDeUso;
			
			if (indiceDeVida <= 0) {
				estado = 'F';
			}
			
			horasDeUso += minutosDeUso;
			
			return true;
		}
		else {
			return false;
		}
		
	}
}
