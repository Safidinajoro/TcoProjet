package heritage;

public class ListDocuments {

	private Maillon sommetListe;
	private Maillon parcoursListe;

	public ListDocuments() {
		sommetListe = null;
		parcoursListe = null;
	}

	public boolean estVide() {
		return sommetListe == null;
	}

	public void ajoute(Document doc) {
		sommetListe = new Maillon(doc, sommetListe);
		System.out.println("Document ajouté : " + doc.toString());
	}

	public void debut() {
		if (!estVide()) {
			parcoursListe = sommetListe;
			System.out.println("Début parcours ...");
		}
		else
			System.out.println("Désolé, la liste est vide donc pas de possibilité de parcours !");
	}

	void avance() {
		parcoursListe = parcoursListe.getSuivant();
	}

	boolean estEnFin() {
		return parcoursListe == null;
	}

	Document elementCourant() {
		return parcoursListe.getDocument();
	}
	
	private class Maillon {
		private Document document;
		private Maillon suivant;

		Maillon(Document doc, Maillon s) {
			document = doc;
			suivant = s;
		}

		public Document getDocument() {
			return document;
		}

		public Maillon getSuivant() {
			return suivant;
		}
	}
}
