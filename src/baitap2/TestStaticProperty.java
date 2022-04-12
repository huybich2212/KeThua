package baitap2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3", "Skyactiv3");
        System.out.println(Car.numberOfcars);
        Car car2 = new Car("mazda6", "Skyactiv6");
        System.out.println(Car.numberOfcars);


    }


}
