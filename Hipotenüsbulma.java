
package hipotenüsbulma;
import java.util.Scanner;
public class Hipotenüsbulma {
    public static void main(String[] args) {
        
        int k1,k2;
        double h;
        Scanner scan = new Scanner (System.in);
        System.out.print ("birinci kenarın uzunluğunu giriniz : ");
        k1 = scan.nextInt();
        System.out.print ("ikinci kenarın uzunluğunu giriniz : ");
        k2 = scan.nextInt();
        
        h = Math.sqrt ((k1*k1)+(k2*k2));
        
        System.out.println("hipotenüs değeri : "+h);
        
        
        
        
                
                
        
        
        
        
    }
}
