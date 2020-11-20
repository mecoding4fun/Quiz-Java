//import scanner
import java.util.Scanner;

public class Quiz {

    //main method
    public static void main(String[] args) {
        //variable
        int choices;
        int song;
        int song2;
        int song3;
        int song4;
        int song5;

        //scanner for input options
        Scanner scan = new Scanner(System.in);
        System.out.println("Who sing this the song 'Locked Away':");

        //choose singer from these 4 options
        System.out.println("Choose 1 for R. City & Adam Levine's. \nChoose 2 for Justin Bieber.  \nChoose 3 for Selena Gomez. \nChoose 4 for Katy Perry.");
        song = scan.nextInt();


        if (song != 1) {
            //if select wrong options
            System.out.println("Your answer is incorrect  R. City & Adam Levine's is the right answer .");
        }

        {
            while (song == 1) {
                //selected right option
                System.out.println("Congrate you answer is correct");

                song++;
            }
            System.out.println();
        }


        System.out.println("Who sing this the song 'Beauty and the beast':");

        //choose singer from these 4 options
        System.out.println("Choose 1 for R. City & Adam Levine's. \nChoose 2 for Justin Bieber.  \nChoose 3 for Selena Gomez. \nChoose 4 for Katy Perry.");
        song2 = scan.nextInt();


        if (song2 != 2) {
            System.out.println("Your answer is incorrect  Justin Bieber is the right answer.");
        }

        {
            while (song2 == 2) {
                System.out.println("Congrate you answer is correct ");
                song2++;
            }
            System.out.println();
        }
        //name the singer of this song
        System.out.println("Who sing this the song 'Heal the world':");

        //choose singer from these 4 options
        System.out.println("Choose 1 for R. City & Adam Levine's. \nChoose 2 for Micheal Jackson.  \nChoose 3 for Selena Gomez. \nChoose 4 for Katy Perry.");
        song4 = scan.nextInt();


        if (song4 != 2) {
            System.out.println("Your answer is incorrect  Micheal Jackson is the right answer.");
        }

        {
            while (song4 == 2) {
                //display congrate message for right answer
                System.out.println("Congrate you answer is correct");
                song4++;
            }
            System.out.println();
        }

        //display Question
        System.out.println("Who sing this the song 'Roar':");

        //choose singer from these 4 options
        System.out.println("Choose 1 for R. City & Adam Levine's. \nChoose 2 for Justin Bieber.  \nChoose 3 for Selena Gomez. \nChoose 4 for Katy Perry.");
        song3 = scan.nextInt();


        if (song3 != 4) {
            //display congrate message for incorrect answer
            System.out.println("Your answer is incorrect  Katy Perry is the right answer.");
        }

        {
            while (song3 == 4) {
                //display congrate message for right answer
                System.out.println("Congrate you answer is correct");
                song3++;
            }
            System.out.println();
        }
        //name of a singer
        System.out.println("Who sing this the song 'The Heart Wants What It Wants ':");

        //choose singer from these 4 options
        System.out.println("Choose 1 for R. City & Adam Levine's. \nChoose 2 for Justin Bieber.  \nChoose 3 for Selena Gomez. \nChoose 4 for Katy Perry.");
        song5 = scan.nextInt();
        if (song5 != 3) {
            System.out.println("Your answer is incorrect  Salena Gomez is the right answer.");
        }
        {
            //using while loop
            while (song5 == 3) {
                //display congrats message for right answer
                System.out.println("Congrats you answer is correct");
                //stop repeating
                song5++;
            }  //stop repeating
            System.out.println();
        }
    }
}