import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    log("How old are you?");
    int age = input.nextInt();

    /* Section 2 */
    int x = 5;
    if (x > 0) {
      log("True!");
    }
    if (x == 0) {
      log("True!");
    } else
      log("False!");

    /*
     * Test: make an if - else statement that checks if the age is 18 or above. If
     * it is then print out "You are beautiful!". If not (else), print
     * "You are so cute!".
     */
    if (age >= 18) {
      log("You are beautiful!");
    } else
      log("You are so cute!");

    /* Make sure to close the scanner */
    input.close();

  }

  public static void log(Object message) {
    System.out.println(message);
  }

}