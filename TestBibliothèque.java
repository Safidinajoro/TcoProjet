package heritage;

public class TestBibliothèque {

	public static void main(String[] args) {
		
		ListDocuments bibli = new ListDocuments();
		bibli.ajoute(new Livre("Le pere Goriot", "Balzac", 458));
		bibli.ajoute(new Livre("Nounours", "Chantal Goya", 14));
		bibli.ajoute(new Dictionnaire("Larousse", 4500));
		bibli.ajoute(new Livre("Tintin", "Herge", 62));
		bibli.ajoute(new Dictionnaire("Petit Robert", 5000));
		
		int nbLivres = 0;
		int nbDicos = 0;
		
		bibli.debut();
		while (!bibli.estEnFin()) {
			if (bibli.elementCourant() instanceof Livre) {
				nbLivres++;
			} else if (bibli.elementCourant() instanceof Dictionnaire) {
				nbDicos++;
			}
			System.out.println(bibli.elementCourant().toString());
			bibli.avance();
		}
		
		System.out.println("nombre de livres = " + nbLivres);
		System.out.println("nombre de dictionnaires = " + nbDicos);
	}

}
