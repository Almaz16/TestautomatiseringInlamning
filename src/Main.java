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

            switch (choice) {
                case 1:
                    System.out.print("Skriv in text: ");
                    String text = scanner.nextLine();
                    System.out.println("Morsekod: " + translator.toMorse(text));
                    break;

                case 2:
                    System.out.print("Skriv in morsekod (använd mellanslag mellan bokstäver och '/' för mellanrum): ");
                    String morse = scanner.nextLine();
                    System.out.println("Text: " + translator.fromMorse(morse));
                    break;

                case 3:
                    System.out.println("Avslutar programmet...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Felaktigt val, försök igen.");
            }
            System.out.println();
        }
    }
}
