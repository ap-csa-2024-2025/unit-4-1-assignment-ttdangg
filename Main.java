import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // int num = 0;
    // int sum = 0;

    // Problem 1
    // System.out.println("Enter any numbers (Enter -1 to stop): ");
    
    // while (num != -1)
    // {
    //   num = sc.nextInt();
    //   sum += num ;
    // }
    // sum ++;
    // System.out.println("Sum: " + sum);


    // Problem 2
    boolean firstNum = true;
    int max = Integer.MIN_VALUE; 

    int input = 0;

    System.out.println("How many numbers do you want to input: ");
    int count = sc.nextInt(); 

    System.out.println("Enter the scores: ");
    int i = 0; 

    while (i < count)
    {
      if (firstNum || input > max){
        max = input;
        firstNum = false;
      }

      i++;
    }
    System.out.println("The max is " + max);


  }
}
