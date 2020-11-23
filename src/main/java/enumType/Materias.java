package enumType;

public enum Materias {
	
	Materia1("Redes de Computadores"),
	Materia2("An�lise de Dados"),
	Materia3 ("Programa��o Orientada a Objetos"),
	Materia4("Banco de Dados");
	
    private final String Nome;       

	private Materias(String nome) {
		this.Nome = nome;
	}
	
	@Override
   public String toString() {
        return Nome;
   }
}
