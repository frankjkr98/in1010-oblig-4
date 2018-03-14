class SortertLenkeliste<T extends Comparable<T>> extends Lenkeliste<T> {


    //Her bruker jeg samme LeggTil som brukes i Lenkeliste med posisjon
    //Jeg endrer bare på at istedet for å sjekke posisjon sjekker den størrelsen på elementet
    public void leggTil(T x) {
        Node tmp_node = hode;
        int teller = 0;
        Node sortert = new Node(x);

        if (hode == null) {
            hode = sortert;
            hale = hode;
            return;
        }
        else if (sortert.ting.compareTo(hale.ting) > 0) {
            sortert.forrige = hale;
            hale.neste = sortert;
            hale = sortert;
            return;
        }

        while (tmp_node != null) {
            if (sortert.ting.compareTo(tmp_node.ting) < 0) {
                if (tmp_node == hode) {
                    sortert.neste = hode;
                    sortert.forrige = null;
                    hode.forrige = sortert;
                    hode = sortert;
                    return;
                }
                sortert.forrige = tmp_node.forrige;
                tmp_node.forrige.neste = sortert;
                tmp_node.forrige = sortert;
                sortert.neste = tmp_node;
                return;
            }
            tmp_node = tmp_node.neste;
            teller++;
        }
    }
    //Denne skal gjøre det samme som taAv i stabel, så bruker samme kode.
    //Det står kanskje ikke direkte, men siden største element skal tas ut, og lsiten skal være fra
    //minst til størst, skal altså siste tas ut.
    public T fjern() {
        int sist = stoerrelse()-1;
        return fjern(sist);
    }
    //Disse metodene skal bare kaste en UnsupportedOperationException om de kalles på.
    public void sett(int pos, T x) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public void leggTil(int pos, T x) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
