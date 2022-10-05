import java.util.Scanner;

public class odevKdv {
    public static void main(String[] args) {
        double kdvsiztutar, kdvlitutar,kdvtutarı ,kdvoranı1=0.18, kdvoran2 = 0.08;
        Scanner bilgi =new Scanner(System.in);
        System.out.print("Kdv siz tutarı giriniz");
        kdvsiztutar = bilgi.nextDouble();
        kdvtutarı = (kdvsiztutar>1000)? kdvsiztutar*kdvoranı1 : kdvsiztutar*kdvoran2;
        kdvlitutar =kdvtutarı+kdvsiztutar;

        System.out.println("Kdvsiz tutar :" +kdvsiztutar );
        System.out.println("Kdv tutarı: " +kdvtutarı );
        System.out.println("Kdvli toplam tutar : "+kdvlitutar);

    }
}
