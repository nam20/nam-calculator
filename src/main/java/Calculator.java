import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("연산자를 입력해주세요. ( +, -, *, / )  종료 : q");
            String operator = scan.next();
            if(operator.equals("q") || operator.equals("Q"))
                break;

            System.out.println("수를 입력해주세요.");
            double number1 = scan.nextDouble();
            System.out.println("수를 입력해주세요.");
            double number2 = scan.nextDouble();

            switch (operator) {
                case "+" -> System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                case "-" -> System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                case "*" -> System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                case "/" -> {
                    if(number2 == 0)
                        System.out.println("0으로 나눌 수 없습니다.");
                    else
                        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                }
                default -> System.out.println("연산자가 유효하지 않습니다.");
            }
            System.out.println();
        }
    }
}
