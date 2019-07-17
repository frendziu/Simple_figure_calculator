public class Triangle extends Figure implements Print{
    private double a, b, c;
    private double area, perimeter;

    public Triangle (double x, double y, double z)
    {

        if(x>0 && y>0 && z>0) {
            a = x;
            b = y;
            c = z;
        }
        else
            System.out.println("BŁĄD");
    }

    @Override
    public double calculateArea() {
        return area =  ((Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c)))/4);
    }

    @Override
    public double calculatePerimeter() {
        return perimeter = a+b+c;
    }

    @Override
    public void print() {
        System.out.println("Trójkąt");
        System.out.println("Długości boków: " + a + " " + b + " " + c);
        System.out.println("Pole: " + area);
        System.out.println("Obwód: " + perimeter);
    }
}
