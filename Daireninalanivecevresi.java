
package daireninalanivecevresi;
import java.util.Scanner;

public class Daireninalanivecevresi {

    public static void main(String[] args) {
         
       double r,pi=3.14;
       
       Scanner scan = new Scanner (System.in);
       
       System.out.print("yarıçap değerini girin : ");
         r = scan.nextDouble();
       
        double alan = pi*r*r; 
       
        double cevre = 2*pi*r; 
       
       System.out.println ("alan : " +alan  ); 
       
       
       System.out.println ("çevre : "+ cevre); 
       
      
       
       
    }
    
}
