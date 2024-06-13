import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {

        


        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override

            public void run() {

                //creating questions and answers

        String[][] quiz = {

            {"What is the capital of France?","Berlin","Madrid","Paris","Rome"},
            {"What is the chemical symbol for water?","H2O","CO2","NO2","HCL"},
            {"Who wrote the play \"Romeo and Juliet\"?","William Shakespeare","Charles Dickens","J.K. Rowling","Mark Twain"},
            {"What is the largest planet in our solar system?", "Earth", "Mars", "Jupiter", "Saturn"},
            {"What is the square root of 64?", "6", "7", "8", "9"},
            {"Which country is known as the Land of the Rising Sun?", "China", "Japan", "South Korea", "Thailand"},
            {"Who is the author of the Harry Potter series?", "J.K. Rowling", "J.R.R. Tolkien", "Stephen King", "George R.R. Martin"},
            {"What is the smallest prime number?", "0", "1", "2", "3"},
            {"What is the capital city of Australia?", "Sydney", "Melbourne", "Brisbane", "Canberra"},
            {"Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Mercury"}
        

        };

        // displaying questions and answers
        
        for(int i=0;i<quiz.length;i++){
            System.out.println("Question " + (i+1) + ":" + quiz[i][0]);

            for(int j=1;j<=4;j++){
                System.out.println("Answer" + j + ":" + quiz[i][j]);
            }
            System.out.println("");
        }

        

    
    


            };

            

        
            
        };

        // allowing users to select answers

        Scanner scanner = new Scanner(System.in);

        int answer =scanner.nextInt();

        

        

        
    }
}
