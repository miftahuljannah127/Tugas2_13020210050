// 13020210050, Miftahul Jannah, Sabtu, 25 Maret 2023
import java.util.Scanner;
public class PrintXWhile {
    public static void main(String[] args) {
    int Sum;
    int x;
    Scanner masukan=new Scanner(System.in);
    Sum = 0;
    System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
    x = masukan.nextInt();
    while (x != 999){ 
        Sum = Sum + x;
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();/* First Elmt*/
    }
        System.out.println("Hasil penjumlahan = "+ Sum);
    }
}