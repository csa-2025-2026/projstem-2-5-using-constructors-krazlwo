import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Problem 1\n");

    Circle c1 = new Circle(10.1);
    Circle c2 = new Circle(14.0);
    Circle c3 = new Circle(20.5);

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());

      System.out.println("Problem 2\n");
    double lengthwidth;
    double length;
    double width;
 //  Rectangle rectangle1;
  //  Rectangle rectangle2;

    System.out.println("Give # for length and width");
    lengthwidth = scan.nextDouble();

    System.out.println("Give # for length");
    length = scan.nextDouble();

    System.out.println("Give width");
    width = scan.nextDouble();

    Rectangle rectangle1 = new Rectangle(lengthwidth);
    Rectangle rectangle2 = new Rectangle(length, width);

    System.out.println(rectangle1.toString());
    System.out.println(rectangle2.toString());
  }
}
