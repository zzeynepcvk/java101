
package sinifigecmedurumu;
import java.util.Scanner;
public class SinifiGecmeDurumu {
    
    
/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

    public static void main(String[] args) {
        int mat,turkce,fizik,kimya,muzik;
        double avarage = 0 ;
        int sayac = 0 ;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("matematik notunu giriniz : ");
        mat = scan.nextInt();
        
        if (mat>0 && mat<100){
        sayac++;
        
        }else {
        mat=0;
        
        }
        System.out.println("fizik notunu giriniz : ");
        fizik = scan.nextInt();
        
        if (fizik>0 && fizik<100){
        sayac++;
        
        }else {
        fizik=0;
        
        }
        System.out.println("türkçe notunu giriniz : ");
        turkce = scan.nextInt();
        
        if (turkce>0 && turkce<100){
        sayac++;
        
        }else {
        turkce=0;
        
        }
        System.out.println("kimya notunu giriniz : ");
        kimya = scan.nextInt();
        
        if (kimya>0 && kimya<100){
        sayac++;
        
        }else {
        kimya=0;
        
        }
        System.out.println("müzik notunu giriniz : ");
        muzik = scan.nextInt();
        
        if (muzik>0 && muzik<100){
        sayac++;
        
        }else {
        muzik=0;
        
        }
        avarage = (mat+turkce+fizik+kimya+muzik)/sayac;
        
        if (avarage<55){
            System.out.println("kaldınız");
        }else{
            System.out.println("tebrikler geçtiniz.");
                
        }
      
         System.out.println("ortalamanız : "+avarage);
    }
    
}
