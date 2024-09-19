package personnages;

public class Gaulois {
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	private String nom;

	public String getNom() {
		return nom;
	}

	private int force;
	private int effetPotion = 1;

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {

	}
	

}
