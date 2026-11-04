
class Specifier {
    int length = 4;
    public int width = 5;
    private int area = 20;
    protected int perimeter = 18;
    private static int height = 20;
    static int getHeight() {
        return height;
    }
    int getArea() {
        return area;
    }

}

public class AccessSpecifier {
    public static void main(String[] args) {
        Specifier obj = new Specifier();
        int x =11;
        System.out.println("Length: " + x);
        String str = "Hello";
        // System.out.println("Length: " + obj.length);
        // System.out.println("Wi-'-dth: " + obj.width);
        // System.out.println("Width: " + Specifier.height); // static variable can be accessed using class name
        // System.out.println("Area: " + obj.getArea()); // private variable can be accessed using public method
        // System.out.println("Height: " + Specifier.getHeight()); // static method can be accessed using class name
        // System.out.println("Static Height: " + obj.getHeight()); // static method can be accessed using object
        // System.out.println("Perimeter: " + obj.perimeter); // protected variable can be accessed using object in same package
        // System.out.println("perimeter: " + Specifier.perimeter); // can't access


    }
}
