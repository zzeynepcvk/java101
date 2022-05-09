
package kullanicigirisi;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String username="patika",password="java123",newpassword; 
        int answer; 
        
        Scanner scan = new Scanner(System.in); 
        Scanner scan1 = new Scanner(System.in);
        
        System.out.print("kullanıcı adını giriniz : ");
        username = scan.nextLine(); 
        System.out.print("şifrenizi giriniz : ");
        password = scan.nextLine(); 
        
        if(username.equals("patika")&& password.equals("java123")){
            System.out.print("tebrikler giriş başarılı ");
        
        }else {
            System.out.print("şifrenizi değiştirmek ister misiniz? \n 1-evet \n 2-hayır");
        
            answer = scan.nextInt();
        switch(answer){
            case 1:
                System.out.println("lütfen yeni şifreyi giriniz : ");
                        newpassword = scan1.nextLine(); 
                        
                        if (newpassword.equals("java123")){
                        System.out.println("yeni şifre eskisiyle aynı olamaz. Yeniden deneyin. ");
                        
                        }else{
                        System.out.println("şifre başarıyla değiştirildi. Yeni şifre : "+newpassword);
                        }
                break;        
                
            case 2:
                System.out.print("farklı şifre deneyiniz!");
                break; 
                }
        
        }
        
        }
       
        }
    

