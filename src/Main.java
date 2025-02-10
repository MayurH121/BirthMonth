import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your birth month [1-12]");
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        }
        else {
            System.out.println("You entered an incorrect month value: " +birthMonth);
        }
    }
}