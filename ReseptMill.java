class ReseptMill extends ReseptHvit {

    ReseptMill(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit) {

        super(legemiddel, utskrivendeLege, p, reit);


    }
    //Setter rabatt til mill resept lik 0
    public double prisAaBetale() {
        double nyPris = legemiddel.hentPris() * 0;
        return nyPris;

    }



}
