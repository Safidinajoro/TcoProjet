package heritage;

public class Document {

	private String titre;

	public Document(String titre) {
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Document [titre=" + titre + ", getTitre()=" + getTitre() + "]";
	}
}
