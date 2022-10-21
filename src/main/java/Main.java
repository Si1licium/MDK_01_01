import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number;
        int ns;
        int nsnumb;
        System.out.println("In what number system is the number?");
        nsnumb = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a number: ");
        number = Long.parseLong(sc.nextLine(), nsnumb);
        System.out.println("Enter the number system: ");
        ns = sc.nextInt();
        System.out.println("The resulting number " + Long.toString(number, ns));
    }
}
