import java.util.Scanner;
class GuessNum {
    public static void main(String[], args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100) + 1;
        do {
            System.out.println("Enter a number between 1 and 100:");
            int guessNum = sc.nextInt();

            if(num == guessNum) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if(num > guessNum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        } while(num>=0);
    }
}   