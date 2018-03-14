//klassen lege består bare av et navn
class Lege extends Lenkeliste<Resept> implements Comparable<Lege> {

    Liste<String> sListe = new SortertLenkeliste<String>();
    String navn;

    Lege(String navn) {

        this.navn = navn;
        sListe.leggTil(navn);
    }

    String hentNavn() {

        return this.navn;

    }

}
