class main {

    public static void main(String[] args) {

        //Definerer ulike objekter som skal brukes i testen
        LegemiddelA a1 = new LegemiddelA("Morfin",100,1500,20);
        LegemiddelA a2 = new LegemiddelA("Kokain",150,2000,30);

		    LegemiddelB b1 = new LegemiddelB("Blodfortynnende",1000,2000,40);
        LegemiddelB b2 = new LegemiddelB("Vann",100,3000,10);

        LegemiddelC c1 = new LegemiddelC("Saft",5000,200);
        LegemiddelC c2 = new LegemiddelC("Luft",40,90);
        LegemiddelC c3 = new LegemiddelC("Plaster",9900,20);

        Lege l1 = new Lege("Jon");

        Fastlege fast1 = new Fastlege("Hans", 23);
        //Fastlege fast2 = new Fastlege();

        ReseptBlaa blaa1 = new ReseptBlaa(a1, l1, 1010, 0);
        ReseptBlaa blaa2 = new ReseptBlaa(b1, fast1, 1010, 5);

        ReseptP p1 = new ReseptP(a2, l1, 10, 0);
        ReseptP p2 = new ReseptP(b2, fast1, 10, 9);

        ReseptMill m1 = new ReseptMill(c1, l1, 210, 78);
        ReseptMill m2 = new ReseptMill(c2, fast1, 210, 0);

        System.out.println(fast1.hentAvtalenummer());

        System.out.println();

        //Tester ut alt av info som kan hentes fra reseptene
        System.out.println("ID til blaa1: " + blaa1.hentId());
		System.out.println("Legemiddel til blaa1: " + blaa1.hentLegemiddel());
		System.out.println("Lege til blaa1: " + blaa1.hentLege());
        System.out.println("PasientID til blaa1: " + blaa1.hentPasientId());
		System.out.println("Reit til blaa1: " + blaa1.hentReit());
        System.out.println("Reit til blaa1: " + blaa1.hentReit());
		System.out.println("Bruk til blaa1: " + blaa1.bruk());
        System.out.println("Farge til blaa1: " + blaa1.farge());
		System.out.println("Pris Aa Betale til blaa1: " + blaa1.prisAaBetale());

        System.out.println();

        System.out.println("ID til blaa2: " + blaa2.hentId());
		System.out.println("Legemiddel til blaa2: " + blaa2.hentLegemiddel());
		System.out.println("Fastlege til blaa2: " + blaa2.hentLege());
        System.out.println("PasientID til blaa2: " + blaa2.hentPasientId());
		System.out.println("Reit til blaa2: " + blaa2.hentReit());
		System.out.println("Bruk til blaa2: " + blaa2.bruk());
        System.out.println("Farge til blaa2: " + blaa2.farge());
		System.out.println("Pris Aa Betale til blaa2: " + blaa2.prisAaBetale());

        System.out.println();

        System.out.println("ID til p1: " + p1.hentId());
		System.out.println("Legemiddel til p1: " + p1.hentLegemiddel());
		System.out.println("Lege til p1: " + p1.hentLege());
        System.out.println("PasientID til p1: " + p1.hentPasientId());
		System.out.println("Reit til p1: " + p1.hentReit());
        System.out.println("Reit til p1: " + p1.hentReit());
		System.out.println("Bruk til p1: " + p1.bruk());
        System.out.println("Farge til p1: " + p1.farge());
		System.out.println("Pris Aa Betale til p1: " + p1.prisAaBetale());

        System.out.println();

        System.out.println("ID til p2: " + p2.hentId());
		System.out.println("Legemiddel til p2: " + p2.hentLegemiddel());
		System.out.println("Fastlege til p2: " + p2.hentLege());
        System.out.println("PasientID til p2: " + p2.hentPasientId());
		System.out.println("Reit til p2: " + p2.hentReit());
		System.out.println("Bruk til p2: " + p2.bruk());
        System.out.println("Farge til p2: " + p2.farge());
		System.out.println("Pris Aa Betale til p2: " + p2.prisAaBetale());

        System.out.println();

        System.out.println("ID til m1: " + m1.hentId());
		System.out.println("Legemiddel til m1: " + m1.hentLegemiddel());
		System.out.println("Lege til m1: " + m1.hentLege());
        System.out.println("PasientID til m1: " + m1.hentPasientId());
		System.out.println("Reit til m1: " + m1.hentReit());
		System.out.println("Bruk til m1: " + m1.bruk());
        System.out.println("Farge til m1: " + m1.farge());
		System.out.println("Pris Aa Betale til m1: " + m1.prisAaBetale());

        System.out.println();

        System.out.println("ID til m2: " + m2.hentId());
		System.out.println("Legemiddel til m2: " + m2.hentLegemiddel());
		System.out.println("Fastlege til m2: " + m2.hentLege());
        System.out.println("PasientID til m2: " + m2.hentPasientId());
		System.out.println("Reit til m2: " + m2.hentReit());
		System.out.println("Bruk til m2: " + m2.bruk());
        System.out.println("Farge til m2: " + m2.farge());
		System.out.println("Pris Aa Betale til m2: " + m2.prisAaBetale());

    }

}
