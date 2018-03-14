class LegemiddelB extends Legemiddel {
    //Lager en statisk teller til ID
    int styrke;
    static int i = -1;

    public LegemiddelB(String navn, double pris, double virkestoff, int styrke) {
        //sender parametrene i super til superklassen
        super(navn, pris, virkestoff);
        this.styrke = styrke;
        i++;

    }

    int hentVanedannendeStyrke() {
        return this.styrke;

    }

    public int hentId() {
        return i;

    }



}
