package projeto01_medidor_de_pressão;

public class MedidorDePressao {
	
	/**
	 * Informações:
	 * 
	 * PA = Pressão Arterial
	 * PAD = Pressão Arterial Diastólica
	 * PAS = Pressão Arterial Sistólica
	 * MMHG = Milímetro de mercúrio
	**/
	
	// Atributos:
	
	private int idPaciente; // Número de identificação única do paciente	
	private String nomePaciente; // Nome do paciente
	private String sexo; // Sexo do paciente	
	private int idade; // Idade do paciente
	private int idadeGestacional; // Idade gestacional (aplicável a pacientes grávidas)
	private String classificacao; // Classificação da pressão arterial
	private double pad; // Pressão Arterial Diastólica (PAD) em MMHG
	private double pas; // Pressão Arterial Sistólica (PAS) em MMHG
	
	// Getters e Setters:
	
	// Getters para acessar os atributos
	
	public int getIdPaciente() {
		return idPaciente;
	}
	
	public String getNomePaciente(){
		return nomePaciente;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getIdadeGestacional() {
		return idadeGestacional;
	}
	
	public String getClassificacao() {
		return classificacao;
	}
	
	public double getPad() {
		return pad;
	}
	
	public double getPas() {
		return pas;
	}
	
	// Setters para definir os atributos
	
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public void setNomePaciente(String nome) {
		this.nomePaciente = nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setIdadeGestacional(int idadeGestacional) {
		this.idadeGestacional = idadeGestacional;
	}
	
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public void setPad(double pad) {
		this.pad = pad;
	}
	
	public void setPas(double pas) {
		this.pas = pas;
	}
	
	// Construtor
	
	// Construtor para inicializar o objeto com valores iniciais
	
	public MedidorDePressao(int idPaciente, String nomePaciente, String sexo, int idade, int idadeGestacional, String classificacao, double pas, double pad) {
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.sexo = sexo;
		this.idade = idade;
		this.idadeGestacional = idadeGestacional;
		this.classificacao = classificacao;
		this.pad = pad;
		this.pas = pas;
	}
	
	// Construtor (AppMedidorDePressaoPa)
	
	public MedidorDePressao(int idPaciente, String nomePaciente, double valorPas, double valorPad) {
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.pas = valorPas;
		this.pad = valorPad;
	}
	
	// Construtor (AppMedidorDePressaoPaIdade)
	
	public MedidorDePressao(int idPaciente, String nomePaciente, int idade, String sexo) {
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.idade = idade;
		this.sexo = sexo;
	}

	// Metódos
	
	/** 
	 Este método define a classificação da pressão arterial com base nos valores de PAD e PAS em MMHG.
	 Retorna uma string indicando a classificação, como "Normal" ou "Hipertensão grave".
	**/
	
	public static String definirPaNormal(double pad, double pas) {
		 
		if (pad < 85.0 && pas < 130.0) {
			return "Normal.";
		}
		else if (pad > 85.0 && pad < 89.0 && pas > 130.0 && pas < 139.0){
			return "Normal limítrofe.";
		}
		else if (pad > 90.0 && pad < 99.0 && pas > 140.0 && pas < 159.0) {
			return "Hipertensão leve (estágio 1).";
		}
		else if (pad > 100.0 && pad < 109.0 && pas > 160.0 && pas < 179.0) {
			return "Hipertensão moderada (estágio 2).";
		}
		else if (pad >= 110.0 && pas >= 180.0) {
			return "Hipertensão grave (estágio 3).";
		}
		else if (pad < 90.0 && pas >= 140.0) {
			return "Hipertensão sistólica isolada";
		}
		else{
			return "PAS ou PAD incorretos. Digite novamente.";
		}

	}
	
	/** 
	 Este método define a classificação da pressão arterial com base na idade e sexo do paciente.
	 Retorna uma string com os valores médios de MMHG recomendados.
	**/
	
	public static String definirPaIdade(String sexo, int idade) {
		if (idade <= 0) {
			 throw new IllegalArgumentException("A idade não pode ser negativa ou igua a 0. Tente novamente.");
		}
		else if ((idade >= 19) && (idade <= 24)) {
			return "120/79 mmHg.";
		}
		else if ((idade >= 25) && (idade <= 29)) {
			if ("Feminino".equals(sexo) || "mulher".equals(sexo)) {
				return "120/80 mmHg.";
			}
			else {
				return "121/80 mmHg";
			}
		}
		else if ((idade >= 30) && (idade <= 35)) {
			if ("Feminino".equals(sexo) || "mulher".equals(sexo)) {
				return "122/81 mmHg.";
			}
			else {
				return "123/82 mmHg.";
			}
		}
		else if ((idade >= 36) && (idade <= 39)) {
			if ("Feminino".equals(sexo) || "mulher".equals(sexo)) {
				return "123/82 mmHg.";
			}
			else {
				return "124/83 mmHg.";
			}
		}
		else if ((idade >= 40) && (idade <= 45)) {
			if ("Feminino".equals(sexo) || "feminino".equals(sexo)) {
				return "124/83 mmHg.";
			}
			else {
				return "125/83 mmHg.";
			}
		}
		else if ((idade >= 46) && (idade <= 49)) {
			if ("Feminino".equals(sexo) || "feminino".equals(sexo)) {
				return "124/83 mmHg.";
			}
			else {
				return "127/84 mmHg.";
			}
		}	
		else if ((idade >= 50) && (idade <= 55)) {
			if ("Feminino".equals(sexo) || "feminino".equals(sexo)) {
				return "129/85 mmHg.";
			}
			else {
				return "128/85 mmHg.";
			}
		}	
		else if ((idade >= 56) && (idade <= 59)) {
			if ("Feminino".equals(sexo) || "feminino".equals(sexo)) {
				return "130/86 mmHg.";
			}
			else {
				return "131/87 mmHg.";
			}
		}	
		else if (idade > 60) {
			if ("Feminino".equals(sexo) || "feminino".equals(sexo)) {
				return "134/84 mmHg.";
			}
			else {
				return "135/88 mmHg.";
			}
		}
		else {
			throw new IllegalArgumentException("Idade fora da faixa etária. Os valores são de dezenove (19) a sessenta (60), ou mais. Tente novamente.");
		}
			}
	
	/** 
	 Este método define a classificação da pressão arterial com base na idade gestacional (para pacientes grávidas).
	 Retorna uma string com os valores médios de PAS e PAD em MMHG para cada período de gestação.
	**/

	public static String definirPaGravidez(int idadeGestacional) {
		 if (idadeGestacional <= 0) {
			 throw new IllegalArgumentException("A idade não pode ser negativa ou igua a 0. Tente novamente.");
		 }
		 else if (idadeGestacional > 6 && idadeGestacional < 8) {
			 return "Média da Pressão Sistólica (PAS) = 103 a 104 mmHg\nMédia da Pressão Diastólica (PAD) = 57 a 58 mmHg";
		 }
		 else if (idadeGestacional >= 9 && idadeGestacional <= 12) {
			 return "Média da Pressão Sistólica (PAS) = 106 a 108 mmHg\nMédia da Pressão Diastólica (PAD) = 61 a 63 mmHg";
		 }
		 else if (idadeGestacional >= 13 && idadeGestacional <= 16) {
			 return "Média da Pressão Sistólica (PAS) = 103 a 104 mmHg\nMédia da Pressão Diastólica (PAD) = 59 a 61 mmHg";
		 }
		 else if (idadeGestacional >= 17 && idadeGestacional <= 20) {
			 return "Média da Pressão Sistólica (PAS) = 103 a 104 mmHg\nMédia da Pressão Diastólica (PAD) = 57 a 59 mmHg";
		 }
		 else if (idadeGestacional >= 21 && idadeGestacional <= 24) {
			 return "Média da Pressão Sistólica (PAS) = 104 a 106 mmHg\nMédia da Pressão Diastólica (PAD) = 56 a 58 mmHg";
		 }
		 else if (idadeGestacional >= 25 && idadeGestacional <= 28) {
			 return "Média da Pressão Sistólica (PAS) = 105 a 107 mmHg\nMédia da Pressão Diastólica (PAD) = 55 a 57 mmHg";
		 }
		 else if (idadeGestacional >= 29 && idadeGestacional <= 32) {
			 return "Média da Pressão Sistólica (PAS) = 105 a 107 mmHg\nMédia da Pressão Diastólica (PAD) = 57 a 59 mmHg";
		 }
		 else if (idadeGestacional >= 33 && idadeGestacional <= 34) {
			 return "Média da Pressão Sistólica (PAS) = 106 a 108 mmHg\nMédia da Pressão Diastólica (PAD) = 62 a 64 mmHg";
		 }
		 else if (idadeGestacional >= 35 && idadeGestacional <= 36) {
			 return "Média da Pressão Sistólica (PAS) = 106 a 108 mmHg\nMédia da Pressão Diastólica (PAD) = 62 a 64 mmHg";
		 }
		 else if (idadeGestacional == 37) {
			 return "Média da Pressão Sistólica (PAS) = 106 a 108 mmHg\nMédia da Pressão Diastólica (PAD) = 63 a 65 mmHg";
		 }
		 else if (idadeGestacional == 38) {
			 return "Média da Pressão Sistólica (PAS) = 108 a 110 mmHg\nMédia da Pressão Diastólica (PAD) = 63 a 65 mmHg";
		 }
		 else if (idadeGestacional == 39) {
			 return "Média da Pressão Sistólica (PAS) = 108 a 110 mmHg\nMédia da Pressão Diastólica (PAD) = 63 a 65 mmHg";
		 }
		 else if (idadeGestacional == 40) {
			 return "Média da Pressão Sistólica (PAS) = 110 a 112 mmHg\nMédia da Pressão Diastólica (PAD) = 68 a 70 mmHg";
		 }
		 else if (idadeGestacional > 40) {
			 return "Média da Pressão Sistólica (PAS) = 106 a 108 mmHg\nMédia da Pressão Diastólica (PAD) = 68 a 70 mmHg";
		 }
		 else {
			 throw new IllegalArgumentException("Idade gestacional fora da faixa etária. Os valores são de seis (6) a quartena (40), ou mais. Tente novamente.");
		 }
	 		}

	/** 
	 Este método define a classificação da pressão arterial na infância com base na idade do paciente.
	 Retorna uma string com os valores recomendados de PAS e PAD em MMHG.
	**/
	
	public static String definirPaInfancia(int idade) {
		if (idade <= 0) {
			throw new IllegalArgumentException("A idade não pode ser negativa ou igua a 0. Tente novamente.");
		}
		else if (idade <= 6) {
			 return "PAS/PAD = 110/75 mmHg";
		}
		 else if (idade >= 6 && idade <= 10) {
			 return "PAS/PAD = 120/80 mmHg";
		}
		 else if (idade >= 10 && idade <= 14) {
			 return "PAS/PAD = 120/80 mmHg";
		}
		 else if (idade >= 14 && idade <= 18) {
			 return "PAS/PAD = 135/90 mmHg";
		}
		 else {
			 throw new IllegalArgumentException("Idade fora da faixa etária. Os valores são de seis (6) a dezoito (18). Tente novamente.");
		}
			  }
		
}
