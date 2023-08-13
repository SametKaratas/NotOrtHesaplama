import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu girin :");
        mat = input.nextInt();
        System.out.print("Fizik notunzu girin :");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu girin :");
        kimya = input.nextInt();
        System.out.print("Turkce notunuzu girin :");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu girin :");
        tarih = input.nextInt();
        System.out.print("Muzik notunuzu girin :");
        muzik = input.nextInt();
        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6;
        boolean kosul1 = sonuc==61;
        boolean kosul2 = sonuc >=61;
        boolean gecmeDurumu = kosul1 || kosul2;
        System.out.println("Ortalamaniz :" +sonuc);
        String str = (gecmeDurumu) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(str);

    }
    
}
