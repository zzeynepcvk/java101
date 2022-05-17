
package artikyilhesaplama;
import java.util.Scanner;
public class ArtikYilHesaplama {

    public static void main(String[] args) {
        /*
        Artık Yıl Nedir?

        Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
        Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına
        29 Şubat’ın eklenmesi ile elde edilir.
        Bu örnekte girdiğimiz değerin artık yıl olup olmadığını hesaplıyoruz.
        */
        
        
        int year;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("hesaplamak istediğiniz yılı giriniz : ");
        year = sc.nextInt();
        
        if(year%4!=0 ){
            System.out.println(year+" : artık yıl değil ");
        }else if(year%100==0){
            if(year%400==0){
                System.out.println(year+" : artık yıl ");
            }else {
                System.out.println(year+" : artık yıl değil ");
            }
        }else {
            System.out.println(year+" : artık yıl ");
        }
          
                    
        
        
    }
    
}
