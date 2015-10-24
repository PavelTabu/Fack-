import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("вот тут шо-нибудь введи (цифру):");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){ // смотрит, шо ты ввёл в консоль
            case 1 : {
                System.out.println("option 1");
            }

            case 2 : {
                System.out.println("option 2");
            }
            default: {
                System.out.printf("Operation is not supported");
            }

        }
    }
}