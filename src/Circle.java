public class Circle extends Figure implements Print{
    private double r;
    private double area, perimeter;

    public Circle (double radius)
    {
        if(radius>0)
            r = radius;
        else
            System.out.println("BŁĄD");
    }

    @Override
    public double calculateArea() {
       return area =  3.14*r*r;
    }

    @Override
    public double calculatePerimeter() {
       return perimeter = 2*3.14*r;
    }

    @Override
    public void print() {
        System.out.println("Koło");
        System.out.println("Promień: " + r);
        System.out.println("Pole: " + area);
        System.out.println("Obwód: " + perimeter);
    }
}
