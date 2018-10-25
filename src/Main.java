import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Welcome to Color Reader 2.0!");
        System.out.println("You will be able to check channels of maximum five colors.");
        System.out.println("Please insert color in form of the 32-bit integer or type 'exit' to exit the program.");


        String[] colors = new String[6];
        Scanner input = new Scanner(System.in);

        for (int i = 1; i<colors.length; i++){
            String textColor = input.next();

            if(textColor.equals("exit"))
                i = colors.length;

            else {
                int color = Integer.parseInt(textColor);
                colors[i] = "These are channels of color " + color + "\n" +
                        "A: " + ((color >> 24) & 0b11111111) + "\n" +
                        "R: " + ((color >> 16) & 0b11111111) + "\n" +
                        "G: " + ((color >> 8) & 0b11111111) + "\n" +
                        "B: " + (color & 0b11111111);

                System.out.println(colors [i]);

                if (i==5) {
                    System.out.println("You have checked channels of the color five times. Rerun the program to check more.");
                }
                else {
                    System.out.println("You can insert " + (5 - i) + " more colors, or type 'exit' to exit the program");
                }
            }
        }
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println();
        System.out.println("Thanks for using Color Reader 2.0 See you soon :)");
    }
}