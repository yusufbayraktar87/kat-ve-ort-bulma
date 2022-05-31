import java.util.Scanner;

public class sayibulma {
    public static void main(String[] args){

        // 0'dan girilen sayıya kadar olan 3 ve 4'ün katı olan sayıların ortalamasını bulma

        int a, top = 0, sayac = 0;
        double ort;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        a = inp.nextInt();
        for (int i=1; i <= a; i++) {
            if ((i % 3) == 0 && (i % 4) != 0) {
                top += i;
                sayac ++;
            }else if ((i % 3) != 0 && (i % 4) == 0) {
                top += i;
                sayac ++;
            }else if ((i % 3) == 0 && (i % 4) == 0) {
                top += i;
                sayac ++;
            }
        }
        ort = top / sayac;
        System.out.println("3 ve 4'un kati sayilarin ortalamasi : "+ ort);
    }
}
