import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz figurę");
        System.out.println("1 - Koło");
        System.out.println("2 - Kwadrat");
        System.out.println("3 - Trójkąt");
        System.out.println("0 - Wyjście");

        int wybor = scanner.nextInt();
        while(wybor!=0)
        {
            switch (wybor){
                case 1:
                    System.out.println("Podaj długość promienia");
                    double radius = scanner.nextDouble();
                    Figure Circle = new Circle(radius);
                    Circle.calculateArea();
                    Circle.calculatePerimeter();
                    ((Circle) Circle).print();
                    break;
                case 2:
                    System.out.println("Podaj długość boku");
                    double lenght = scanner.nextDouble();
                    Figure Square = new Square(lenght);
                    Square.calculateArea();
                    Square.calculatePerimeter();
                    ((Square) Square).print();
                    break;
                case 3:
                    System.out.println("Podaj długości boków");
                    double x = scanner.nextDouble();
                    double y = scanner.nextDouble();
                    double z = scanner.nextDouble();
                    Figure Triangle = new Triangle(x, y, z);
                    Triangle.calculateArea();
                    Triangle.calculatePerimeter();
                    ((Triangle) Triangle).print();
                    break;
            }
            System.out.println("Co chcesz robić dalej?");
            System.out.println("1 - Koło");
            System.out.println("2 - Kwadrat");
            System.out.println("3 - Trójkąt");
            System.out.println("0 - Wyjście");
            wybor = scanner.nextInt();
        }

    }
}