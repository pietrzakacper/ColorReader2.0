import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Welcome to Color Reader 2.0!");
        System.out.println("You will be able to save channels of maximum five colors.");
        System.out.println("Please insert color in form of the 32-bit integer or type 'exit' to exit the program.");

        int[] colors = new int[5];
        int colorsCount = 0;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Type color number " + (colorsCount+1) + ": ");
            String textColor = input.next();

            if(textColor.equals("exit")) {
                break;
            }

            colors[colorsCount] = Integer.parseInt(textColor);
            colorsCount++;

            for(int i=0; i<colorsCount; i++) {
                System.out.println((i + 1) + ". Color: " + colors[i]);
                System.out.println("\tA: " + ((colors[i] >> 24) & 0b11111111));
                System.out.println("\tR: " + ((colors[i] >> 16) & 0b11111111));
                System.out.println("\tG: " + ((colors[i] >> 8) & 0b11111111));
                System.out.println("\tB: " + (colors[i] & 0b11111111));
            }

            colorsCount %= colors.length;
        }

        System.out.println(".\n.\n.\n.\n");
        System.out.println("Thanks for using Color Reader 2.0 See you soon :)");

        input.close();
    }
}