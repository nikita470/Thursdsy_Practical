import java.util.Scanner;
public class Asdm
{
    public static void main(String args[])
  {
    int n1, n2, add, subtract, multiply;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    n1 = scanner.nextInt();
    n2 = scanner.nextInt();

    add = n1 + n2;
    subtract = n1 - n2;
    multiply = n1 * n2;
    devide = (float) n1 / n2;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
  }
}


