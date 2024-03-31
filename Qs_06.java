import java.util.*;
class Student{
    Scanner sc = new Scanner(System.in);
    int n;
    int[][] arr;
    int[] avg;

    void EntryScores(){
        System.out.print("Enter the number of students : ");
        n = sc.nextInt();
        arr = new int[n][5];
        System.out.println("Exam Scores :- \n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    void DisplayScores(){
        avg = new int[n];
        for(int i = 0; i < n; i++){
            double sum = 0;
            for(int j = 0; j < 5; j++){
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.print("--> " + sum/5.0);
            avg[i] = (int) (sum/5.0);
            System.out.println();
        }
        int max = Arrays.stream(avg).max().orElseThrow();
        System.out.println("Highest average score = " + max);
    }
}
public class Qs_06 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.EntryScores(); stu.DisplayScores();
    }
}