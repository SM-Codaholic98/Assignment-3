class Area{
    double length, breadth;

    Area(double l, double b){
        length = l; breadth = b;
        System.out.println("Area of the rectangle = " + length * breadth);
    }
}

public class Qs_04 {
    public static void main(String[] args) {
        new Area(13.6, 8);
    }
}