import java.util.Scanner;

class Legesystem {

  public static void main(String[] args) {

    //Pasienter
    Pasient p1 = new Pasient("Jens Hans Olsen", "11111143521");
    Pasient p2 = new Pasient("Petrolina Swiq",  "24120099343");
    Pasient p3 = new Pasient("Sven Svendsen", "10111224244");
    Pasient p4 = new Pasient("Juni Olsen", "21049563451");

    //Legemidler
    LegemiddelA middela1 = new LegemiddelA("Predizol", 450, 75, 8);
    LegemiddelB middelb1 = new LegemiddelB("Paralgin Forte", 65, 400, 5);
    LegemiddelC middelc1 = new LegemiddelC("Placebo Pianissimo",  10, 0);
    LegemiddelC middelc2 = new LegemiddelC("Ibux", 240, 200);

    //leger
    Lege l1 = new Lege("Dr. Cox");
    Lege l2 = new Lege("Dr.  Wilson");
    Fastlege f1 = new Fastlege("Dr. House", 12345);
    Lege l3 = new Lege("Dr. Hillestad Lovold");

    //Resepter
    ReseptBlaa blaa1 = new ReseptBlaa(middela1, l1, p3, 3);
    ReseptBlaa blaa2 = new ReseptBlaa(middelc1, l3, p4, 10000);
    ReseptP prev1 = new ReseptP(middelb1, f1, p2, 5);
    ReseptMill mill1 = new ReseptMill(middelc2, l3, p4, 2);



    Scanner input = new Scanner(System.in);
    int avslutt = 1001;
    while (avslutt != 0) {
      System.out.println("Meny");
      System.out.println();
      System.out.println("1: Se fullstendig oversikt");
      System.out.println("2: Legg til nye elementer");
      System.out.println("3: Bruk gitt resept til pasient");
      System.out.println("4: Skriv ut statistikk");
      System.out.println("0: Avslutt");
      System.out.print("-> ");
      int inp = input.nextInt();
      if (inp == 1){
        return;
      }
      else if (inp == 2) {
        return;
      }
      else if (inp == 3) {
        return;
      }
      else if (inp == 4) {
        return;
      }
      else if (inp == 0) {
        return;
      }
      else {
        System.out.println("Tallet finnes ikke, prøv igjen.");
      }




      avslutt = inp;
    }
    input.close();
  }
}
