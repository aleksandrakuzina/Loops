import sun.font.DelegatingShape;

import java.util.Scanner;

public class MyFirstClass {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = -1;

        int b = (int) (Math.random() * 20);

        while (a != b) {
            System.out.println("vvedi 4islo");
            a = scanner.nextInt();
            if (a == b) {
                System.out.println("Gjm,tlf");
            } else if (a > b) {
                System.out.println("<");
            } else if (b > a) {
                System.out.println(">");
            }
        }


    }
}
        // write your code here
//        Scanner scanner = new Scanner(System.in);
//        double rnd = Math.random();
//        System.out.println(rnd);
//        int limit = 10;
//        int secret = (int) (rnd * limit);
//        System.out.println(secret);
//        while (true) {
//            System.out.println("Введите число");
//            int number = scanner.nextInt();
//            if (number > secret) {
//                System.out.println("Число меньше");
//            } else if (number < secret) {
//                System.out.println("Число больше");
//            } else {
//                System.out.println("Вы угадали");
//                break;
//            }
//        }


//        Scanner scanner = new Scanner(System.in);
//        int secret = 500;
//        int generated = (int) (Math.random() * 500);
//        System.out.println(generated);
//        while (true) {
//            System.out.println("Введите число");
//            int a = scanner.nextInt();
//            if (a > generated) {
//                System.out.println("Число меньше");
//            } else if (a < generated) {
//                 System.out.println("Число больше");
//            } else {
//                System.out.println("Верно");
//                break;
//            }
//        }
//
//    }
//
//
//}