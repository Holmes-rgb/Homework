/*
Luke Holmes
cs2100

This program takes an input of height in inches and converts it to a
measurement in feet and inches
 */

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        System.out.print("Your name? ");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();

        System.out.print("How tall are you in inches? ");
        Scanner h = new Scanner(System.in);
        double height = h.nextInt();
        double inches = height % 12.0;
        double feet = (height-inches) / 12.0;

        System.out.printf("%s is %d feet, %d inches tall", name, (int)feet, (int)inches);

    }

}
