import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Необходимо ввести два числа и знак операции (‘+’, ‘-’, ‘*’ или ‘/’).");
        System.out.print("Введите первое число:   ");
        int a = in.nextInt();
        System.out.print("Введите второе число:   ");
        int b = in.nextInt();
        System.out.print("Введите знак операции:  ");
        String op = in.next();
        if (1 != op.length()) {
            System.out.println("Операция \"" + op + "\" не поддерживается!");
            return;
        }

        int res;
        switch(op.charAt(0)) {
        case '+':
            res = a + b;
            break;

        case '-':
            res = a - b;
            break;

        case '*':
            res = a * b;
            break;

        case '/':
            if (0 == b) {
                System.out.println("Делитель не должен быть равен нулю!");
                return;
            }
            res = a / b;
            break;

        default:
            System.out.println("Операция \"" + op + "\" не поддерживается!");
            return;
        }

        System.out.println("Результат операции = " + res);
    }
}