import java.util.Random;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int userNum, randomNum;

    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number:");
    userNum = s.nextInt(); 

    randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated");
    playGame(userNum, randomNum);
  }

  static void playGame(int originalNum, int theNum) {
    System.out.println("Please guess a number between 0 and" + theNum);
    int userGuess;

    int guesses;

    guesses = 0;

    while (true) {
      Scanner guess = new Scanner(System.in);
      userGuess = guess.nextInt();

      guesses++;

      if (userGuess == theNum) {
        System.out.println("Great you Win!");
        System.out.println("It took you" + guesses + "guesses to get the number");
        break;
      }
      if (userGuess > theNum) {
        System.out.println("Number is too high, try a lower number");
      }
      if (userGuess < theNum) {
        System.out.println("Number is too low, try a higher number");
      }

    }
  }
}