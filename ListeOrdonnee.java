package polymorphisme;

import java.util.Scanner;

public abstract class ListeOrdonnee {

	public abstract void ajoute(int e);

	public abstract int ieme(int i);

	public abstract int nbElements();

	public abstract ListeOrdonnee cloner();

	public void fusion(ListeOrdonnee liste) {
		ListeOrdonnee liste2;
		if (liste != this) {
			liste2 = liste;
		} else {
			liste2 = cloner();
		}
		for (int i = 0; i < liste2.nbElements(); i++) {
			ajoute(liste2.ieme(i));
		}
	}

	public void saisir() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nombre d'elements à saisir : ");
		int taille = sc.nextInt();
		
		for (int i = 0; i < taille; i++) {
			System.out.print("elements [" + i + "] : ");
			ajoute(sc.nextInt());
		}
	}

	public void editer() {
		for (int i = 0; i < nbElements(); i++) {
			System.out.print(" " + ieme(i));
		}
		System.out.println();
	}
}
