import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) throws Exception {
        // Taking user inputs for number of subjects

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the number of subjects:");
        int no_sub= scanner.nextInt();

        //Taking user inputs for marks using an array

        int[] marks = new int[no_sub];

        int total=0;
        


        for(int i=0;i<no_sub;i++){
            System.out.printf("Enter the marks of subject" + (i+1) + "(out of 100) + :");
            marks[i]= scanner.nextInt();
             total = total+marks[i];
        }


    }
}
