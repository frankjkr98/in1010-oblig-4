class ReseptBlaa extends Resept {



    ReseptBlaa(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit) {

        super(legemiddel, utskrivendeLege, p, reit);

    }

    public String farge() {

        return "Blaa";
    }
    //Setter rabatt til blaa resept lik 0.25 av original pris
    public double prisAaBetale() {
        double nyPris = legemiddel.hentPris() * 0.25;
        return nyPris;
    }

}
