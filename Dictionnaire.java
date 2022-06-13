package heritage;

public class Dictionnaire extends Document {

	private int nbreDeDefinitions;

	public Dictionnaire(String titre, int nbreDfen) {
		super(titre);
		this.nbreDeDefinitions = nbreDfen;
	}

	public int getNbreDeDefinitions() {
		return nbreDeDefinitions;
	}

	public void setNbreDeDefinitions(int nbreDfen) {
		this.nbreDeDefinitions =nbreDfen;
	}

	@Override
	public String toString() {
		return "Dictionnaire [titre=\"" + getTitre() + "\"," + " nbreDeDefinitions=" + nbreDeDefinitions + "]";
	}
}
