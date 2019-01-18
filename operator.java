import java.util.*;
public class operator {

    public static void main(String[] Strings) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter two operands: ");
    double firstnumber = s1.nextDouble();
    double secondnumber = s1.nextDouble();
   System.out.println("Enter an operator (+, -, *,/,%): ");
   char operator = s1.next().charAt(0);
   switch(operator)
    {
        case '+':
            Double sum = firstnumber + secondnumber;
            System.out.print("sum is " +sum);
            break;

        case '-':
            Double diff= firstnumber + secondnumber;
            System.out.print("difference is " +diff);
            break;

        case '*':
            Double mul= firstnumber * secondnumber;
            System.out.print("mutipication of numbers is :" +mul);
            break;

        case '/':
            Double div = firstnumber / secondnumber;
            System.out.print(+div);
            break;

        case '%':
            Double mod = firstnumber % secondnumber;
            System.out.print(+mod);
            break;

        // operator doesn't match any case constant (+, -, *, /)
        default:
          System.out.print("Error! operator is not correct");
    }
    }
}