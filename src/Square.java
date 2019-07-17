public class Square extends Figure implements Print {
    private double a;
    private double area, perimeter;

    public Square (double lenght)
    {
        if(lenght>0)
            a = lenght;
        else
            System.out.println("BŁĄD");
    }

    @Override
    public double calculateArea() {
        return area =  a*a;
    }

    @Override
    public double calculatePerimeter() {
        return perimeter = a+a+a+a;
    }

    @Override
    public void print() {
        System.out.println("Kwadrat");
        System.out.println("Długość boku: " + a);
        System.out.println("Pole: " + area);
        System.out.println("Obwód: " + perimeter);
    }

}
