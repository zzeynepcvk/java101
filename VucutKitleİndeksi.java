
package vucutkitleindeksi;

import java.util.Scanner; 

public class VucutKitleİndeksi {

    public static void main(String[] args) {
        
        int kilo; 
        double boy ;
        
        
        Scanner scan = new Scanner (System.in); 
        
        System.out.print(" santimetre cinsinden boyunuzu giriniz(virgül kullanın!) : ");
        
        boy = scan.nextDouble();
        
        System.out.print("kg cinsinden kilonuzu giriniz : ");
        
        kilo = scan.nextInt(); 
        
        double vki = boy/kilo*kilo; 
        
        System.out.println("vücut kitle indeksiniz :" +vki  ); 
        
        
    }
    
}
