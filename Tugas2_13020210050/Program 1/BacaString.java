/*13020210050, Miftahul Jannah, Sabtu, 25 Maret 2023*/
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

import javax.swing.*;
 
public class BacaString {
    public static void main(String[] args) throws IOException {
        String str;

        BufferedReader dataAIn = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print ("\nBaca string dan Integer: \n"); 
        System.out.print("masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.println ("String yang dibaca : "+ str);
    }
}
