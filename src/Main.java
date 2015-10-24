import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int i = 5;
        int a[] = new int[i];
        a[0] = 2;
        a[1] = 0;
        a[2] = 0;
        a[3] = 0;
        a[4] = 9;
        int counter = 0;
        for (i = 0; i < 5; i++) {
            {
                switch (a[i]) {
                    case (0):
                        ++counter;
                        System.out.println(counter);
                }
            }


        }
    }
}




