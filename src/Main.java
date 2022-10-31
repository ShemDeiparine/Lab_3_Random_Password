import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Shem Deiparine");
        System.out.println("sdeipar1@umbc.edu");
        System.out.println("**************************************");

        System.out.println("Lab3: Random Password");
        System.out.println("**************************************");


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name ");
        String first = input.nextLine();

        System.out.println("Enter your last name and Press Enter");
        String last = input.nextLine();

        char first1 = first.charAt(first.length()-1);
        char first2 = Character.toUpperCase(first1);
        String first3 = String.valueOf(first2);
        System.out.println(first3);

        String last1 = last;
        String last2 = last1.substring(0,3);
        String last3 = last2.toLowerCase();

        int x = (int) (9 + Math.random() * 100);
        System.out.println("Your password is: " + first3 + x + last3);

        String y = first3.concat(x + last3 + "****");
        System.out.println("Your password after using concat: " + y);

        StringBuilder z = new StringBuilder(y);
        System.out.println("Your password after reverse: " + z.reverse());
    }
}
