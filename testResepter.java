class testResepter {

    public static void main(String[] args) {

        LegemiddelA a1 = new LegemiddelA("Morfin",300,1500,20);
        LegemiddelB b1 = new LegemiddelB("Blodfortynnende",500,2000,40);

        Lege l1 = new Lege();

        ReseptBlaa blaa1 = new ReseptBlaa(a1, l1, 1010, 5);
        ReseptP p1 = new ReseptP(b1, l1, 10, 9);
        ReseptMill m1 = new ReseptMill(a1, l1, 210, 78);

        System.out.println("Pris til blaa: " + blaa1.prisAaBetale());
		System.out.println("Pris til P: " + p1.prisAaBetale());
		System.out.println("Pris til Mill: " + m1.prisAaBetale());

        System.out.println();

        System.out.println("Farge til Mill: " + m1.farge());
        System.out.println("Farge til P: " + p1.farge());
        System.out.println("Farge til Blaa: " + blaa1.farge());


    }


}
