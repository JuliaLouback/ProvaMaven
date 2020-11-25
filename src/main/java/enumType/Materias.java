package enumType;

public enum Materias {
	
	Materia1("Redes de Computadores"),
	Materia2("An�lise de Dados"),
	Materia3 ("Programa��o Orientada a Objetos"),
	Materia4("Banco de Dados"),
	Materia5("Anatomia"),
	Materia6("Biologia Celular"),
	Materia7("Fisiologia"),
	Materia8("Biogeografia"),
	Materia9("Cartografia Geral"),
	Materia10("Matem�tica"),
	Materia11("Teoria da Comunica��o");
	
	
    private final String Nome;       

	private Materias(String nome) {
		this.Nome = nome;
	}
	
	@Override
   public String toString() {
        return Nome;
   }
	
   public static Materias listarUm(String text) {
	    for (Materias e : values()) {
	        if (e.Nome.equals(text)) {
	            return e;
	        }
	    }
	    return null;
	}
}
