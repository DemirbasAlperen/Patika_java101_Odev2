import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08 , kdvTutar1, kdvTutar2, kdvliTutar1, kdvliTutar2;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        System.out.println("KDV'siz Tutar : " + tutar);

        System.out.println("KDV Oranı : " + kdvOran1);
        System.out.println("KDV Oranı : " + kdvOran2);
        kdvTutar1 = tutar * kdvOran1;
        kdvTutar2 = tutar * kdvOran2;
        boolean kosul = tutar > 0 && tutar <= 1000 ;
        System.out.println("KDV Tutarı(Ücret Tutarı 1000 den Küçükse) : " + kdvTutar1);
        System.out.println("Kdv Tutarı(Ücret Tutarı 1000 den Büyükse) : " + kdvTutar2);
        kdvliTutar1 = tutar + kdvTutar1;
        kdvliTutar2 = tutar + kdvTutar2;
        System.out.println("KDV'li Tutar : " + (kosul ? kdvliTutar1 : kdvliTutar2));

    }
}
