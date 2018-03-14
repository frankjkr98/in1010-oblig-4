class Fastlege extends Lege implements Kommuneavtale {

    int avtalenummer;

    Fastlege(String navn, int avtalenummer) {
        //sender navn til superklassen
        super(navn);
        this.avtalenummer = avtalenummer;

    }
    @Override public int hentAvtalenummer() {

        return this.avtalenummer;

    }

}
