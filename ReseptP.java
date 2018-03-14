class ReseptP extends ReseptHvit {

    //Lager en fast rabatt til PResept
    static double rabatt = 116;
    int reit;
    double nyPris;

    ReseptP(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit) {

        super(legemiddel, utskrivendeLege, p, reit);

        this.reit = reit;

    }

    public double prisAaBetale() {
        //Definerer legemiddel sin pris og sjekker om den er større enn eller lik
        //rabatten til P
        double lPris = legemiddel.hentPris();
        //Dersom prisen er større enn 116, vil rabatten bare trekkes fra
        //Hvis den er mindre vil prisen bare bli 0
        if (lPris >= rabatt) {
            nyPris = lPris - rabatt;
        }
        else {
            nyPris = 0;
        }
        return nyPris;

    }

    int hentReit() {
        //dersom reit er mindre enn 0 vil den bare bli 0
        if (this.reit <= 0) {
            this.reit = 0;
            return this.reit;
        }
        //Hver gang reit brukes trekkes det fra ett bruk
        this.reit = this.reit - 1;
        //dersom ReseptP sin reit er større enn 3 vil den bli 3
        if (this.reit > 3) {
            this.reit = 3;
        }

        return this.reit;

    }
    //Henter metoden bruk for at klassen skal registrere endringen som
    //skjedde i hentReit i ReseptP
    public boolean bruk() {
        //Sjekker om resept er brukbar
        if (this.reit == 0) {
            return false;
        }
        return true;

    }



}
