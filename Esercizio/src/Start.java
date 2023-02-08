import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        int number = (int) (Math.random()*9+1);
        System.out.println("Welcome!");
        int i = 0;
        while (i<10){
            System.out.println("number: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.nextInt() == number){
                System.out.println("Congrats!");
                break;
            }
        }
    }
}
