
public class Tigre extends Felino {
	private String nome;
	
	public Tigre(String nome) {
		this.nome = nome;
	}

	public boolean èDomestico() {
		return false;
	}

	public String toString() {
		return "il pericolosissimo " + nome;
	}
}
