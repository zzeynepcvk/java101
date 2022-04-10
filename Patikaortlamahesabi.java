/*Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav
puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev

Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...*/


package patikaortlamahesabi;
import java.util.Scanner ;
public class Patikaortlamahesabi {
  
    public static void main(String[] args) {
        
        int mat,fizik,kimya,turkce,tarih,muzik;
        
        Scanner scan = new Scanner (System.in);
         
        System.out.println("matematik notunu giriniz: ");
        mat = scan.nextInt();
        
        System.out.println("fizik notunu giriniz: ");
        fizik = scan.nextInt();
        
        System.out.println("kimya notunu giriniz: ");
        kimya = scan.nextInt();
        
        System.out.println("türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();
        
        System.out.println("tarih notunuzu giriniz: ");
        tarih = scan.nextInt();
        
        System.out.println("müzik notunuzu giriniz:");
        muzik = scan.nextInt();
        
        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc = toplam / 6 ;
        
        System.out.println("ortalamanız: " + sonuc); 
            
        String ortalama = (sonuc >70)? "geçti" : "kaldı";
        System.out.println (ortalama); 
        
    }
    
}
