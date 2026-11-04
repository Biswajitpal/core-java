package package1;

import package2.Sumit;

public class Biswajit {
    public static void main(String[] args) {
        System.out.println("Biswajit");
        Sumit obj = new Sumit();
        System.out.println(obj.getClass().getName());
        obj.setData("Ram", 20);
        obj.display();
    }
}
