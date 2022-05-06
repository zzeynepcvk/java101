
package manavkasaprogrami;

import java.util.Scanner; 

public class ManavKasaProgrami {

    public static void main(String[] args) {
        
        double armut=2.14, elma=3.67,domates =1.11, muz =0.95, patlican =5.00;
        
        Scanner scan = new Scanner (System.in); 
        
        int a,e,d,m,p;
        
        System.out.print("kaç kilo armut? : ");
        a = scan.nextInt();
        System.out.print("kaç kilo elma? : ");
        e = scan.nextInt(); 
        System.out.print("kaç kilo domates? : ");
        d = scan.nextInt(); 
        System.out.print("kaç kilo muz? : ");
        m = scan.nextInt(); 
        System.out.print("kaç kilo patlıcan? : ");
        p = scan.nextInt(); 
        
        double sonuc = armut*a + elma*e + domates*d + muz*m + patlican*p; 
        
        System.out.println ("toplam tutar : " + sonuc); 
        
    }
    
}
