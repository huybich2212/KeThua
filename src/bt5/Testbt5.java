package bt5;

public class Testbt5 {
    public static void main(String[] args) {
        MyClass o1 = new MyClass();
        MyClass o2 = new MyClass();
        o2.X = 5;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, MyClass.X);
    }
    }


