
package kdvhesaplayanprogram;
import java.util.Scanner;
public class KdvHesaplayanProgram {
    public static void main(String[] args) {
        
        double tutar,kdvTutar,kdvliTutar;
        Scanner scan = new Scanner(System.in);
        System.out.print ("tutar giriniz : ");
        tutar = scan.nextDouble();
        
        double kdvOran = (tutar > 1000) ? 0.08 : 0.18;
        
        kdvTutar = tutar*kdvOran ; 
        kdvliTutar = tutar+kdvTutar ; 
        
        System.out.println("Tutar:"+tutar);
        System.out.println("Kdv Oranı:"+kdvOran);
        System.out.println("Kdv Tutarı:"+kdvTutar);
        System.out.println("Kdvli Tutar"+kdvliTutar);
        
        
    }
    
}
