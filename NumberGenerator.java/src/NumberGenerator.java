import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) throws Exception {
        int score=0;
        int total_score=0;

        for(int i =0;i<3;i++){

            // generating random number bewteen 0 to 100

            Random random = new Random();
            int rand_num = random.nextInt(100);
            System.out.println(rand_num);

            //getting user input
            System.out.printf("Enter a number between 0 to 100 :");
            Scanner scanner = new Scanner(System.in);
            int guessing_num = scanner.nextInt();


        
    }
}
}
