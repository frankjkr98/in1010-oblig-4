public abstract class Resept {
    //Definerer parametrene til klassen Resept
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    Pasient p;
    int reit;

    //Sånn som i Legemiddel, lager jeg en statisk teller for ID
    private static int teller = 0;
    private int id;

    Resept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit) {

        super();
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.p = p;
        this.reit = reit + 1;
        this.id = teller;
        teller++;

    }

    int hentId() {
        return id;

    }

    String hentLegemiddel() {
        return this.legemiddel.hentNavn();

    }

    String hentLege() {
        return this.utskrivendeLege.hentNavn();

    }

    int hentPasientId() {
        return this.p.hentId();

    }

    int hentReit() {
        //Metoden skal hente reit til en resept
        //Dersom man skriver inn et negativt tall blir den automatisk 0
        if (this.reit <= 0) {
            this.reit = 0;
            return this.reit;
        }
        //når en resept brukes minskes reit med 1
        this.reit = this.reit - 1;
        return this.reit;

    }

    public boolean bruk() {
        //Sjekker om resept er brukbar
        if (this.reit == 0) {
            return false;
        }
        return true;

    }
    //Definerer abstrakte metoder til subklassene
    abstract public String farge();


    abstract public double prisAaBetale();


}
