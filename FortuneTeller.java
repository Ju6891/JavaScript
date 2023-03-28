Import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck that a freind will bring");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }

        
    }
}    