public class WrapperClass {
    
    static String num = "123";
    public static void main(String[] args) {
        int x = Integer.parseInt(num); // String to int
        double y = Double.parseDouble(num); // String to double
        float z = Float.parseFloat(num); // String to float
        Integer value = Integer.valueOf(num);
        // System.out.println("Hello, World! "+x);
        // System.out.println("float "+z);
        // System.out.println("double "+y);
        // System.out.println(value);
        // System.out.println(Double.valueOf(101));
        // System.out.println(Integer.toBinaryString(5));
        // System.out.println(Integer.toHexString(50));
        // System.out.println(Integer.toOctalString(50));
        // System.out.println(Integer.parseInt("101", 2));
        // System.out.println(Integer.valueOf("101", 2)); // binary to decimal
        // System.out.println(Integer.valueOf("101", 8)); // octal to decimal
        // System.out.println(Integer.valueOf("101", 16)); // hex to decimal
        
    }
}
