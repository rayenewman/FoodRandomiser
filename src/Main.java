import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.println("Pick your top 3 foods to eat ");
        System.out.println("Food 1: ");
        String food1 = sc.nextLine(); //reads string.
        System.out.println("Food 2: ");
        String food2 = sc.nextLine(); //reads string.
        System.out.println("Food 3: ");
        String food3 = sc.nextLine(); //reads string.

        Random rand = new Random();
        int value = rand.nextInt(2);

        if (value == 0) {
            System.out.println("Go with " + food1);
        } else if (value == 1) {
            System.out.println("Go with " + food2);
        } else if (value == 2) {
            System.out.println("Go with " + food3);
        }

    }

    }


