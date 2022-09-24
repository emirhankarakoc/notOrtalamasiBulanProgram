import java.util.*;



public class Main {
    public static void main(String[] args) {
int mat,fizik,tarih,kimya,turkce;
double muzik;
Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik dersinin notunu giriniz.");
mat = scanner.nextInt();
        System.out.println("Fizik dersinin notunu giriniz.");
fizik = scanner.nextInt();
        System.out.println("Tarih dersinin notunu giriniz.");
tarih = scanner.nextInt();
        System.out.println("Kimya dersinin notunu giriniz.");
kimya = scanner.nextInt();
        System.out.println("Turkce dersinin notunu giriniz.");
turkce=scanner.nextInt();
        System.out.println("Muzik dersinin notunu giriniz.");
muzik=scanner.nextDouble();
        double ortalama = (mat+fizik+tarih+kimya+turkce+muzik)/6;
        boolean ortalama1 = (ortalama>=60) ;
            String sonuc = ortalama1 ? ("Sinifi gecti") : ("Sinifta kaldi");
            System.out.println(sonuc);

    }

}
