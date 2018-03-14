class LegemiddelC extends Legemiddel {
    //Lager en statisk teller til ID
    static int i = -1;

    LegemiddelC(String navn, double pris, double virkestoff){
        //sender parametrene i super til superklassen
        super(navn, pris, virkestoff);
        i++;

    }

    public int hentId() {
        return i;
    }

}
