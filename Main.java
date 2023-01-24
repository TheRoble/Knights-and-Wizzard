// Part 3

public class Main {


    public static void main(String[] args) {
        //
        Knight rayden = new Knight("Rayden", 20, 21, 6.2, 45, 9, 5 );
        Knight rutherford = rayden.clone("Rutherford", 4, 6);
        Wizzard tuong = new Wizzard("Tuong", 20, 2000, 5.11, 45, 22, 14 );
        Wizzard luu = tuong.clone("Luu", 7, 8);
        Elf saahel = new Elf ("Saahel", 20, 325, 4.9, 45, 12, 15);
        Elf ashrafi = saahel.clone("Ashrafi", 10, 21);


    };

}
