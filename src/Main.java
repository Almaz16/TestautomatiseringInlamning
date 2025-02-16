import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MorseLogik translator = new MorseLogik();
        while (true) {
            System.out.println("Välj ett alternativ:");
            System.out.println("1. Text till morsekod");
            System.out.println("2. Morse till text");
            System.out.println("3. Avsluta");
            System.out.print("Ditt val: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // detta tar bort radbrytning


        }}}
