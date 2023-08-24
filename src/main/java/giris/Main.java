package giris;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

       Scanner input=new Scanner(System.in);
        System.out.print("Matamatik dersinin notunu giriniz:");
        mat=input.nextInt();

        System.out.print("Fizik dersinin notunu giriniz:");
        fizik=input.nextInt();

        System.out.print("Kimya dersinin notunu giriniz:");
        kimya=input.nextInt();

        System.out.print("Türkçe dersinin notunu giriniz:");
        turkce=input.nextInt();

        System.out.print("Tarih dersinin notunu giriniz:");
        tarih =input.nextInt();

        System.out.print("Müzik dersinin notunu giriniz:");
        muzik=input.nextInt();

        double sonuc= (mat+fizik+kimya+turkce+tarih+muzik)/6.0;

        System.out.println("Not Ortalaması:"+sonuc);

        boolean gecti= sonuc>60;
        String nihai= gecti ? "Not ortalamanız 60'tan yüksek. Tebrikler Sınıfı Geçtiniz" : "Not ortalamanız 60'tan düşük. Sınıfta kaldınız.";

        System.out.println(nihai);









    }
    }
