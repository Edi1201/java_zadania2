import java.util.Scanner;
public class Zad5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Wpisz zdanie:");
        String ts_text = sc.nextLine();
        for(int i=0; i<ts_text.length(); i++) System.out.println(ts_text.charAt(i));
    }
}