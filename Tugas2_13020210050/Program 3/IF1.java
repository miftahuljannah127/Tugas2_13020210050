// 13020210050, Miftahul Jannah, Sabtu, 25 Maret 2023
import java.util.Scanner;
public class IF1 {
    public static void main(String[] args) {
        Scanner masukan=new Scanner(System.in); 
        int a;
        System.out.print ("Contoh IF satu kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer : "); 
        a = masukan.nextInt();
        if (a >= 0)
        System.out.println ("\nNilai a positif "+ a);
    }

}
