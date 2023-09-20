package projeto01_medidor_de_pressão;

public class MedidorDePressao {
	
	private static String situacao;
	/**
	 * Informações:
	 * 
	 * PA = Pressão Arterial
	 * PAD = Pressão Arterial Diastólica
	 * PAS = Pressão Arterial Sistólica
	 * MMHG = Milímetro de mercúrio
	**/
	
	// Atributos:
	
	private int idPaciente;
	private String nome;
	private String sexo;
	private int idade;
	private int idadeGestacional;
	private String classificacao;
	private double pad;
	private double pas;
	
	// Getters:
	
	public int getIdPaciente() {
		return idPaciente;
	}
	
	public String getNome(){
		return nome;
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
	
	// Setters:
	
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public MedidorDePressao(int idPaciente, String sexo, String nome, int idadeGestacional, int idade, double pas, double pad) {
		super();
		this.idPaciente = idPaciente;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.idadeGestacional = idadeGestacional;
		//this.classificacao = classificacao;
		this.pad = pad;
		this.pas = pas;
	}

	// Metódos
	
	/** 
	 Este metódo vai definir sua PA (Presão Arterial) normal de acordo com a sua 
	 PAD (Pressão Arterial Diastólica) e PAS (Pressão Arterial Sistólica) em MMHG
  	 (Milímetro de mercúrio) e exibir a classficação, de "Normal" até "Hipertensão sistólica isolada".
	**/
	
	public static String definirPaNormal(double pad, double pas, String situacao) {
		 
		if (pad < 85.0 && pas < 130.0) {
			situacao = "Normal";
		}
		else if (pad < 85.0 && pad < 89.0 && pas < 130.0 && pas < 139.0){
			return "Normal limítrofe";
		}
		else if (pad < 90.0 && pad < 99.0 && pas < 140.0 && pas < 159.0) {
			return "Hipertensão leve (estágio 1)";
		}
		else if (pad < 100.0 && pad < 109.0 && pas < 160.0 && pas < 179.0) {
			return "Hipertensão moderada (estágio 2)";
		}
		else if (pad >= 110.0 && pas >= 180.0) {
			return "Hipertensão grave (estágio 3";
		}
		else if (pad < 90.0 && pas >= 140.0) {
			return "Hipertensão sistólica isolada";
		}
		else{
			return "PAS ou PAD incorretos. Digite novamente";
		}
		return situacao;

	}
	
	/** 
	  Este metódo vai definir sua PA (Pressão Arterial) de acordo com a sua idade e sexo,exibindo 
	  os valores de MMHG (Milímetro de mercúrio) determindados por autoridades de saúde. 
 	**/
	
	public static String definirPaIdade(String sexo, int idade) {
		if (idade <= 0) {
			 throw new IllegalArgumentException("A idade não pode ser negativa ou igua a 0. Tente novamente.");
		}
		else if ((idade >= 19) && (idade <= 24)) {
			return "120/79 mmHg.";
		}
		else if ((idade >= 25) && (idade <= 29)) {
			if ("Mulher".equals(sexo) || "mulher".equals(sexo)) {
				return "120/80 mmHg.";
			}
			else {
				return "121/80 mmHg";
			}
		}
		else if ((idade >= 30) && (idade <= 35)) {
			if ("Mulher".equals(sexo) || "mulher".equals(sexo)) {
				return "122/81 mmHg.";
			}
			else {
				return "123/82 mmHg.";
			}
		}
		else if ((idade >= 36) && (idade <= 39)) {
			if ("Mulher".equals(sexo) || "mulher".equals(sexo)) {
				return "123/82 mmHg.";
			}
			else {
				return "124/83 mmHg.";
			}
		}
		else if ((idade >= 40) && (idade <= 45)) {
			if ("Mulher".equals(sexo) || "mulher".equals(sexo)) {
				return "124/83 mmHg.";
			}
			else {
				return "125/83 mmHg.";
			}
		}
		else if ((idade >= 46) && (idade <= 49)) {
			if ("Mulher".equals(sexo) || "mulher".equals(sexo)) {
				return "124/83 mmHg.";
			}
			else {
				return "127/84 mmHg.";
			}
		}	
		else if ((idade >= 50) && (idade <= 55)) {
			if ("Mulher".equals(sexo) || "mulher".equals(sexo)) {
				return "129/85 mmHg.";
			}
			else {
				return "128/85 mmHg.";
			}
		}	
		else if ((idade >= 56) && (idade <= 59)) {
			if ("Mulher".equals(sexo) || "mulher".equals(sexo)) {
				return "130/86 mmHg.";
			}
			else {
				return "131/87 mmHg.";
			}
		}	
		else if (idade > 60) {
			if ("Mulher".equals(sexo) || "mulher".equals(sexo)) {
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
	  Este metódo vai definir os valores da sua PA (Pressão Arterial) de acordo com a sua idade gestacional, exibindo 
	  os valores médios do PAS (Pressão Arterial Sistólica) e PAD (Pressão Arterial Diastólica) determindados por autoridades de saúde. 
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
	  Este metódo vai definir os valores máximos de PA (Pressão Arterial) na infância de acordo com a idade, exibindo 
	  os valores do PAS (Pressão Arterial Sistólica) e PAD (Pressão Arterial Diastólica) determindados por autoridades de saúde. 
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
