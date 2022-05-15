
package sayilarikucuktenbuyugesiralama;
import java.util.Scanner;
public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        
        /*
        Ödev
            Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
        */
        int a,b,c;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. sayıyı giriniz : ");
        a=scan.nextInt();
        
        System.out.println("2. sayıyı giriniz : ");
        b=scan.nextInt();
        
        System.out.println("3. sayıyı giriniz : ");
        c=scan.nextInt();
        
        if (a<b && a<c && b<c){
            System.out.println(a+"<"+b+"<"+c);
            System.out.println("a<b<c");
        }
        else if (a<b && a<c && b>c ){
            System.out.println(a+"<"+c+"<"+b);
            System.out.println("a<c<b");
        }
        
        else if (b<a && b<c && c>a){
            System.out.println(b+"<"+a+"<"+c);
            System.out.println("b<a<c");
        }
        
        else if(b<a && b<c && a>c){
            System.out.println(b+"<"+c+"<"+a);
            System.out.println("b<c<a");
        }
        else if (c<a && c<b && a>b){
            System.out.println(c+"<"+b+"<"+a);
            System.out.println("c<b<a");
        }
        else if (c<a && c<b && b>a){
            System.out.println(c+"<"+a+"<"+b);
            System.out.println("c<a<b");
        }
        
        else{
            System.out.println("eşitlik var kontrol ediniz lüffenn");}
    }
    
}
