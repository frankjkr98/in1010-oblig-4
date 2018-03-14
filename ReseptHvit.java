abstract class ReseptHvit extends Resept {

    ReseptHvit(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit) {

        super(legemiddel, utskrivendeLege, p, reit);


    }

    public String farge() {

        return "Hvit";
    }





}
