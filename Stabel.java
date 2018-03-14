class Stabel<T> extends Lenkeliste<T> {

    //LeggPaa skal legge til element til slutten av listen, akkurat som leggTil
    //i Lenkeliste, så jeg bare kaller på leggTil med x som argument.
    public void leggPaa(T x) {
        leggTil(x);
    }

    //I taAv bruker jeg bare fjern fra Lenkeliste derjeg tar til meg siste indeks
    //som argument.
    public T taAv() {
        int sist = stoerrelse()-1;
        return fjern(sist);
    }
}
