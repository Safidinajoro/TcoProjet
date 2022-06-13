package heritage;

public class Livre extends Document {

	private String auteur;
	private int nbreDePages;
	
	public Livre(String titre, String auteur, int nbreDePages) {
		super(titre);
		this.auteur = auteur;
		this.nbreDePages = nbreDePages;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbreDePages() {
		return nbreDePages;
	}

	public void setNbreDePages(int nbreDePages) {
		this.nbreDePages = nbreDePages;
	}

	@Override
	public String toString() {
		return "Livre [titre=\"" + getTitre() + "\"," + " auteur=" + auteur + ", nbreDePages=" + nbreDePages + "]";
	}
}
