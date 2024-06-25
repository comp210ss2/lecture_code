package comp210.L01.ex01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numSightings = scan.nextInt();

        String date = scan.next();
        String time = scan.next();
        String shape = scan.next();
        int duration = scan.nextInt();
        double latitude = scan.nextDouble();
        double longitude = scan.nextDouble();

        System.out.println(date);
        System.out.println(duration);
        System.out.println(latitude);
    }
}
