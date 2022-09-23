import java.util.Scanner;

public class Main {
    public static int calcFactorial(int a){
        int result = 1;
        for(int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();

        System.out.println("Factorial числа " + number + " " + "Равен " + calcFactorial(number));
    }
}

