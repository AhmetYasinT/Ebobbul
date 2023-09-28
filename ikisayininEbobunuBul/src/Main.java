
import java.util.Scanner;


public class Main {
    
    public static int ebobubul(int sayi1 , int sayi2){
        
        int ebob = 1;
        
        for(int i = 1; i <= sayi1 && i<=sayi2; i++){
       
            if((sayi1 % i == 0) && (sayi2 % i ==0)){
            
                ebob = i;
            }
        }
        return ebob;
    }
    
    public static void main(String[] args){
    
        Scanner ss = new Scanner(System.in);
        
        System.out.println("Birinci Sayý Giriniz : ");
        int birinciSayi = ss.nextInt();
        
        System.out.println("Ýkinci Sayý Giriniz: ");
        int ikiciSayi = ss.nextInt();
        
        System.out.println("Ýki Sayýnýn Ebobu: " + ebobubul(birinciSayi, ikiciSayi));
    
    }
}
