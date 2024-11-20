import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an Alphabetical Letter: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") ||  input.equals("e") ||  input.equals("i") ||
                 input.equals("o") ||  input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error. Input only a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("This letter is a Vowel");
        }
        else
        {
            System.out.println("This letter is a Consonant");
        }
    }
}

