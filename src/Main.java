import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       System.out.println("Введите первое число");
       int first_number = new Scanner (System.in).nextInt();
       System.out.println("Введите второе число");
       int second_number = new Scanner (System.in).nextInt();
       int a = first_number + second_number;
       int b = first_number - second_number;
       int c = first_number * second_number;
       double d = (double) first_number/second_number;
       System.out.println( "Сумма:" + a );
        System.out.println( "Разница:" + b );
        System.out.println( "Произведение:" + c );
        System.out.println( "Частное:" + d );
    }
}