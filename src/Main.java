import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("вот тут шо-нибудь введи (цифру):");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();  // смотрит, шо ты ввёл в консоль

        if (choise == 1) {
            System.out.println("option 1");
        }
        else if (choise == 2) {
            System.out.println("option 2");
        }
        else {
            System.out.printf("Operation is not supported");
        }

    }
}
