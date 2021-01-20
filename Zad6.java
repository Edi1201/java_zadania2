import java.util.Scanner;
import java.util.Random;
public class Zad6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Podaj dlugosc hasla:");
        int ts_pass = sc.nextInt();
        System.out.println("1-Litery");
        System.out.println("2-Liczby");
        System.out.println("3-Znaki specjalne");
        System.out.println("Wybierz z czego ma sie skladac haslo:");
        int ts_option = sc.nextInt();
        int ts_number;
        String ts_pass2 = "";
        switch(ts_option){
            case 1:
                String ts_al = "abcdefghijklmnopqrstuvwxyz";
                for(int ts_i=0;ts_i<ts_pass;ts_i++){
                    ts_number = rand.nextInt(24);
                    ts_pass2 += ts_al.charAt(ts_number);
                }
                System.out.println(ts_pass2);
                break;
            case 2:
                String ts_nu = "123456790";
                for(int ts_i=0;ts_i<ts_pass;ts_i++){
                    ts_number = rand.nextInt(10);
                    ts_pass2 += ts_nu.charAt(ts_number);
                }
                System.out.println(ts_pass2);
                break;
            case 3:
                String ts_sp = "!@#$%^&*(){}|;'<>?";
                for(int ts_i=0;ts_i<ts_pass;ts_i++){
                    ts_number = rand.nextInt(19);
                    ts_pass2 += ts_sp.charAt(ts_number);
                }
                System.out.println("Twoje hasło to: "+ts_pass2);
                break;
            
        }
    }
}