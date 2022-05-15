
package sicakligagoreetkinlikonerme;

import java.util.Scanner;
public class SicakligaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        
        /*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
        
        int derece ;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("sıcalık değerini giriniz : ");
        
        derece = scan.nextInt();
         
        if (derece>25){
            System.out.println("yüzmeye gidebilirsiniz :)");
           
        }else if(derece<25 && derece>15){
            System.out.println("piknik yapabilirsiniz :) ");
        }
        else if(derece<15 && derece>5){
            System.out.println("sinemaya gidebilirsiniz :) ");
        }
        else {
            System.out.println("kayak yapabilirsinizzz :) ");
        }
    }
    
}
