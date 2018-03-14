public class Legemiddel {
	//Definerer parametrene til legemiddel
	String navn;
	double pris;
	double virkestoff;
	//lager en statisk teller som skal brukes til ID
	static int i = 0;

	public Legemiddel(String navn, double pris, double virkestoff) {
		//initierer super så den kan brukes i sub-klassene
		super();
		this.navn = navn;
		this.pris = pris;
		this.virkestoff = virkestoff;
	}

	public int hentId() {
		return i;

	}

	String hentNavn() {
		return navn;
	}

	double hentPris() {
		return pris;

	}

	double hentVirkestoff() {
		return virkestoff;

	}
	void settNyPris(double nyPris) {
		//setter prisen lik parameteret
		this.pris = nyPris;
	}
}
