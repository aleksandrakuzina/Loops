import java.util.Scanner;

public class MySecondClass {
// todo Найти решене: выход из данной ошибки
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("ВВедите пункт 1 - сложение, 2 - вычитание, " +
                "3- умножение. 4- деление   выход - 0");
        int b = 9;
        int c = 3;


        int a = scanner.nextInt();

               if (a == 1) {
                System.out.println(b + c);
            } else if (a == 2) {
                System.out.println(b - c);
            } else if (a == 3) {
                System.out.println(b * c);
            } else if (a == 4) {
                System.out.println(b / c);
            }  else if (a == 0) {
            break;
            } else {
                System.out.println("ошибка");
            };
        }




    }
}
