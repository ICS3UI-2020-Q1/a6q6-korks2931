import java.util.Scanner;
/**
 *This program will show the Fibonacci sequence of a number
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
   // ask the user to enter a number to find 
    System.out.println("What Fibonacci number would you like to find?");
    // the user will enter the number 
    int userNumber = input.nextInt();
    int[] numbers = new int[userNumber];
    
    numbers[0] = 1;
    numbers[1] = 1;
    // make a for loop 
    for(int i = 2; i < userNumber; i++){
      numbers[i] = numbers[i-1] + numbers[i-2];
    }
     
     //tell the user the Fibonacci numbers 
    System.out.println("The " + userNumber + " Fibonacci number is " + numbers[userNumber - 1]);
    

    

    }
    
  }

