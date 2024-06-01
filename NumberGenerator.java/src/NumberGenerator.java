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
            //System.out.println(rand_num);

            //getting user input
            System.out.printf("Enter a number between 0 to 100 :");
            Scanner scanner = new Scanner(System.in);
            int guessing_num = scanner.nextInt();

            //evaluating user guessings

            if (guessing_num>100 || guessing_num<0) {
                System.out.println("Wrong input");
                
            }
            else{
                if (guessing_num==rand_num){
                    System.out.println("Congratulations! your guessing is accurate.");
                    score=10;
    
                }
                
                else if (guessing_num-rand_num>9){
                    System.out.println("Too high, Try again");
                    score=0;
    
                }
                else if (rand_num-guessing_num>9){
                    System.out.println("Too low, Try again");
                    score=0;
                }else if (guessing_num-rand_num<10) {
                    System.out.println("So close, Try again");
                    score=5;
                    
                }
                else if (rand_num-guessing_num<10){
                    System.out.println("So close, Try again");
                    score=5;
                }

            }
            total_score = score + total_score;


        }

        System.out.println("Thank you for the participation, Your chances are almost over.");
        System.out.println("Your total score is:" + total_score);




        
    }
}

