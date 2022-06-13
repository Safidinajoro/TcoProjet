package polymorphisme;

public class TestListeOrdonnee {

	public static void main(String[] args) {
		ListeOrdonnee liste1 = new ListeOrdonneeTable(40);
		ListeOrdonnee liste2 = new ListeOrdonneeChainee();
		System.out.print("\nliste1 = ");
		liste1.saisir();
		System.out.print("\nliste2 = ");
		liste2.saisir();
		System.out.print("\nliste1 = ");
		liste1.editer();
		System.out.print("\nliste2 = ");
		liste2.editer();
		liste1.fusion(liste2);
		System.out.print("\nliste1 = liste1+liste2 : ");
		liste1.editer();
		liste2.fusion(liste1);
		System.out.print("\nliste2 = liste2+liste1 : ");
		liste2.editer();
		liste1.fusion(liste1);
		System.out.print("\nliste1 = liste1+liste1 : ");
		liste1.editer();
		liste2.fusion(liste2);
		System.out.print("\nliste2 = liste2+liste2 : ");
		liste2.editer();

	}

}
