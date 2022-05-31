import java.util.Scanner;

public class sayibulma {
    public static void main(String[] args){

        // 0'dan girilen sayıya kadar olan 3 ve 4'ün katı olan sayıların ortalamasını bulma

        int a, top1 = 0, top2 = 0, top3 =0;
        int sayac1 = 0, sayac2 = 0, sayac3 = 0;
        double ort;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        a = inp.nextInt();
        for (int i=1; i <= a; i++) {
            if ((i % 3) == 0 && (i % 4) != 0) {
                top1 += i;
                sayac1 ++;
            }else if ((i % 3) != 0 && (i % 4) == 0) {
                top2 += i;
                sayac2 ++;
            }else if ((i % 3) == 0 && (i % 4) == 0) {
                top3 += i;
                sayac3 ++;
            }
        }
        ort = (top1 + top2 + top3) / (sayac1 + sayac2 + sayac3);
        System.out.println("3 ve 4'un kati sayilarin ortalamasi : "+ ort);
    }
}
