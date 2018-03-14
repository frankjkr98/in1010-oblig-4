public class Pasient {

private String navn;
private String fnr;

private int id;
private static int teller = 0;

Stabel<Resept> rStabel = new Stabel<Resept>();

  Pasient(String navn, String fnr) {
    this.navn = navn;
    this.fnr = fnr;
    this.id = teller;
    teller++;
  }

  public int hentId() {
    return this.id;
  }

  public Stabel<Resept> hentStabel() {
    return rStabel;
  }

  public void leggTilResept(Resept r) {
    rStabel.leggPaa(r);

  }

}
