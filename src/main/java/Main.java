import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().toLowerCase().charAt(0); //lower case to make line 13 shorter.

        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is an invalid input.");
        } else {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel.");
            // "else" here because I've already checked if it's a letter. Maybe something crazy would get                   through and ruin everything though, idk.
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }
    }
}