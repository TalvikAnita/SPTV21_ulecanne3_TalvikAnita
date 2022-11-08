
package sptv21_ulesanne3_talvikanita;

import java.util.Scanner;

public class SPTV21_Ulesanne3_TalvikAnita {

    public static void main(String[] args) {
        System.out.println("Введите имя, фамилию и свой личный код");
            Scanner scanner_name = new Scanner(System.in);
            String firstName = scanner_name.nextLine();
            Scanner scanner_lastname = new Scanner(System.in);
            String secondName = scanner_lastname.nextLine();
            System.out.println(secondName+" "+firstName);
    }
    
}
