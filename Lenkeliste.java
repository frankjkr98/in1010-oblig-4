class Lenkeliste<T> implements Liste<T> {

    //Definerer hode og hale til lenkelisten (start og slutt)
    //Den er protected siden jeg skal bruke de i sub-klassene.
    protected Node hode;
    protected Node hale;

    //Lager en klasse node som skal holde på elementene og som skal
    //koble sammen med andre noder, som er måten jeg lager lenkelisten.
    //den må også være protected pga. den brukes i sub-klassene.
    protected class Node {
        //Definerer pekerne til node
        Node neste;
        Node forrige;
        //Definerer elementet som Node skal holde på
        T ting;

        Node(T x) {
            ting = x;
        }
    }
/*
    private class LenkelisteIterator<T> implements Iterator<T> {

      public boolean hasNext() {
        for (T x : Lenkeliste<T>) {
            return true;
          }
          return false;
        }
      }

      public T next() {
        if (hasNext == true) {
          return e;
        }
      }
    }
*/
    public void iterator() {
      
      //return new LenkelisteIterator();
    }

    //Metoden skal gå gjennom lenkelisten og telle opp hver gang tmp_node øker.
    //Når den finner sluttnoden returnerer den antallet den har telt opp.
    public int stoerrelse() {
        Node tmp_node = hode;
        int teller = 0;
        //Løkka går gjennom helt til tmp treffer halen.
        while (tmp_node != null) {
            teller++;
            tmp_node = tmp_node.neste;
        }

        return teller;
    }

    //metoden leggTil skal tainn en posisjon og legge en ny node inn i den posisjonen.
    //Noden som holdt den posisjonen skal bli flyttet til høyre som med alle
    //andre noder til høyre for den nye i listen.
    public void leggTil(int pos, T x) throws UgyldigListeIndeks {
        Node tmp_node = hode;
        int teller = 0;

        //Om listen er tom og vi prøver å legge inn i første posisjon skal denne kjøres.
        if (hode == null && pos == 0) {
            hode = new Node(x);
            hale = hode;
            //Lager en ny node som både hode og hale peker på, dermed vet vi at listen
            //bare har ett element.
            return;
        }
        //Om du f.eks. har en liste med 4 elementer og du prøver å legge inn i posisjon 4,
        //skal denne kjøre og bli den nye halen.
        else if (pos == stoerrelse()) {
            Node ny_node = new Node(x);
            ny_node.forrige = hale;
            hale.neste = ny_node;
            hale = ny_node;
            return;
        }
        //Dersom pos ikke er lik noen av indeksene kjøres denne.
        if(pos < 0 || pos >= stoerrelse()) {
            throw new UgyldigListeIndeks(pos);
        }

        //Her går jeg gjennom alle noder helt til den treffer halen.
        while (tmp_node != null) {
            //Om teller treffer argumentet går den inn i if-setningen.
            //Hvis ikke blir tmp til neste-tmp og teller øker.
            if (teller == pos) {
                //Om den første noden skal byttes ut kjøres denne.
                if (tmp_node == hode) {
                    Node ny_node = new Node(x);
                    ny_node.neste = hode;
                    ny_node.forrige = null;
                    hode.forrige = ny_node;
                    hode = ny_node;
                    //Her blir ny_node til det nye hodet, og det forrige hodet får nå pos(1)
                    return;
                }
                //Om tmp er en virkårlig node etter hodet kjøres denne.
                Node ny_node = new Node(x);
                ny_node.forrige = tmp_node.forrige;
                tmp_node.forrige.neste = ny_node;
                tmp_node.forrige = ny_node;
                ny_node.neste = tmp_node;
                //Her byttes plassen til tmp med den nye noden og tmp flyttes til høyre.
                return;
            }
            tmp_node = tmp_node.neste;
            teller++;
        }
    }

    //LeggTil her skal legge til et element videre i lista, dersom den er tom lager den
    //en node der hode og hale peker på den.
    public void leggTil(T x) throws UgyldigListeIndeks {
        //Denne kjøres om lista er tom
        if (hode == null) {
            hode = new Node(x);
            hale = hode;
            return;
        }
        //denne kjøres om den ikke er tom og legger til noden som den nye siste noden.
        Node siste = new Node(x);
        siste.forrige = hale;
        hale.neste = siste;
        hale = hale.neste;
        return;
        }

    //Sett skal bytte elementet med en node på en virkårlig posisjon.
    public void sett(int pos, T x) {
        Node tmp_node = hode;
        int teller = 0;

        //Dersom pos ikke er lik noen av indeksene kjøres denne.
        if(pos < 0 || pos >= stoerrelse()) {
            throw new UgyldigListeIndeks(pos);
        }
        //While løkka skal finne noden, om den finner den bytter den "tingen"
        //til tmp med argumentet x
        while (tmp_node != null) {
            if (teller == pos) {
                tmp_node.ting = x;
                return;
            }
            tmp_node = tmp_node.neste;
            teller++;
        }
    }

    //Metoden hent skal finne en node og hente elementet uten å ta den ut av lista.
    public T hent(int pos) throws UgyldigListeIndeks {
        Node tmp_node = hode;
        int teller = 0;

        //Dersom pos ikke er lik noen av indeksene kjøres denne.
        if(pos < 0 || pos >= stoerrelse()) {
            throw new UgyldigListeIndeks(pos);
        }
        //Den samme while-løkka som går gjennom lista
        //Om den finner noden skal den returnere elementet til tmp.
        while (tmp_node != null) {
            if (teller == pos) {
                return tmp_node.ting;
                }
            tmp_node = tmp_node.neste;
            teller++;
            }

        return null;
    }

    //Metoden fjern(pos) skal fjerne en node på en virkårlig posisjon.
    public T fjern(int pos) throws UgyldigListeIndeks {
        Node tmp_node = hode;
        int teller = 0;

        //Dersom pos ikke er lik noen av indeksene kjøres denne.
        if(pos < 0 || pos >= stoerrelse()){
            throw new UgyldigListeIndeks(pos);
        }
            //Her bruker jeg samme while-løkke som sjekker hele lista som i leggTil
            while (tmp_node != null) {
                if (teller == pos) {
                    //Igjen, om tmp er første node i lista, kjøres denne.
                    if (tmp_node == hode) {
                        hode = tmp_node.neste;
                        tmp_node.neste = null;
                        return tmp_node.ting;
                        //Her sier jeg at noden i pos(1) blir nye hodet og tmp mister sin peker
                        }
                        //Om tmp er siste node kjøres denne.
                    else if (tmp_node == hale) {
                        hale = tmp_node.forrige;
                        tmp_node.forrige = null;
                        hale.neste = null;
                        return tmp_node.ting;
                        //Her sier jeg at tmp sin forrige blir den nye siste noden og fjerner forrige-pekern til tmp.
                    }
                    else {
                        //Om tmp er hvilken som helst node i mellom hode og hale kjøres denne.
                        Node neste_node = tmp_node.neste;
                        Node forrige_node = tmp_node.forrige;
                        forrige_node.neste = tmp_node.neste;
                        neste_node.forrige = tmp_node.forrige;
                        tmp_node.neste = null;
                        tmp_node.forrige = null;
                        return tmp_node.ting;
                        //Her kobler jeg tmp sin forrige og neste med hverandre og fjerner tmp sine pekere
                        }
                    }
                tmp_node = tmp_node.neste;
                teller++;
                }
            return null;
        }

    //Metoden fjern skal fjerne det første elementet i lista
    public T fjern() {
        //Jeg kaller bare på fjern med 0 som posisjon som er den første i lista.
        T fjernet = fjern(0);
        return fjernet;
    }
}
