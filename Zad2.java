import java.util.Scanner;
public class Zad2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imie:");
        String ts_name = sc.nextLine();
        System.out.print("Podaj nazwisko:");
        String ts_surname = sc.nextLine();
        System.out.println("Podaj imie:");
        System.out.println("Imie ma:"+ ts_name.length() + " a Nazwisko ma:"+ ts_surname.length()+" znaków");
        
        
	}
}