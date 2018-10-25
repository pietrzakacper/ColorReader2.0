import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Welcome to Color Reader 2.0!");
        System.out.println("You will be able to check channels of maximum five colors.");
        System.out.println("Please insert color in form of the 32-bit integer or type 'exit' to exit the program.");


        String[] colors = new String[5];
        Scanner input = new Scanner(System.in);

        for (int j = 0; j<colors.length; j++){
            String textColor = input.next();

            if(textColor.equals("exit"))
                j = colors.length;

            else {
                int color = Integer.parseInt(textColor);

                colors[j] = "These are channels of color " + color + "\n" +
                        "A: " + ((color >> 24) & 0b11111111) + "\n" +
                        "R: " + ((color >> 16) & 0b11111111) + "\n" +
                        "G: " + ((color >> 8) & 0b11111111) + "\n" +
                        "B: " + (color & 0b11111111);

                for (int k = 0; k<j; k++){
                    System.out.println(colors[k]);
                }
                System.out.println(colors[j]);


                if (j==4) {
                    System.out.println("You have checked channels of the color five times. Rerun the program to check more.");
                }
                else {
                    System.out.println("You can insert " + (colors.length - (j+1)) + " more colors, or type 'exit' to exit the program");
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