import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //instantiering og test af trekanter
       /* Triangle triangle1 = new Triangle(4,4,4);
        Triangle triangle2 = new Triangle(5,5,8);
        Triangle triangle3 = new Triangle(6,8,12);
        Triangle triangle4 = new Triangle(4,5,10);

        //test af de forskellige trekanter
        System.out.println(triangle1);
        System.out.println("Triangle1 says: "+triangle1.getType()+"\n");

        System.out.println(triangle2);
        System.out.println("Triangle2 says: "+triangle2.getType()+"\n");

        System.out.println(triangle3);
        System.out.println("Triangle3 says: "+triangle3.getType()+"\n");

        System.out.println(triangle4);
        System.out.println("Triangle4 says: "+triangle4.getType()+"\n");*/

        //nu laver vi vores egen trekant fra bunden
        System.out.println("Welcome to the big league kid! Here we build our own triangles, and I don't mean those they have in Egypt.\n");//jeg er godt klar at det ikke er trekanter Ægypten er kendt for.
        Scanner input = new Scanner(System.in);
        boolean goAgain = true;
        while (goAgain == true) {
            System.out.println("First off, we'll need the length of the first side.");
            int a = input.nextInt();
            System.out.println("Then we'll need the length of the second side.");
            int b = input.nextInt();
            System.out.println("And lastly - that's right you guessed it! - we'll need the length of the third side.");
            int c = input.nextInt();

            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Now we'll see whether you have messed up or made a great triangle!\n");
            System.out.println(triangle.getType());
            System.out.println("If you want to stop now, just type 'quit', otherwise we'll keep going.");
            String wantToQuit = null;
            input.nextLine();//hvis ikke denne linje er der, skipper den at modtage input
            wantToQuit = input.nextLine();
            if (wantToQuit.equals("quit")){
                goAgain = false;
            }
        }

        System.out.println("\nThanks for participating kid, I like the cut of your jib.");
    }
}
