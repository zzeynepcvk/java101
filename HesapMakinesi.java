
package hesapmakinesi;
import java.util.Scanner; 
public class HesapMakinesi {
    public static void main(String[] args) {
        
        int n1,n2,a; 
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("birinci sayıyı giriniz : ");
        n1 = scan.nextInt(); 
        
        System.out.print("ikinci sayıyı giriniz : ");
        n2 = scan.nextInt(); 
        
        System.out.println("yapmak istediğiniz işlemi seçin : \n 1-toplama\n 2-çıkarma\n 3-çarpma\n 4-bölme ");
        a = scan.nextInt();
        
        switch(a){
            case 1 : 
                System.out.println("soncunuz :"+(n1+n2));
                break;
            case 2 : 
                System.out.println("sonucunuz :"+(n1-n2));
                break; 
            case 3 : 
                System.out.println("sonucunuz :"+(n1*n2));
                break;
            case 4 :
                if (n2!=0)
                System.out.println("sonucunuz :"+(n1/n2));
                else
                    System.out.println("HATA! Bir sayı sıfıra bölünemez");
                break; 
            default : 
                System.out.println("hatalı seçim yaptınız. Tekrar deneyin!");
                break; 
                
        
        }
    }
}
