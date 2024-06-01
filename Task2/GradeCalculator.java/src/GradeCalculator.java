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

        //calculating average marks
        Double marks_avg=(double)total/(double)no_sub;


        //assigning grades

        String grade;

        if (marks_avg>=75) {
            grade="A";
        }
        else if (marks_avg<75 && marks_avg>=65) {
            grade="B";      
        }
        else if (marks_avg<65 && marks_avg>=55) {
            grade="C";      
        }
        else if (marks_avg<55 && marks_avg>=40) {
            grade="S";      
        }
        else{
            grade="F";
        }

        System.out.println("Total Marks :" + total);
        System.out.println("Average Marks :" + marks_avg);
        System.out.println("Grade :" + grade);



    }
}
