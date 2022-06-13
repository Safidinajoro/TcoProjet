package polymorphisme;

public class ListeOrdonneeTable extends ListeOrdonnee {

	private int table[];
	private int taille;

	ListeOrdonneeTable(int tailleMax) {
		table = new int[tailleMax];
		taille = 0;
	}

	@Override
	public void ajoute(int e) {
		if (taille < table.length) {// ne fait rien si taille max atteinte
			int ouInserer = 0;
			while (ouInserer < taille && table[ouInserer] < e) {
				ouInserer++;
			}
			;
			// ouInserer = indice du 1er element >= e ou au dela du dernier
			for (int i = taille; i > ouInserer; i--) {
				table[i] = table[i - 1];
			}
			table[ouInserer] = e;
			taille++;
		}
	}

	@Override
	public int ieme(int i) {
		return table[i];
	}

	@Override
	public int nbElements() {
		return taille;
	}

	@Override
	public ListeOrdonnee cloner() {
		ListeOrdonneeTable listeTable = new ListeOrdonneeTable(table.length);
		for (int i = 0; i < taille; i++) {
			listeTable.table[i] = table[i];
		}
		listeTable.taille = taille;
		return listeTable;
	}
}
