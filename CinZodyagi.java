
package cinzodyagi;
import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        /*
        Çin Zodyağı nedir?

        4000 bin yıldır kullanılan bir astroloji çeşididir
        Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. 
        Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde)
        sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
        */
        
        int year,mod;
        String sign ="";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("lütfen doğduğunuz yılı giriniz : ");
        year = sc.nextInt();
        
        mod=year%12;
        
        switch(mod){
            case 0: 
                sign="maymun";
                break;
            case 1:
                sign="horoz";
                break;
            case 2:
                sign="köpek";
                break;
            case 3:
                sign="domuz";
                break;
                
            case 4 :
                sign="fare";
                break;
                
            case 5:
                sign="öküz";
                break;
                
            case 6:
                sign="kaplan";
                break;
                
            case 7:
                sign="tavşan";
                break;
            case 8:
                sign="ejderha";
                break;
            case 9:
                sign="yılan";
                break;
            case 10:
                sign="at";
                break;
            case 11:
                sign="koyun";
                break;
             
        }
        
        System.out.println("zodyak burcunuz : "+ sign);
    }
    
}
