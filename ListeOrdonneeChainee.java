package polymorphisme;

public class ListeOrdonneeChainee extends ListeOrdonnee {

	private Maillon sommet;
	private int taille;

	ListeOrdonneeChainee() {
		sommet = null;
		taille = 0;
	}

	@Override
	public void ajoute(int elt) {
		Maillon ouInserer = null;
		Maillon courant = sommet;
		while (courant != null && courant.elt < elt) {
			ouInserer = courant;
			courant = courant.suivant;
		}
		if (ouInserer == null) {
			sommet = new Maillon(elt, sommet);
		} else {
			ouInserer.suivant = new Maillon(elt, ouInserer.suivant);
		}
		taille++;
	}

	@Override
	public int ieme(int i) {
		Maillon courant = sommet;
		for (int k = 0; k < i; k++) {
			courant = courant.suivant;
		}
		return courant.elt;
	}

	@Override
	public int nbElements() {
		return taille;
	}

	@Override
	public ListeOrdonnee cloner() {
		ListeOrdonneeChainee listeChainee = new ListeOrdonneeChainee();
		if (taille != 0) {
			Maillon courant = sommet;
			Maillon ouChainer = null;
			listeChainee.sommet = new Maillon(courant.elt, null);
			ouChainer = listeChainee.sommet;
			courant = courant.suivant;
			for (int i = 1; i < taille; i++) {
				ouChainer.suivant = new Maillon(courant.elt, null);
				ouChainer = ouChainer.suivant;
				courant = courant.suivant;
			}
		}
		listeChainee.taille = taille;
		return listeChainee;
	}

	private class Maillon {
		int elt;
		Maillon suivant;

		Maillon(int i, Maillon s) {
			elt = i;
			suivant = s;
		}
	}
}
