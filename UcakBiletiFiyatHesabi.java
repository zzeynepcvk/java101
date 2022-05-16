
package ucakbiletifiyathesabi;

import  java.util.Scanner;
public class UcakBiletiFiyatHesabi {

    public static void main(String[] args) {
        
        int age,km=0,type;
        double price=0 ;
        Scanner scan= new Scanner(System.in);
        
        System.out.println(" mesafeyi KM tipinde giriniz : ");
        km =scan.nextInt();
                
        System.out.println("Yaşınızı giriniz : ");
        age =scan.nextInt();
       
        System.out.println("gidiş yönünü seçiniz : \n 1:tek yön \n 2:gidiş-dönüş ");
        type = scan.nextInt(); 
        
        if (km>0){
            price =km*0.1;
        }else{
            System.out.println("mesafe değeri sıfırdan büyük olmalıdır ! ");
        }
        
        if (age>0){
            if(age<12){
            price-= price*0.5;
            }
            else if(age>=12 && age<=24){
            price-= price*0.1;    
            }
            else if (age>65){
            price -= price*0.3;
            }
        }    
            else {
                System.out.println("yaş değeri sıfırdan büyük olmalıdır !");
            }    
        
        switch (type){
            case 1: 
                
                break;
                
            case 2: 
                price -= price*0.2 ; 
                price *= 2;
                break;
        }
      
        System.out.println("ödeceğiniz tutar : "+price);
        
    }
    
}

/*
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
*/