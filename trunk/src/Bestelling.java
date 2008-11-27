/**
 * Klasse Bestelling, beschrijft een Bestelling van een Baksel door een Lid.
 * @author Groep 11
 */
public class Bestelling {

	int bestelling_id;
	int aantal;
	Baksel baksel;

	/**
	 * Constructor voor Bestelling, geen parameters
	 */
	public Bestelling() {
		this.aantal = -1;
		this.bestelling_id = -1;
	}

	/**
	 * Constructor voor Bestelling, parameter aantal
	 * @param aantal
	 */
	public Bestelling(int aantal) {
		this.aantal = aantal;
		this.bestelling_id = -1;
	}

	/**
	 * Constructor voor Bestelling, parameter aantal en Baksel
	 * @param aantal
	 * @param bestelling_id
	 */
	public Bestelling(int aantal, int bestelling_id) {
		this.aantal = aantal;
		this.bestelling_id = bestelling_id;
	}

	/**
	 * @return the bestelling_id
	 */
	public int getBestelling_id() {
		return bestelling_id;
	}

	/**
	 * @return the aantal
	 */
	public int getAantal() {
		return aantal;
	}

	/**
	 * @return the baksel
	 */
	public Baksel getBaksel() {
		return baksel;
	}

	/**
	 * @param bestelling_id the bestelling_id to set
	 */
	public void setBestelling_id(int bestelling_id) {
		this.bestelling_id = bestelling_id;
	}

	/**
	 * @param aantal the aantal to set
	 */
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}

	/**
	 * @param baksel the baksel to set
	 */
	public void setBaksel(Baksel baksel) {
		this.baksel = baksel;
	}
}